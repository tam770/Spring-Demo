package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.student;

@Controller

public class studentController
{

	@GetMapping("/showme")
	public String getInfo(Model md){
		//create studen model object
		 student st=new student();
		
		 //add model
		 md.addAttribute("Student", st);
		 System.out.println("hi spring");
	
		 return "student-form";
		
		
	   }
	 @RequestMapping("/showme2")
	 public String processform(@ModelAttribute("Student") student  s,Model md)
	 {
		 if(s.getFname().equals("tukaram"))
		 {
			 System.out.println(s.getCountry());
		     return "student-confoim";
		 }
		 
		 String s2="password is wrong";
		 md.addAttribute("massege", s2);
		 return "student-form";
		 
	 }
}
