package com.example.employee;


public class Employee{

    private int employeeId;
    private String employeeName;
    private String email;
    private String department;

    public Employee(int employeeId, String employeeName, String email, String department){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.department = department;
    }


    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public int getEmployeeId(){ //Getter
        return this.employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeName(){ //Getter
        return this.employeeName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){ //Getter
        return this.email;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){ //Getter
        return this.department;
    }
}