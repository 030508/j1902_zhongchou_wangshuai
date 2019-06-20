package com.qf.j1902.controller;

import com.qf.j1902.pojo.Account;
import com.qf.j1902.pojo.User;
import com.qf.j1902.service.AccountService;
import com.qf.j1902.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @Autowired
    private AccountService accountService;
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("login")
    public String login(HttpSession session){
        session.invalidate();
        return "login";
    }
    @RequestMapping("reg")
    public String reg(){
        return "reg";
    }
    /*注册验证*/
    @RequestMapping(value = "zhuce",method = RequestMethod.GET)
    public String zhuce(Model model,User user){
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        if (user.getEmail() ==null ||  user.getEmail() =="" || !user.getEmail() .matches(regex) ){
            model.addAttribute("uu","1");
            return "reg";
        }
        if (user.getCustomer() == null || user.getUname() ==null || user.getUname() =="" || user.getPassword()==null || user.getPassword()==""){
            model.addAttribute("uu","2");
            return "reg";
        }
        List<User> users = userService.users();
        for (User  u:users) {
            if (u.getUname().equals(user.getUname()) && u.getCustomer().equals(user.getCustomer())){
                model.addAttribute("uu","3");
                return "reg";
            }
        }
        boolean b = userService.addUser(user);
        return "login";
    }
   /* @RequestMapping("member")
    public String member(){
        return "member";
    }
    @RequestMapping("main")
    public String main(){
        return "main";
    }*/
   /*登录验证*/
    @RequestMapping(value = "denglu",method = RequestMethod.GET)
    public String denglu(Model model, HttpSession session, User user){
        if (user.getUname() ==null  ||  user.getPassword()==null){
            model.addAttribute("uu","1");
            return  "longin";
        }
        List<User> users = userService.users();
        if(users.contains(user)){
            session.setAttribute("uname",user.getUname());
            if ("会员".equals(user.getCustomer())){
                List<Account> all = accountService.findAll();
                for (Account one  :all ) {
                    if (one.getUname().equals(user.getUname())){
                        String codeon = one.getCode();
                        String type = one.getType();
                        session.setAttribute("codeon",codeon);
                        session.setAttribute("type",type);
                    }
                }
                return  "member";
            }else {
                return "main";
            }
        }
        model.addAttribute("uu","2");
        return "login";
    }

    @RequestMapping("member")
    public String member(Model model){

        return "member";
    }
    @RequestMapping("user")
    public String user(Model model){
        List<User> users = userService.users();
        model.addAttribute("users",users);
        return "user";
    }
    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser(int id){
        boolean b = userService.deleteUser(id);
        return b? "1" :"2";
    }
    @RequestMapping("edit")
    public String edit(Model model,int id){
        User user = userService.findUser(id);
        model.addAttribute("user",user);
        return "edit";
    }
    @RequestMapping("updateUser1")
    @ResponseBody
    public String updateUser1(User user){
        boolean b = userService.updateUser(user);
        return b? "1" :"2";
    }
    @RequestMapping(value = "zengjiaUser",method = RequestMethod.POST)
    @ResponseBody
    public String zengjiaUser(Model model,User user){
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        if (!user.getEmail().matches(regex)){
            return "3";
        }
        List<User> users = userService.users();
        user.setCustomer("管理");
        if (users.contains(user)){
            return "2";
        }
        boolean b = userService.addUser(user);
        return "1";
    }
    @RequestMapping("add")
    public String add(Model model){
        return "add";
    }
    @RequestMapping("assignRole")
    public String assignRole(Model model){
        return "assignRole";
    }
    @RequestMapping("role")
    public String role(Model model){
        return "role";
    }
    @RequestMapping("project_type")
    public String project_type(Model model){

        return "project_type";
    }
    @RequestMapping("tag")
    public String tag(Model model){

        return "tag";
    }
    @RequestMapping("message")
    public String message(Model model){

        return "message";
    }
    @RequestMapping("advertisement")
    public String advertisement(Model model){

        return "advertisement";
    }
    @RequestMapping("process")
    public String process(Model model){

        return "process";
    }
    @RequestMapping("type")
    public String type(Model model){

        return "type";
    }
    @RequestMapping("cert")
    public String cert(Model model){

        return "cert";
    }
    @RequestMapping("auth_cert")
    public String auth_cert(Model model){
        List<Account> all = accountService.findAll();
            model.addAttribute("all",all);
        return "auth_cert";
    }
    @RequestMapping("real_name")
    public String real_name(Model model,String id ){
        Account one = accountService.findOne(id);
        model.addAttribute("one",one);
        return "shenhe";
    }
    @RequestMapping(value = "shenhe",method = RequestMethod.GET)
    @ResponseBody
    public String shenhe(String action,int id ){

     /*  String code = "认证失败";
        if ("adopt".equals(action)){
            code = "已认证";
        }else if ("reject".equals(action)){
            code = "认证失败";
        }*/
        String code = "adopt".equals(action) ? "已认证":"认证失败";
        boolean b  = accountService.updateOne(code, id);
        /*if (b){
        return "1";
    }
        return "2";*/
            return  b? "1":"2";
}
/*    @RequestMapping(value = "real_name",method = RequestMethod.GET)
    @ResponseBody
    public String real_name(String action,int id ){

      *//*  String code = "认证失败";
        if ("adopt".equals(action)){
            code = "已认证";
        }else if ("reject".equals(action)){
            code = "认证失败";
        }*//*
        String code = "adopt".equals(action) ? "已认证":"认证失败";
        boolean b  = accountService.updateOne(code, id);
        *//*if (b){
            return "1";
        }
        return "2";*//*
        return  b? "1":"2";
    }*/
}
