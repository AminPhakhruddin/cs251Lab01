import java.util.Scanner;

public class SMouseDriver
{
  public static void main(String[] args) 
  {
    Scanner stdIn = new Scanner(System.in);
	
    SMouse mighty = new SMouse();  
    SMouse mickey = new SMouse();
    
    System.out.println("What is mighty's age? ");
    int mightyAge = stdIn.nextInt();
	//mighty.setAge(mightyAge);
    for(int i = 0; i < mightyAge; ++i) {
    		mighty.grow();
    }
    mighty.display();
    
    
    
    System.out.println("What is mickey's age? ");
    int mickeyAge = stdIn.nextInt();
	//mickey.setAge(mickeyAge);
    for (int i = 0; i < mickeyAge; ++i) {
    		mighty.grow();
    }
    mighty.display();

    System.out.println("");


    System.out.println("");


    System.out.println("");
    
    stdIn.close();
  }
}
