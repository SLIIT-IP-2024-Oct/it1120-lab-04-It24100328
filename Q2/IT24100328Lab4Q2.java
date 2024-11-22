import java.util.Scanner;

public class IT24100328Lab4Q2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks=input.nextDouble();

        if((examMarks<0) || (examMarks>100)){
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labSubmissionMarks=input.nextDouble();
            
        if((labSubmissionMarks<0) || (labSubmissionMarks>100)){
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }
        System.out.print("Please enter the percentage given for the exam: ");
        double examMarksPercentage=input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labSubMarksPercentage=input.nextDouble();
                
        if((examMarksPercentage+labSubMarksPercentage)!=100){
            System.out.println("The Percentage must add up to 100. Terminating program.");
            return;
        }
        double finalMarks=(examMarks*examMarksPercentage/100)+(labSubmissionMarks*labSubMarksPercentage/100);
        System.out.println("Final Exam Mark is : "+finalMarks);
        
        input.close();
    }
}