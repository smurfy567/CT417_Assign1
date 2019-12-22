package seanmurphy.ct417;



import org.junit.Assert;
import org.joda.time.DateTime;

public class Test {

	private Student s1 = new Student("David Ryan", new DateTime(1997, 6, 25, 0, 0), 19, "15894428");
    private Student s2 = new Student("Ross Nickson", new DateTime(1997, 1, 9, 0, 0), 20, "17938713");
    private Student s3 = new Student("Adam Carney", new DateTime(1992, 10, 10, 0, 0),22, "13241418");
    
    
    public void getUsernameTest(){
        Assert.assertEquals(s1.getUsername(),"David Ryan19");
        Assert.assertEquals(s2.getUsername(),"Ross Nickson20");
        Assert.assertEquals(s3.getUsername(),"Adam Carney22");
        
    }
    
    
    

}

