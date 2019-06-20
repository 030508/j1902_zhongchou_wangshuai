package com.qf.j1902.service;

import com.qf.j1902.pojo.ReturnTable;

import java.util.List;

public interface ReturnTableService {
    boolean addReturn(ReturnTable returnTable);
    List<ReturnTable> findall(String entryname);
}
