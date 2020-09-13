package com.wllovery.dao;

import com.wllovery.domain.Student;

import java.util.List;

public interface StudentDao {
//    List<Student> select_students();
//    List<Student> select_studentsAll();
//    int insert_student(Student stu);

    public Student getById(String id);
    public void save(Student stu);
}
