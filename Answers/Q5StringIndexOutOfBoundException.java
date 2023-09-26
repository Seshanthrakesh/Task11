package Answers;

public class Q5StringIndexOutOfBoundException {

	public static void main(String[] args) {
		
		
		//StringIndexOutOfBondException
				String str ="Rakesh";
				//Attempt to access an index that is out of bounds
				char outofBounds =str.charAt(15);
				System.out.println("Character at index 15."+outofBounds);
	}

}
