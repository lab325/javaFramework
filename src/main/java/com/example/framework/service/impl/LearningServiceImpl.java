package com.example.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.framework.mapper.LearningMapper;
import com.example.framework.pojo.Learning;
import com.example.framework.service.LearningService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service("LearningService")
public class LearningServiceImpl extends ServiceImpl<LearningMapper, Learning> implements LearningService {

  @Autowired
  LearningMapper learningMapper;

  @Override
  @Transactional
  public void addLearning(Learning learning) {
    learningMapper.insert(learning);
    List<Map> maps = learningMapper.testXmlSql();
    for (Map map : maps) {
      System.out.println(map);
    }
  }
}
