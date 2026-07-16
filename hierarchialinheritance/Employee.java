package com.tns.hierarchialinheritance;

public class Employee extends Person
{
    private int empId;
    private float salary;
    private String dept;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public Employee(String name, String city, int empId, float salary, String dept) 
    {
        super(name, city);
        this.empId = empId;
        this.salary = salary;
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "Employee [getEmpId()=" + getEmpId() + ", getSalary()=" + getSalary() + ", getDept()=" + getDept()
                + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
    }
    
    
    
    

}
