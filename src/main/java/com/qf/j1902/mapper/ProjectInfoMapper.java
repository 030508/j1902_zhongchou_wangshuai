package com.qf.j1902.mapper;

import com.qf.j1902.pojo.ProjectInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectInfoMapper {
    boolean addPinfo(ProjectInfo projectInfo); // 添加 项目信息
    boolean updateBaocun(String  account ,String idcard,String entryName);  // 添加 项目信息-法人信息
    boolean updateTijao(@Param("account") String  account ,@Param("idcard") String idcard,@Param("zhangtai") String  zhangtai ,@Param("entryName") String entryName); // 提交 项目信息-法人信息
    boolean updateOne(ProjectInfo projectInfo ,String pifnfoid); //修改项目信息
    List<ProjectInfo> plist(String uname);  //查询用户所有发起的众筹
    ProjectInfo projectInfo (int pifnfoid); //查询单个发起的众筹
    List<ProjectInfo> plists();//查询所有众筹项目
}
