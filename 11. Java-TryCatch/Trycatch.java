public class Trycatch {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        try{
            System.out.println(nums[8]);
        }catch(Exception e){
            System.out.println("Error message : your range is not in array");
        }
    }
}
