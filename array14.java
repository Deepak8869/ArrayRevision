public class array14 {
    static int[] rotate(int [] arr ,int k){
        int n = arr.length;
        k = k%n;
        int [] ans = new int[n];
        int j = 0;
        for(int i = n-k ;i<n;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0;i<n-k;i++){
            ans[j++]=arr[i];
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
        int [] result = rotate(arr, 102);
        print(result);
    }
    
}
