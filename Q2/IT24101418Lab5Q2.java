import java.util.Scanner ;

public class IT24101418Lab5Q2{
  public static void main(String[] args){

//declare variables
	int New_Members;

//create scanner
	Scanner members =new Scanner(System.in);

//take input
	System.out.println("Enter the number of new members introduced: ");
	New_Members = members.nextInt();

//calculation
   if(New_Members<0){
	System.out.println("Input must be a number 0 or greater"); }
   else
//start switch
	{switch(New_Members){
		case 0 : System.out.print("No Prize");
		break;
		case 1 : System.out.print("Prize is a : Pen");
		break;
		case 2 : System.out.print("Prize is a : Umbrella");
		break;
		case 3 : System.out.print("Prize is a : Bag");
		break;
		case 4 : System.out.print("Prize is a : Travelling Chair");
		break;
		case 5 : System.out.print("Prize is a : Headphone");
		break;
		default : System.out.print("Prize is a : Headphone");
      }
    }
	
	
	
  }
}