package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.ProjectInfoMapper;
import com.qf.j1902.pojo.ProjectInfo;
import com.qf.j1902.service.ProjectInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Resource
    private ProjectInfoMapper projectInfoMapper;
    @Override
    public boolean addPinfo(ProjectInfo projectInfo) {
        return projectInfoMapper.addPinfo(projectInfo);
    }

    @Override
    public boolean updateBaocun(String account, String idcard, String entryName) {
        return projectInfoMapper.updateBaocun(account,idcard,entryName);
    }

    @Override
    public boolean updateTijao(String account, String idcard, String zhangtai, String entryName) {
        return projectInfoMapper.updateTijao(account,idcard,zhangtai,entryName);
    }

    @Override
    public boolean updateOne(ProjectInfo projectInfo, String pifnfoid) {
        return projectInfoMapper.updateOne(projectInfo,pifnfoid);
    }

    @Override
    public List<ProjectInfo> plist(String uname) {
        return projectInfoMapper.plist(uname);
    }

    @Override
    public ProjectInfo projectInfo(int pifnfoid) {
        return projectInfoMapper.projectInfo(pifnfoid);
    }

    @Override
    public List<ProjectInfo> plists() {
        return projectInfoMapper.plists();
    }
}
