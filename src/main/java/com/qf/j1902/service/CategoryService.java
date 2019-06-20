package com.qf.j1902.service;

import com.qf.j1902.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryService {
    List<Category> cateAll();
    Category catteOnes(@Param( "cateid") int cateid);
}
