package com.Assignment_5;

/*Create Employee class which has attributes (id, name, salary, dept, mydate) 
Where dept and mydate is class, dept has (dept_id, dept_name) And 
mydate has (day, month, year) Display Employee information
(Note - Containment using constructor and getter/setter)*/

class Employee {
    private int id;
    private String name;
    private double salary;
    private Department1 dept;
    private MyDate mydate;

    public Employee(int id, String name, double salary, Department1 dept, MyDate mydate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.mydate = mydate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department1 getDept() {
        return dept;
    }

    public void setDept(Department1 dept) {
        this.dept = dept;
    }

    public MyDate getMydate() {
        return mydate;
    }

    public void setMydate(MyDate mydate) {
        this.mydate = mydate;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department ID: " + this.dept.getDeptId());
        System.out.println("Department Name: " + this.dept.getDeptName());
        System.out.println("Joining Date: " + this.mydate.getDay() + "/" + this.mydate.getMonth() + "/" + this.mydate.getYear());
    }
}

class Department1{
    private int deptId;
    private String deptName;

    public Department1(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters and Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
public class Q2_Employee {

	public static void main(String[] args) {

		Department1 dept = new Department1(101, "IT");
		MyDate date = new MyDate(19, 3, 2023);
		Employee emp = new Employee(1001, "monika", 50000.0, dept, date);

		emp.displayInfo();

	}

}
