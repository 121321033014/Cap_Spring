package org.Employeeinfo;

public class Kim implements EmployeeData{
    @Override
    public void Employee_id() {
        System.out.println("Employee_id of Kim is 10345");
    }

    @Override
    public void Department() {
        System.out.println("Department of Kim is Sales");
    }

    @Override
    public void Designation() {
        System.out.println("Designation of Kim is Manager");

    }

    @Override
    public void Salary() {
        System.out.println("Salary of Kim is 4,00,000 per Annum");

    }
}
