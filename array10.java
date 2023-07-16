public class array10 {
    static int firstRepeat(int [] arr){
        int ans = -1;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                    
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,5,3,4,6,3,4};
        System.out.println(firstRepeat(arr));
    }
}
