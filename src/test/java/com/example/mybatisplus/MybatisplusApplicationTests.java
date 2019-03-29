package com.example.mybatisplus;

import com.example.mybatisplus.entity.QdJied;
import com.example.mybatisplus.mapper.QdJiedMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplusApplicationTests {

    @Autowired
    private QdJiedMapper qdJiedMapper;

    @Test
    public void contextLoads() {

        List<QdJied> qdJiedList = qdJiedMapper.selectList(null);
        System.out.println(qdJiedList);
    }

}
