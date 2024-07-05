 import java.util.Random;
import java.util.Scanner;

public class guessnumber {
public static void main(String[] args) {
    Random ran=new Random();
    int randomnumber=ran.nextInt(100)+1;        // random number generated is stored 
    System.out.println(randomnumber);
    int count=0;
    Scanner sc=new Scanner(System.in);
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the number of attempts :");
    int attempt=scn.nextInt();
    
   for (int i = 0; i < attempt; i++) {
    count++;                                      // to calculate the points depending on the number of attempts
  
    System.out.println("Take a guess(1-100):");    
        int playerguess=sc.nextInt();
    if (playerguess==randomnumber) {
        int temp=count;
        int point = 100/temp;                        //  point is inversely proportional to the attempts made
        System.out.println("correct!! you win"); 
        System.err.println("you took "+temp+" tries");                       
        System.out.println("points scored :"+point);
        break;
    }
    else if (playerguess>randomnumber) {
        System.out.println("sorry!! The number is higher");

    } else{
        System.err.println("sorry!! The number is lower");
          } 
    } 
    sc.close();
    scn.close();
  } 
}

