import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter student name :");
        String name=s.nextLine();
        System.out.println("Enter the number of subjects :");
        int numsubjects=s.nextInt();
        if (numsubjects<=0) {
            System.out.println("Enter valid number of subjects!!");
            return;
        }
        int total=0;
        int maxmark=100;
        for (int i = 0; i < numsubjects; i++) {
            System.out.println("Enter the mark for subject"+(i+1)+"(out of 100) :");
            int marks=s.nextInt();

            if (marks<0||marks>maxmark) {
                System.out.println("marks should be in the range of 0 to 100!!");
                i--;
            }
            else{
                total+=marks;
            }
        }
         double avg=(double)total/(numsubjects*maxmark)*100;
         System.out.println("Total marks out of "+(numsubjects*maxmark)+" is :"+total);
         System.out.println("average percentage is :"+avg+"%");

         String grade;
         if (avg>=90) {
            grade="A+";
         }
         else if(avg>80&&avg<90){
            grade="A";
         }
         else if(avg>=60&&avg<=80){
            grade="B";
         }
         else if(avg>=40&&avg<60){
            grade="C";
         }else{
            grade="F";
         }
         System.out.println("Grade of "+name+" is :"+grade);    
        }
        
    }

