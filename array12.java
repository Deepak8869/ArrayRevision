public class array12 {
    static int[] reverse(int [] arr){
        int[] ans = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1;i>=0 ;i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void print(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        
        print(arr);
        int[] ans =  reverse(arr);
        print(ans);
    }
}
