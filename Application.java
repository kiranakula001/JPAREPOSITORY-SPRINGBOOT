package com.spring;

//import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;

import com.spring.entity.User;
import com.spring.repo.UserRepository;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepository rep= context.getBean(UserRepository.class);
		
	/*	User r5= new User(11,"NIYA",27,"female","mexico");	
		User r6= new User(64,"tommy",21,"male","france");
		User r7= new User(34,"divya",35,"female","chitagong");
		User r8= new User(74,"john",22,"male","hyderabadi");
		
		rep.saveAll(Arrays.asList(r5,r6,r7,r8));
		
		List<User> users =rep.findByGender("female");
		users.forEach(user->{
			System.out.println(user);
			System.out.println();
			});
		System.out.println("Data inserted To db!!!!");
		
		System.out.println("------------------------------");
		
		System.out.println("Sorted By age:");
		
		users= rep.findAll(Sort.by("age"));
		users.forEach(user->{
			System.out.println(user);
			System.out.println();
			});
			
		System.out.println("------------------------------");
		
		users= rep.findAll(Sort.by("name","location").descending());
		users.forEach(user->{
			System.out.println(user);
			System.out.println();
			});*/
		
		PageRequest pageRequest= PageRequest.of(1,4);
		Page<User>  pageData = rep.findAll(pageRequest);
		List<User> users =pageData.getContent();
		users.forEach((n)->System.out.println(n));
	}

}
