package com.wllovery.service;

import com.wllovery.domain.Student;

public interface StudentService {
    public Student getById(String id);
    public void save(Student stu);
}
