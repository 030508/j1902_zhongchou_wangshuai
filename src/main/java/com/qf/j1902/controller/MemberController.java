package com.qf.j1902.controller;

import com.qf.j1902.pojo.*;
import com.qf.j1902.service.*;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.HTML;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private TagService tagService;
    @Autowired
    private ProjectInfoService projectInfoService;
    @Autowired
    private ReturnTableService returnTableService;
    @RequestMapping("accttype")
    public  String accttype(){
        return "accttype";
    }
    @RequestMapping("apply")
    public  String apply(HttpSession session, String type){
        session.setAttribute("type",type);
        return "apply";
    }
    @RequestMapping("apply-1")
    public  String apply1(HttpSession session, Model model, String name,String namber,String phone){
        String regex =  "^[1](([3][0-9])|([4][5,7,9])|([5][0-9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$";
        if (name ==null || name ==""  ){
            model.addAttribute("name","1");
            return "apply";
        }
      if (!name.matches("[\u4e00-\u9fa5]{2,4}")){
            model.addAttribute("name","2");
            return "apply";
        }
        if (namber ==null || namber =="" ){
            model.addAttribute("namber","1");
            return "apply";
        }
        if (namber.length()!=18  ){
            model.addAttribute("namber","2");
            return "apply";
        }
        if (phone ==null || phone =="" ){
            model.addAttribute("phone","1");
            return "apply";
        }
        if (phone.length()!=11 ||  !phone.matches(regex) ){
            model.addAttribute("phone","2");
            return "apply";
        }
        session.setAttribute("name",name);
        session.setAttribute("namber",namber);
        session.setAttribute("phone",phone);
        return "apply-1";
    }
    @RequestMapping(value = "apply-2" ,method = RequestMethod.POST)
    public  String apply2(@RequestParam("img") MultipartFile mf, HttpServletRequest request, HttpSession session, Model model){
        final String location = imageUpload(mf, request, model);
        if (location.equals("url")){
            return "apply-1";
        }else {
            session.setAttribute("img",location);
            return  "apply-2";
        }
    }




    @RequestMapping("apply-3")
    public  String apply3(HttpSession session,Model model,String email){
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        if (email ==null || !email.matches(regex) ){
            model.addAttribute("email","1");
            return "apply-2";
        }
        String aa = faSong(email);
        session.setAttribute("codell",aa);
        session.setAttribute("email",email);
        return "apply-3";
    }
    @RequestMapping(value = "fsyz" ,method = RequestMethod.GET)
    @ResponseBody
    public  String fsyz(HttpSession session){
        String email = (String)session.getAttribute("email");
        String aa = faSong(email);
        session.setAttribute("codell",aa);
        return aa;
    }
    private  String faSong( String email){
        int a=(int)((Math.random()*9+1)*100000);
        String aa=String.valueOf(a);
        HtmlEmail htmlEmail = new HtmlEmail();
        htmlEmail.setHostName("smtp.139.com");
        htmlEmail.setCharset("utf-8");
        try {
            htmlEmail.addTo(email);
            htmlEmail.setFrom("13772079049@139.com","千锋众筹");
            htmlEmail.setAuthentication("13772079049@139.com","030508qq");
            htmlEmail.setSubject("实名认证验证码");
            htmlEmail.setMsg("尊贵的会员：您的验证码为"+"<h3>"+aa+"</h3>");
            htmlEmail.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
        return aa;
    }
    @RequestMapping("code")
    public  String code(HttpSession session,Model model,String code){
        String codell = (String) session.getAttribute("codell");
        if (!codell.equals(code)){
                    model.addAttribute("apply-3","1");
        }
        String type = (String)session.getAttribute("type");
        String name = (String)session.getAttribute("name");
        String namber = (String)session.getAttribute("namber");
        String phone = (String)session.getAttribute("phone");
        String img = (String)session.getAttribute("img");
        String email = (String)session.getAttribute("email");
        String uname = (String)session.getAttribute("uname");
        String codeon = "审核中...";
        Account account = new Account(type, name, namber, phone, img, email,uname,codeon);
        boolean b = accountService.addAccount(account);
        if( code !=null){
            session.setAttribute("codeon",codeon);
            session.setAttribute("type",type);
        }
        return "member";
    }

    @RequestMapping("minecrowdfunding")
    public  String minecrowdfunding(){
        return "minecrowdfunding";
    }

    @RequestMapping("start")
    public  String start(){
        return "start";
    }
    @RequestMapping("start-step-1")
    public  String start_step1(Model model){
        List<Category> cateAll = categoryService.cateAll();
        model.addAttribute("cateAll",cateAll);
        return "start-step-1";
    }

    @RequestMapping(value = "tags" ,method = RequestMethod.POST)
    @ResponseBody
    public  List<Tag> tags(int id){
        List<Tag> tags = tagService.tagCate(id);
        return tags;
    }
    @RequestMapping("start-step-2")
    public  String startStep2(@RequestParam("headimg") MultipartFile mf,@RequestParam("detailsimg") MultipartFile mf2,
                              int tagId,String entryName,String synopsis, @RequestParam(value = "amount",defaultValue = "0") double amount ,int days,String selfintro,
                              String detailed,String call ,String centercall,String zhangtai,String uname, HttpServletRequest request,Model model,HttpSession session){
        String headimg = imageUpload(mf, request, model);
        String detailsimg = imageUpload(mf2, request, model);
        if (headimg.equals("url")){
            model.addAttribute("headimg","1");
            return "start-step-1";
        }
        if (detailsimg.equals("url")){
            model.addAttribute("detailsimg","1");
            return "start-step-1";
        }
        if (entryName==null || entryName==""|| synopsis==null || synopsis==""||amount==0 || days==0||
                selfintro==null || selfintro==""|| detailed==null || detailed==""||call==null || call==""||
                uname==null || uname==""){
            model.addAttribute("pr","1");
            return "start-step-1";
        }
        model.addAttribute("entryname",entryName);
        ProjectInfo projectInfo = new ProjectInfo(tagId, entryName, synopsis, amount, days,headimg,detailsimg, selfintro, detailed, call, centercall, zhangtai, uname);
        boolean b = projectInfoService.addPinfo(projectInfo);
        return "start-step-2";
    }
    @RequestMapping(value = "addRetun",method = RequestMethod.POST)
    @ResponseBody
    public  void addRetun(@RequestParam("explain") MultipartFile mf,String entryname,String returnType,
                          @RequestParam(value = "amount",defaultValue = "0") double amount,String returnContent,
                          @RequestParam(value = "quantities",defaultValue = "1") int quantities,@RequestParam(value = "quota",defaultValue = "1")int quota,
                          @RequestParam(value = "double",defaultValue = "0") double freight,
                            String receipt,String returnTime, HttpServletRequest request, Model model,HttpSession session){
        String explain = imageUpload(mf, request, model);
       /* if (explain.equals("url")){
            model.addAttribute("img","2");
            return ;
        }
        if (entryname==null || entryname=="" || returnType==null || returnType=="" ||
                returnContent==null || returnContent=="" || explain==null || explain==""
               ||receipt==null || receipt=="" || returnTime==null || returnTime==""){
            model.addAttribute("rt","2");
            return ;
        }*/
        ReturnTable returnTable = new ReturnTable(entryname,returnType,amount,returnContent,explain,quantities,quota,freight,receipt,returnTime);
        boolean b = returnTableService.addReturn(returnTable);
        return ;
    }
    private String imageUpload(MultipartFile mf, HttpServletRequest request, Model model) {
        String path = request.getRealPath("/upload");
        String fileName = mf.getOriginalFilename();
        String location = path +"/"+ fileName;
        String regex_img = ".+(.JPEG|.jpeg|.JPG|.jpg|.png|.PNG)$";
        if (fileName == null || fileName=="" || !fileName.matches(regex_img)){
            model.addAttribute("img","1");
            return "url";
        }
        File f = new File(location);
        try {
            f.createNewFile();
            mf.transferTo(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    @RequestMapping("start-step-3")
    public  String start_step3(String entryname,Model model){
        model.addAttribute("entryname",entryname);
        return "start-step-3";
    }
    @RequestMapping("start-step-4")
    public  String start_step4(String  action,String entryname,String account,String idcard ){
        if ("tijiao".equals(action)){
            boolean b = projectInfoService.updateBaocun(account, idcard, entryname);
        }
        System.out.println(account);
        boolean b = projectInfoService.updateTijao(account, idcard, "审核中", entryname);
        return "start-step-4";
    }


}
