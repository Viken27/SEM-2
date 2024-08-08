import java.util.Scanner;
    public class Calc{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("enter a:");
            float a= sc.nextFloat();
            System.out.println("enter b:");
            float b= sc.nextFloat();
            sc.nextLine();
            System.out.println("operation:");
            char s= sc.nextLine().charAt(0);
            if(s=='+'){
                System.out.println(a+b);
            }
             else if(s=='*'){
                 System.out.println(a*b);
             }
             else if(s=='/'){
                 System.out.println(a/b);
             }
        }
    }