package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.TagMapper;
import com.qf.j1902.pojo.Tag;
import com.qf.j1902.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TagServiceImpl  implements TagService {
    @Resource
    private TagMapper tagMapper;
    @Override
    public List<Tag> tagCate(int cateid) {
        return tagMapper.tagCate(cateid);
    }
}
