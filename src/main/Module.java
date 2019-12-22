package seanmurphy.ct417;

import java.util.ArrayList;

public class Module {

	
	private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> course;
    
    public Module(String name, String id){
        this.name=name;
        this.id=id;
    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    
   public String getID(){
       return id;
   }
   public void setID(String id){
       this.id=id;
   }
   
   
   public void regStudent(Student s){
       students.add(s);
       s.regModule(this);
   }
   
   
   public void regCourse(Course c){
       course.add(c);
   }
   
   
   public ArrayList getStudents(){
       return students;
   }
   
   
   public ArrayList getCourse(){
       return course;
   }
	
	
	
	
}
