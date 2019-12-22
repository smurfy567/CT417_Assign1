package seanmurphy.ct417;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;

public class Course {

	private String name;
    private ArrayList modules;
    private ArrayList students;
    private DateTime startDate;
    private DateTime endDate;
    
    public Course(String name, DateTime startDate, DateTime endDate){
        this.name=name;
        this.modules=new ArrayList();
        this.students=new ArrayList();
        this.startDate=startDate;
        this.endDate=endDate;
    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    
    public void regStudent(Student stu){
       students.add(stu);
       stu.regCourse(this);
   }
    
    
    public void regModule(Module mod){
        modules.add(mod);
        mod.regCourse(this);
    }
    
    
    public ArrayList getStudents(){
       return students;
    }
    
    
    public ArrayList getModules(){
        return modules;
    }
    
    
    public DateTime getStartDate(){
        return startDate;
    }
    public void setStartDate(DateTime startDate){
        this.startDate=startDate;
    }
    
    
    public DateTime getEndDate(){
        return endDate;
    }
    public void setEndDate(DateTime endDate){
        this.endDate=endDate;
    }
	
	
	
	
	
	
	
}
