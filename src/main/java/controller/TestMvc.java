package controller;


import demain.Addcity;
import demain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2016/12/5.
 */
@Controller
@RequestMapping("/hello")
public class TestMvc{
    @RequestMapping(value = "/add",method = RequestMethod.GET)//提交的方法RequestMethod.GET。
    public String add(){
        System.out.println("rrrrr");
        return "index";
    }
    @RequestMapping("/del")
    public String del(){
        System.out.println("ttt");
        return "index";
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") int id){
        System.out.println(id);
        return "index";
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public String order(@PathVariable("id") int id){
        System.out.println(id);
        return "index";
    }
    @RequestMapping(value = "/order/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id){
        System.out.println(id);
        return "index";
    }
    @RequestMapping(value = "/tj", method = RequestMethod.POST)
    public String tj(@RequestParam("name") String name, int pwd,String addcity){
        System.out.println(name+":"+pwd+":"+addcity);
        return "Test";
    }
    @RequestMapping(value = "/servlet", method = RequestMethod.POST)
    public ModelAndView sevlet(HttpServletRequest req, HttpServletResponse resp, HttpSession session){
        String name = req.getParameter("name");
        int pwd = Integer.parseInt(req.getParameter("pwd"));
        String city = req.getParameter("addcity.city");
        Addcity addc=new Addcity();
        addc.setCity(city);
        User u=new User();
        u.setName(name);
        u.setPwd(pwd);
        u.setAddcity(addc);
        ModelAndView m=new ModelAndView("Test");
        m.addObject("user",u);
        System.out.println(name+":"+pwd+":"+city);
        return m;
    }
    @RequestMapping(value = "/servletdo", method = RequestMethod.POST)
    public String sevletdo(@Valid User user,BindingResult bindingResult){
       if( bindingResult.hasErrors()){
           List<FieldError> fieldErrors = bindingResult.getFieldErrors();
           for(FieldError fieldError:fieldErrors){
               System.out.println(fieldError.getField()+"："+fieldError.getDefaultMessage());
           }
           return "index";
       }

        return "Test";
    }
}
