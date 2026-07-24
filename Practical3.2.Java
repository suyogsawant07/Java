import java.util.Scanner;
public class NestedIfelsestatement{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("First number: ");
       int a=sc.nextInt();

       System.out.println("Second number: ");
       int b=sc.nextInt();

       System.out.println("Third number: ");
       int c=sc.nextInt();

       if(a>b){
        if(a>c){
        System.out.println("A is the largest number");
        }else{
            System.out.println("C is the largest number");
        }
    }
       else{
        if(a>b){
            System.out.println("A is the largest number");
        }else{
            System.out.println("B is the largest number");
        }

        }
        
       sc.close();



    }
}