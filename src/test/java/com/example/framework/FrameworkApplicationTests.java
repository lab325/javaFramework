package com.example.framework;

import com.example.framework.mapper.LearningMapper;
import com.example.framework.pojo.Learning;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrameworkApplicationTests {

  @Autowired
  private LearningMapper learningMapper;

  @Test
  void contextLoads() {
    Learning learning = new Learning();
    learning.setName("test");
    learningMapper.insert(learning);
  }

}
