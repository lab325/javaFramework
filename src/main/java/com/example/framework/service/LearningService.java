package com.example.framework.service;

import com.alibaba.fastjson.JSONObject;
import com.example.framework.mapper.LearningMapper;
import com.example.framework.pojo.Learning;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(tags = "Learning接口")
public class LearningService {

  @Autowired
  private LearningMapper learningMapper;

  @PostMapping("/addLearning")
  @ApiOperation("添加Learning接口")
  @ApiImplicitParams({
          @ApiImplicitParam(name = "name", value = "名称", dataType = "string")
  })
  public JSONObject addLearning(@RequestBody Map map) {
    JSONObject result = new JSONObject();
    String name = (String) map.get("name");
    Learning learning = new Learning();
    learning.setName(name);
    int insert = learningMapper.insert(learning);
    if (insert == 1) {
      result.put("status", 200);
    } else {
      result.put("status", 400);
    }
    return result;
  }

}
