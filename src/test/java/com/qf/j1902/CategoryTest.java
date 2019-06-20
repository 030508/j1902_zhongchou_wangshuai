package com.qf.j1902;

import com.qf.j1902.mapper.CategoryMapper;
import com.qf.j1902.mapper.TagMapper;
import com.qf.j1902.pojo.Category;
import com.qf.j1902.pojo.Tag;
import com.qf.j1902.service.TagService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CategoryTest {


    @Test
    public void categoryTestAll(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        CategoryMapper bean = ac.getBean(CategoryMapper.class);
        List<Category> all = bean.cateAll();
        for (Category c:all) {
            System.out.println(c);
        }
    }
    @Test
    public void categoryTest2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        CategoryMapper bean = ac.getBean(CategoryMapper.class);
        Category ones = bean.catteOnes(3);
        System.out.println(ones);
    }
    @Test
    public void tagTest1(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        TagMapper bean = ac.getBean(TagMapper.class);
        List<Tag> tags = bean.tagCate(3);
        for (Tag t: tags
             ) {
            System.out.println(t);
        }
    }
    @Test
    public void tagTest2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        TagService bean = ac.getBean(TagService.class);
        List<Tag> tags = bean.tagCate(3);
        for (Tag t: tags
        ) {
            System.out.println(t);
        }
    }

}




