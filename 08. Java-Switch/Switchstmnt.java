import java.util.Scanner;

public class Switchstmnt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter num 1 : ");
        int a = scan.nextInt();
        
        System.out.println("enter num 2 : ");
        int b = scan.nextInt();
        
        System.out.println("enter operator (+ , - , * , /) : ");
        String op = scan.next();
        
        switch(op){
            case "+" :
                System.out.println(a + b);
                break;
            case "-" :
                System.out.println(a - b);
                break;
            case "*" :
                System.out.println(a * b);
                break;
            case "/" :
                System.out.println(a / b);
                break;
            default :
                System.out.println("wrong input");
        }
        scan.close();
    }
}
