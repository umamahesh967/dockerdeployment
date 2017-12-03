package com.stackroute.deploymentdashboard;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

        @Value("${server.port}")
        private String port_no;


        @Value("${app.prop1}")
        private String project_name;


    @RequestMapping("/")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	model.addAttribute("project_name", project_name);
    	model.addAttribute("port_no", port_no);	
    	return "view";
    }
}


