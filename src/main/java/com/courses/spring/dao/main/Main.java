package com.courses.spring.dao.main;


import com.courses.spring.dao.impls.JdbcSubjectDao;
import com.courses.spring.dao.interfaces.StudentDao;
import com.courses.spring.dao.objects.Subject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] arg) {

        Subject subject = new Subject("Pop1");

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        JdbcSubjectDao subjectDao = (JdbcSubjectDao)context.getBean("jdbcSubjectDao");
        StudentDao studentDao = (StudentDao) context.getBean("jdbcStudentDao");
        System.out.println(subjectDao.getSubjectById(2));
        System.out.println(studentDao.getStudentWithMark(1));

        /*ApplicationContext context = new AnnotationConfigApplicationContext(BeenConfig.class);
        SubjectDao obj = (SubjectDao) context.getBean("");
        System.out.println(obj.getSubjectById(3));*/

    }
}
