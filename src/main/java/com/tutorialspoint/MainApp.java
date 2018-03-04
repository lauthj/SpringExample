package com.tutorialspoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.StudentJDBCTemplate;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      StudentJDBCTemplate studentJDBCTemplate = 
         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      studentJDBCTemplate.create("Zara", 11);
      studentJDBCTemplate.create("Nuha", 2);
      studentJDBCTemplate.create("Ayan", 15);

      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentJDBCTemplate.listStudents();
      
      for (Student record : students) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      studentJDBCTemplate.update(10, 20);

      System.out.println("----Listing Record with ID = 2 -----" );
      Student student = studentJDBCTemplate.getStudent(10);
      System.out.print("ID : " + student.getId() );
      System.out.print(", Name : " + student.getName() );
      System.out.println(", Age : " + student.getAge());
      
      System.out.println("deleting all 3");
      studentJDBCTemplate.delete(10);
      studentJDBCTemplate.delete(11);
      studentJDBCTemplate.delete(12);
      studentJDBCTemplate.delete(13);
      studentJDBCTemplate.delete(14);
      studentJDBCTemplate.delete(15);
      studentJDBCTemplate.delete(16);
      studentJDBCTemplate.delete(17);
      studentJDBCTemplate.delete(18);
      
      System.out.println("------Listing Multiple Records--------" );
      List<Student> students1 = studentJDBCTemplate.listStudents();
      
      for (Student record : students1) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }
      
      
   }
}