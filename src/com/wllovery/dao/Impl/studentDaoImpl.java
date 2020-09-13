package com.wllovery.dao.Impl;

import com.wllovery.dao.StudentDao;
import com.wllovery.domain.Student;
import com.wllovery.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class studentDaoImpl implements StudentDao {
    @Override
    public Student getById(String id) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        Student s = session.selectOne("com.wllovery.dao.StudentDao.getById", id);
        return s;
    }

    @Override
    public void save(Student stu) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        session.insert("com.wllovery.dao.StudentDao.save",stu);
        session.commit();
    }
}
