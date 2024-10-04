package agecheckersystem;

public class Agecheckersystem {

	public static void main(String[] args) {
		int age=0;
		
		while(age<18) {
			System.out.print("Enter your age:");
			age=Integer.parseInt(System.console().readLine());
			if(age<18) {
				System.out.println("You are a minor.");
			}
		}
      System.out.println("You are an adult");
	}

}
