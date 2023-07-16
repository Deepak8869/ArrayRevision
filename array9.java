public class array9 {
    static int firstMaximum(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int secondMaximum(int [] arr){
        int mx = firstMaximum(arr);

        for(int i = 0;i< arr.length;i++){
            if(arr[i]==mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = firstMaximum(arr);

        return secondMax;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,-2,-3,0,-4};
        System.out.println(secondMaximum(arr));
    }
}
