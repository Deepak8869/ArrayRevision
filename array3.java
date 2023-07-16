public class array3 {
    static int search(int [] arr , int x){
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] == x){
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,5,3};
        System.out.println(search(arr, 2));
    }
}
