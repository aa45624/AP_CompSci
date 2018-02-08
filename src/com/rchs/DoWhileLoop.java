import java.util.Scanner;

public class DoWhileLoop
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number  ::");
        int num = sc.nextInt();
        char letter;
        
     
   do{
      letter = (char)num;
      System.out.println("The character of ascii value " + num + " is "  + letter);
      num++;
    }while(num<=122);

       
    }
    


}