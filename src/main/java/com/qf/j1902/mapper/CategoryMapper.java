package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    List<Category> cateAll();
    Category catteOnes(@Param( "cateid") int cateid);
}
