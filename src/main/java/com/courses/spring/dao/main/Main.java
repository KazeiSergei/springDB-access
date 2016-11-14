package com.courses.spring.dao.main;


import com.courses.spring.dao.impls.JdbcSubjectDao;
import com.courses.spring.dao.interfaces.StudentDao;
import com.courses.spring.dao.objects.Student;
import com.courses.spring.dao.objects.Subject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] arg) {



        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //JdbcSubjectDao subjectDao = (JdbcSubjectDao)context.getBean("jdbcStudentDao");
        StudentDao studentDao = (StudentDao) context.getBean("jdbcStudentDao");
        //System.out.println(subjectDao.getSubjectById(2));
        for (Student student: studentDao.getAll()){
            System.out.println(student);
        }

        /*ApplicationContext context = new AnnotationConfigApplicationContext(BeenConfig.class);
        SubjectDao obj = (SubjectDao) context.getBean("");
        System.out.println(obj.getSubjectById(3));*/

    }
}
