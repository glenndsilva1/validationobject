package testvalidation;

public class ValidName implements Valid{
    String name;
    
    ValidName(String name){
    	this.name = name;
    }
	
	@Override
	public String process() {
       if(name.contains("A")) {
    	    return "Contains A";
       }
       return "";
	}

}
