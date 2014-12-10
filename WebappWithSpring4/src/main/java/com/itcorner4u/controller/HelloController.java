package com.itcorner4u.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itcorner4u.databean.Employee;
import com.itcorner4u.form.InsertForm;
import com.itcorner4u.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private HttpServletRequest request;
	
	public HttpServletRequest getRequest() {
		System.out.println("Inside getRequest method");
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		System.out.println("Inside setRequest method");
		this.request = request;
	}



	@RequestMapping("/hello")
	public ModelAndView loginpage(Model model)
	{
		System.out.println("in authenticate get method controller");
		//model.addAttribute("uauth",new UserAuthentication());
		ModelAndView mav = new ModelAndView();
		Employee emp = helloService.getEmployee();
		model.addAttribute("empdetails", emp);
		mav.setViewName("hello");
		return mav; 
	}

	@RequestMapping("/insert")
	public ModelAndView callingInsertPage(Model model){
		ModelAndView mav = new ModelAndView();
		mav.addObject("insertdata", new InsertForm());
		mav.setViewName("insertData");;
		System.out.println("Inside calling method");
		return mav;
	}


	@RequestMapping("/insertClicked")
	public ModelAndView insertClicked(@ModelAttribute InsertForm loginForm, Model model){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		Employee emp = new Employee();
			emp.setFirstname(loginForm.getFirstname());
			emp.setLastname(loginForm.getLastname());
			emp.setEmail(loginForm.getEmail());
			System.out.println(helloService.setEmployee(emp));
		System.out.println(loginForm.getFirstname());
		System.out.println(loginForm.getLastname());
		System.out.println(loginForm.getEmail());
		
		return mav;
	}

	
	public ModelAndView insertPage(Model model){
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
}