package org.Employeeinfo;

import org.rohiniinfotech.RBI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Employee.xml");
        EmployeeData emp=context.getBean("emp",EmployeeData.class);
        emp.Employee_id();
        emp.Department();
        emp.Salary();
        emp.Designation();
        emp.ProvidentialFunds();
    }
}
