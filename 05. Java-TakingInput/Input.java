import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter anything : ");
        String input = scan.nextLine();
        System.out.println("your input is : " + input);
        scan.close();
    }
}