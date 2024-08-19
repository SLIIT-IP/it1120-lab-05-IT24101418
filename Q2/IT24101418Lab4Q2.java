import java.util.Scanner;

public class IT24101418Lab4Q2
 {
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter exam marks (0-100): ");
        double examMarks = getValidMarks(scanner);

        
        System.out.print("Enter lab submission marks (0-100): ");
        double labMarks = getValidMarks(scanner);

        System.out.print("Enter percentage for exam marks: ");
        double examPercentage = getValidPercentage(scanner);

       	
        System.out.print("Enter percentage for lab submission marks: ");
        double labPercentage = getValidPercentage(scanner);

        
        if (examPercentage + labPercentage != 100)
  {
        System.out.println("Error: Percentages must add up to 100.");
            scanner.close();
            return;
        }

        
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        
        System.out.printf("The final mark is: %.2f\n", finalMark);

       
        scanner.close();
    }

    369
    private static double getValidMarks(Scanner scanner)
 {
        double marks;
        while (true) 
 {
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100)
 {
                break;
            }
          else
 {
                System.out.print("Invalid input. Enter a value between 0 and 100: ");
            }
        }
        return marks;
    }

    
    private static double getValidPercentage(Scanner scanner) 
{
        double percentage;
        while (true)
   {
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100)
 {
                break;
            }
       else 

  {
                System.out.print("Invalid input. Enter a value between 0 and 100: ");
            }
        }
        return percentage;
    }
}
