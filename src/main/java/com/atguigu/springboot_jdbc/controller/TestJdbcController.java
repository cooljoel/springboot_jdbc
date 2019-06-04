package com.atguigu.springboot_jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TestJdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/abc")
    public Map<String,Object> getAll(){
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from department");
        return mapList.get(0);
    }

}
