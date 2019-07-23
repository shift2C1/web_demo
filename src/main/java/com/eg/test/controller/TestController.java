package com.eg.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.eg.test.entity.Test;
import com.eg.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestMapper testMapper;
    @PostMapping("/test")
    public String test(){
        JSONObject jsonObject=new JSONObject();
        Test test=testMapper.selectByPrimaryKey("1001");
        jsonObject.put("data",test);
        return jsonObject.toJSONString();
    }
}
