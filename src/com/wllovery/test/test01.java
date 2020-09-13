package com.wllovery.test;

import com.wllovery.domain.Student;
import com.wllovery.service.Impl.StudentServiceImpl;
import com.wllovery.service.StudentService;
import com.wllovery.util.ServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class test01 {
    public static void main(String[] args) throws IOException {
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());

//        Student s = new Student();
//        s.setId("A0008");
//        s.setName("gyc");
//        s.setAge(24);
//        ss.save(s);
        Student s = ss.getById("A0003");
        System.out.println(s);

    }
}
