package testvalidation;

public class Process {
	private Valid[] process;

	Process(Valid[] arr){
		this.process = arr;
	}
	
	public String error() {
		String str = "";
		for (int i=0, j; i < this.process.length; i++) {
        	str += this.process[i].process();
        }
		return str;
	}
	
	public static void main(String args[]) {
        Valid[] valid = {new ValidAge(12), new ValidName("Glenn")};
        Process process = new Process(valid);
        System.out.println(process.error());
	}
}
