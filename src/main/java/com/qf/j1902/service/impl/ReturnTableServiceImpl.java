package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.ReturnTableMapper;
import com.qf.j1902.pojo.ReturnTable;
import com.qf.j1902.service.ReturnTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReturnTableServiceImpl implements ReturnTableService {
    @Resource
    private ReturnTableMapper returnTableMapper;
    @Override
    public boolean addReturn(ReturnTable returnTable) {
        return returnTableMapper.addReturn(returnTable);
    }

    @Override
    public List<ReturnTable> findall(String entryname) {
        return returnTableMapper.findall(entryname);
    }
}
