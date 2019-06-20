package com.qf.j1902;

import com.qf.j1902.mapper.AccountMapper;
import com.qf.j1902.mapper.ProjectInfoMapper;
import com.qf.j1902.mapper.ReturnTableMapper;
import com.qf.j1902.mapper.UserMapper;
import com.qf.j1902.pojo.Account;
import com.qf.j1902.pojo.ProjectInfo;
import com.qf.j1902.pojo.ReturnTable;
import com.qf.j1902.pojo.User;
import com.qf.j1902.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class conterller {
    @Test
    public void qur(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        UserMapper bean = ac.getBean(UserMapper.class);
        List<User> users = bean.users();
        for (User u:users
             ) {
            System.out.println(u);
        }

    }

    @Test
    public void qu12r(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        AccountMapper bean = ac.getBean(AccountMapper.class);
        Account uu = bean.findOne("qq");
        System.out.println(uu);

    }
    @Test
    public void qu14r(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        AccountService bean = ac.getBean(AccountService.class);
        boolean b = bean.updateOne("已认证", 1);

        System.out.println(b);

    }
    @Test
    public void qu15r(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        ProjectInfoMapper bean = ac.getBean(ProjectInfoMapper.class);
        ProjectInfo projectInfo = new ProjectInfo(12, "entyr", "synopsis", 101, 12, "headimg", "detailsimg", "selfintro", "detailed", "12345678901", "12345678", "zhangtai", "qq");
        boolean b = bean.addPinfo(projectInfo);


        System.out.println(b);

    }
    @Test
    public void qu16r(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        ReturnTableMapper bean = ac.getBean(ReturnTableMapper.class);
        ReturnTable returnTable = new ReturnTable("12", "s", 23, "q", "w", 3, 2, 1, "r", "22");
        boolean b = bean.addReturn(returnTable);
        System.out.println(b);
    }
    @Test
    public void qu17r(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        ProjectInfoMapper bean = ac.getBean(ProjectInfoMapper.class);
        boolean b = bean.updateTijao("111111", "1111111111", "shenhe", "entyr");
        System.out.println(b);
    }
}
