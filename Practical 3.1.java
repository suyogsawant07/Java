public class ifelseExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number:");
        int number= sc.nextint();

        if(number>=0) {
            System.out.println("The number is Positive.");
        }else{
            System.out.println("The number is Negative.");
        }

        sc.close();
    }
}
