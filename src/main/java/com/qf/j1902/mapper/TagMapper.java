package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Tag;

import java.util.List;

public interface TagMapper {
     /*
    * tagid	int(11)
    cateid	int(11)
    tagname	varchar(20)
    * */
     Tag tagsOne(int cateid );
     List<Tag> tagCate(int cateid );
}
