package controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.CustomerValidation;

@Controller
public class CustomerController {
    
	@InitBinder
	   public void initBinder(WebDataBinder wbd)
	   {
			StringTrimmerEditor ste=new StringTrimmerEditor(true);
		    wbd.registerCustomEditor(String.class, ste);	
	   }
	
	@RequestMapping("/Customer")
	public String getcust(Model md)
	{
		md.addAttribute("customer",new CustomerValidation());
		return"Customer-form";
	}
	
	@RequestMapping("/showmecust")
	public String reg( @Valid @ModelAttribute("customer") CustomerValidation c,BindingResult BR)
	{
		if(BR.hasErrors())
		{
		return "Customer-form";
		}
		else
		{
		return"Custmerinfo";
		}
	}
	// validation used remove the starting and ending white space
	
}
