package com.Assignment_5;

/*Create Person class with fields(id,name,job) where job is another class with 
field(jobid,profile,joiningdate) where joiningdate is another class with fields 
(day, month, year) Display Person information (Note - Containment using 
constructor and getter/setter)*/

class Person {
    private int id;
    private String name;
    private Job job;
    
    public Person(int id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }
    
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
    
    public Job getJob() {
        return job;
    }
    
    public void setJob(Job job) {
        this.job = job;
    }
    
    public void displayPerson() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Job Information:");
        System.out.println("Job ID: " + job.getJobid());
        System.out.println("Profile: " + job.getProfile());
        System.out.println("Joining Date: " + job.getJoiningdate().getDay() + "/" + job.getJoiningdate().getMonth() + "/" + job.getJoiningdate().getYear());
    }
}
class Job {
    private int jobid;
    private String profile;
    private JoiningDate joiningdate;
    
    public Job(int jobid, String profile, JoiningDate joiningdate) {
        this.jobid = jobid;
        this.profile = profile;
        this.joiningdate = joiningdate;
    }
    
    public int getJobid() {
        return jobid;
    }
    
    public void setJobid(int jobid) {
        this.jobid = jobid;
    }
    
    public String getProfile() {
        return profile;
    }
    
    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    public JoiningDate getJoiningdate() {
        return joiningdate;
    }
    
    public void setJoiningdate(JoiningDate joiningdate) {
        this.joiningdate = joiningdate;
    }
}

class JoiningDate {
    private int day;
    private int month;
    private int year;
    
    public JoiningDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
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
public class Q3_Person {

	public static void main(String[] args) {
	    JoiningDate joiningdate = new JoiningDate(19, 3, 2023);
	    
	    Job job = new Job(1, "Software Engineer", joiningdate);
	    
	    Person person = new Person(1, "monika", job);
	    
	    person.setId(2);
	    person.setName("pooja");
	    
	    person.displayPerson();
	}
}
