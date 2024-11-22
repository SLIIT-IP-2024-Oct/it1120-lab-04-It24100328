import java.util.Scanner;

public class IT24100328Lab4Q3{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number=input.nextInt();

        String result=(number>0)? "Postive":
        (number<0)? "Negative":"Zero";

        System.out.println("The number is: "+result);
    }
}

