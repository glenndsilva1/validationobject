package testvalidation;

public class ValidAge implements Valid {
	 public int  age;
	 
	 public ValidAge(int  age) {
		 this.age = age;
	 }
	 
	@Override
	public String process() {
       if(age < 80) {
    	   return "Age is less than 80"; 
       }
       return "";
	}
}
