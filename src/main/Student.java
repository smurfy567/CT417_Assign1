package seanmurphy.ct417;

import java.util.ArrayList;
import org.joda.time.DateTime;


public class Student {

	private String name;
	private DateTime dob;
    private int age;
    private String id;
    private String user;
    
    private ArrayList<Module> modules;
    private ArrayList<Course> course;
    
    
    public Student(String name, DateTime dob, int age, String id){
        this.name=name;
        this.dob=dob;
        this.age=age;
        this.id=id;
    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    
    public DateTime getDOB(){
        return dob;
    }
    public void setDOB(DateTime dob){
        this.dob=dob;
    }
    
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id=id;
    }
    
    
    public String getUsername(){
        this.user=this.name+this.age;
        return user;
    }
    
    
    
    public void regModule(Module mod){
        modules.add(mod);
    }
    
  
    public ArrayList getModules(){
        return modules;
    }
    
    
    public void regCourse(Course c){
        course.add(c);
    }
    
   
    public ArrayList getCourse(){
        return course;
    }
    
    
    
    
	
}
