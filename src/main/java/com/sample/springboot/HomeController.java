package com.sample.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("title", "社員情報管理システム");
		mav.addObject("search", new Employee());
		return mav;
	}

	//実装中
//	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
//	public ModelAndView show(@PathVariable Long id, ModelAndView mav) {
//		mav.setViewName("show");
//		mav.addObject("employee", employeeService.findOne(id));
//		return mav;
//	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView show(@PathVariable Long id, ModelAndView mav) {
		mav.setViewName("show");
		mav.addObject("employee", employeeService.findOne(id));
		return mav;
	}

	@RequestMapping(value = "/edit/", method = RequestMethod.GET)
	public ModelAndView show(ModelAndView mav) {
		mav.setViewName("showAll");
		mav.addObject("employees", employeeService.findAll());
		return mav;
	}

}
