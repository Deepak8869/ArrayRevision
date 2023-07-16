public class array4 {
    static int countOccurence(int [] arr,int x){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,5};
        System.out.println(countOccurence(arr, 3));
    }
}
