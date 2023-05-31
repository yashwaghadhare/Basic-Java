import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // array declaration
        int [] marks = { 1,2,3,4,5,6,7,8,9}; 
        System.out.println("Enter array index i.e. 0 to 9 : ");
        int n = scan.nextInt();
        System.out.println("your selection is : " + marks[n]);
        System.out.println("array list is : ");
        for (int i = 0; i <marks.length; i++) {
            System.out.println(marks[i]);
        }

        // updating 4 with 0
        System.out.println("Enter index to be update i.e. 0 to 9 : ");
        int o = scan.nextInt();
        System.out.println("Update with : ");
        int p = scan.nextInt();
        marks[o] = p;
        System.out.println("Updated list is : ");
        for (int i = 0; i <marks.length; i++) {
            System.out.println(marks[i]);
        }
        scan.close();
    }
}
