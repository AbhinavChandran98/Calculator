import java.util.Scanner;

public class MenuDrivenCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your option ");
        System.out.println("1. Addition "+"\n"+"2. Substraction"+"\n"+"3. Multiplicstion "+"\n"+"4.Division");

        int num= sc.nextInt();

        switch(num){
            case 1: {
                System.out.println("Enter the numbers");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int sum = x + y;
                System.out.println("Result = " + sum);
                break;
            }
            case 2:{
                System.out.println("Enter the numbers");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int sum = x - y;
                System.out.println("Result = " + sum);
                break;
            }
            case 3:{
                System.out.println("Enter the numbers");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int sum = x * y;
                System.out.println("Result = " + sum);
                break;
            }
            case 4:{
                System.out.println("Enter the numbers");
                int x = sc.nextInt();
                int y = sc.nextInt();
               if(y==0){
                   System.out.println("invalid answer");
                         }
               else {
                   float res=x/y;
                   System.out.println(res);
               }
               break;
            }
            default:
                System.out.println("invalid option");
                break;
        }

    }
}
