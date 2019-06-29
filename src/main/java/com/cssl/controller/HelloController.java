package com.cssl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cssl.pojo.Dept;
import com.cssl.service.DeptService;

@Controller
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController：");
	}

	@GetMapping("/hello.html")
	public String hello(Model model,String user) {
		System.out.println("hello:");
		model.addAttribute("user",user);
		/*return "forward:/success.jsp";*/
		return "success";
	}
	
	@Autowired
	private DeptService ds;
	
	@PostMapping("/login")
	public String login(@Validated Dept dept/*,User2 u2*/,BindingResult br) {
		if(br.hasErrors()) {
			List<FieldError> error = br.getFieldErrors();
			for (FieldError e : error) {
				System.out.println("error:"+e.getDefaultMessage());
			}
			return "model";
		}
/*		Dept dept=new Dept();
		d.setDname("啊啊");
		//把user类属性拷贝到dept类里面去
		BeanUtils.copyProperties(u, d);*/
		if(ds.addDept(dept)>0) {
			return "success";
		}
		return "model";
	}
}
