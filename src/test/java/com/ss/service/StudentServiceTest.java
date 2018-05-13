package com.ss.service;

import com.ss.Dao.UserDao;
import com.ss.Dao.VocationDao;
import com.ss.pojo.Vocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentServiceTest {

    @Resource
    StudentService stuService;
    @Resource
    VocationDao vocationDao;
    @Test
    public void getSize() {
        //int size =studentService.getSize();
        //System.out.println(size);
    }

    @Test
    public void findById() {

        //System.out.println(studentService.findById(2));
    }

    @Test
    public void onWorkSize() {
        System.out.println(stuService.onWorkSize());
    }


    @Test
    public void findByIdVoca() {

        System.out.println(vocationDao.findById(2));
    }


}