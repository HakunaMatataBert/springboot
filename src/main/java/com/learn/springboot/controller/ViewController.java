package com.learn.springboot.controller;

import com.learn.springboot.services.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/view")
public class ViewController {
    @Autowired/*按照类型ByType注入 @Resource是按照名字ByName注入*/
    private StudentsServices studentsServices;


    @RequestMapping("/toLogin")
    public ModelAndView Login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("name","张三");
        modelAndView.addObject("data",studentsServices.getAllStudents().get(0).getAll());
        modelAndView.addObject("datasize",studentsServices.getAllStudents().size());

        return modelAndView;
    }

    @RequestMapping("/testLogin")
    public String testLogin(Model model){
        model.addAttribute("name","李四");
        model.addAttribute("datasize",studentsServices.getAllStudents().size());

        return "login";
    }
    @RequestMapping(value = "/finish")
    @ResponseBody
    public String LoginLFinish(String name) {
        String test  = name;
        String aa =  new String("dsds");
        String bb = aa+"vvvvv";
        System.err.println(name);
        System.err.println("测试成功,接受的数据是："+name);
        return name+"123";
    }
}
