package com.example.MyfirstProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping(value = "/getthis")
	public String getThis() {
		return "Hellow World";
	}
	
	@GetMapping(value = "/getname")
	public String getName() {
		return "arun arsu";
	}
	
	@GetMapping(value = "/get/{n}") 
	public String getHellow(@PathVariable String n) {
		return n+" arsu";
	}
	
	@GetMapping(value = "/eveORodd/{n}") 
	public String getEve(@PathVariable int n) {
		if(n%2==0) {
			return n+" = even";
		}
		else {
			return n+" = odd";
		}
	}
	
	@GetMapping(value = "/max/{a}/{b}/{c}")
	public String getMax(@PathVariable int a, @PathVariable int b, @PathVariable int c ) {
		if(a>b && a>c) {
			return a+" = max";
		}
		else if(b>c && b>a) {
			return b+" = max";
		}
		else {
			return c+" = max";
		}
	}
	
	@GetMapping(value = "/prime/{a}/{b}")
	public ArrayList<Integer> getPrime(@PathVariable int a, @PathVariable int b) {
		ArrayList<Integer> pr = new ArrayList<>();
		for(int i=a; i<=b; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				 pr.add(i);
			}
		}  return pr;
	}
	
	@GetMapping(value = "/char/{a}")
	public char getChar(@PathVariable String a) {
		return a.charAt(a.length()-1);
	}
	
	//use to access
	@GetMapping(value = "/getAccess")
	public String getAcc(@RequestParam String userName, @RequestParam String password ) {
		if(userName.equals("Onesoft") && password.equals("994030")) {
			return "login success";
		}
		else {
			return "login fail";
		}
	}
	
	@GetMapping(value = "/getElg")
	public String getVote(@RequestParam int age) {
		if(age>=18) {
			return "Eligiable for vote";
		}
		else {
			return "Not Eligiable for vote";
		}
	}
	
	@GetMapping(value = "/getObject")
	public Car getObject(@RequestBody Car c) {
		return c;
	}
	
	@GetMapping(value = "/getObjectArr")
	public Car[] getObjectArr(@RequestBody Car [] a) {
		return a;
	}
	
	@GetMapping(value = "/getMax")
	public Car car(@RequestBody List<Car> c) {
		return c.stream()
				.max(Comparator.comparing(Car::getPrice)).get();
	}
	@GetMapping(value = "/getBrand/{a}")
	public List<Car> car1(@RequestBody List<Car> ca, @PathVariable String a) {
		return ca.stream()
                .filter(c -> c.getName().equals(a))
                .collect(Collectors.toList());
	}
	
	@GetMapping(value="/getD")
	public String getd(@RequestParam String a) {
	    DateTimeFormatter input = DateTimeFormatter.ofPattern("ddMMMM,yyyy");   //input is using string format
	    LocalDate date = LocalDate.parse(a, input);           //using to convert int date format
	    DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy-MM-dd");   //int format
	    return date.format(output);
	}
	
	

}
