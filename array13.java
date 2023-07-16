import java.util.Collections;

public class array13 {
    static void reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }

    }
    static void swap(int [] arr ,int a ,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
     static void print(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,4,5}; 
        reverse(arr);
        print(arr);
        
    }
}
