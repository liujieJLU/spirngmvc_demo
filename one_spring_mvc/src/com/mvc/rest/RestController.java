package com.mvc.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestController {
	
	@RequestMapping(value="/login/{user}",method=RequestMethod.GET)
	public ModelAndView myMethod(@PathVariable("user")String user,ModelMap modelMap)throws Exception{
		modelMap.put("loginUser", user);
		return new ModelAndView("/login/hello",modelMap);
		
	}
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)  
    public String registPost() {  
        return "/welcome";  
    }  
	

}
