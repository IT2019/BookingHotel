package minhson.springofson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import minhson.springofson.dao.EmpDao;
import minhson.springofson.model.Emp;
@Controller
public class HomeController {
	@Autowired
    private EmpDao empDao;
	
	@RequestMapping("/hello")
    public String hello(Model model) {
        
        model.addAttribute("greeting", "Hello Spring MVC");
        
        return "helloworld";
        
    }
 
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        
        List<Emp> list = empDao.listEmp();
        model.addAttribute("emps", list);
        return "index";
    }
}
