public class Method {
    // Method Declared : sum
    static int sum(int a , int b){
        System.out.println("sum is : ");
        return a + b;
    }
    // Method Declared : sub
    static int sub(int a , int b){
        System.out.println("sub is : ");
        return a - b;
    }
    // Method Declared : mul
    static int mul(int a , int b){
        System.out.println("mul is : ");
        return a * b;
    }
    // Method Declared : div
    static int div(int a , int b){
        System.out.println("div is : ");
        return a / b;
    }
    public static void main(String[] args) {
        // calling method : sum
        System.out.println(sum(3,2));
        // calling method : sub
        // System.out.println(sub(3,2));
        // calling method : mul
        // System.out.println(mul(3,2));
        // calling method : div
        // System.out.println(div(3,2));
    }
}
