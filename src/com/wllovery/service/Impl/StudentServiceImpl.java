package com.wllovery.service.Impl;

import com.wllovery.dao.Impl.studentDaoImpl;
import com.wllovery.dao.StudentDao;
import com.wllovery.domain.Student;
import com.wllovery.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao = new studentDaoImpl();
    @Override
    public Student getById(String id) {
        Student s = dao.getById(id);
        return s;
    }

    @Override
    public void save(Student stu) {
        dao.save(stu);
    }
}
