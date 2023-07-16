import java.util.*;

public class array7 {
    static int findTriplet(int [] arr ,int x){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+ " elements");
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
 
        System.out.println("Enter target sum");
        int x = sc.nextInt();

        System.out.println(findTriplet(arr, x));
    }

 }

