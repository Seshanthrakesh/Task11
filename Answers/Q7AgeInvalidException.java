


package Answers;
public class Q7AgeInvalidException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsEXception.throwAgeInvalidEXception(17);
	}

}
class ThrowsEXception{							//creation of Custom Exception
	static void throwAgeInvalidEXception(int age) 
	{
		if(age<=18)
		{
			throw new InvalidAgeException("age must be greater than 18");
			//throw new AgeInvalidException("age is greater than 18");
			//System.out.println("*****AgeInvalidEXception*****");
		}
		else
		{
			System.out.println("age is greater than 18");
		}
		
	}
	
}