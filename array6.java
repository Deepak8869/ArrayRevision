import java.util.Scanner;

public class array6 {
    static int pairSum(int [] arr ,int x){
        int ans  = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == x){
                    ans++;
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

        System.out.println(pairSum(arr, x));
    }
}
