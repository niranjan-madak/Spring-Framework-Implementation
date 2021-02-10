package com.madak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubController {
	
	@RequestMapping("/sub")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		
//		int i=Integer.parseInt(request.getParameter("t1"));
//		int j=Integer.parseInt(request.getParameter("t2"));
		
		int k=i-j;  // now to send this value on the view page we need object of model and view class.
	
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("result",k);
		
		return mv;

}}
