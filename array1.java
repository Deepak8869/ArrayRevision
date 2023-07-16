public class array1 {
    static int sum(int [] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            count += arr[i]; 
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,5,3};
       
       System.out.println(sum(arr));
    }
}
