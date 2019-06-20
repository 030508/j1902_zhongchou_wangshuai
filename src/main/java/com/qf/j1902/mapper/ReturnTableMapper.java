package com.qf.j1902.mapper;

import com.qf.j1902.pojo.ReturnTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReturnTableMapper {
        boolean addReturn(ReturnTable returnTable);

    List<ReturnTable> findall( @Param("entryname") String entryname);


}
