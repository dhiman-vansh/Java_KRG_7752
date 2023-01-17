import java.util.ArrayList;
import java.util.Arrays;

class Assignment4 {

    public static void sort01(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                res.add(arr[i]);
            } else
                cnt++;
        }
        for (int j = 0; j < cnt; j++) {
            res.add(1);
        }
        for (Integer x : res) {
            System.out.println(x);
        }
    }

    public static void rotatear(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        if (k < 0) {
            k = k * -1;
            k = k % n;
            k = n - k;
        }
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[((i + k) % arr.length)]);
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(res.get(j));
        }
    }

    public static void sandl(int[] arr) {
        int tempc = arr[0], templ = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (tempc > arr[i]) {
                tempc = arr[i];
            }
            if (templ < arr[i])
                templ = arr[i];
        }
        System.out.println("Smallest is " + tempc + " largest is " + templ);
    }

    public static void ksandl(int[] arr, int k) {
        Arrays.sort(arr);
        if(k> arr.length-1) k = arr.length-1;

        System.out.println( "Smallest element is " + arr[k] + " Largest is "+ arr[arr.length-k-1]);
        
    }

    public static void mindis( int arr[]){
        Arrays.sort(arr);
        int res = arr[1]- arr[0];
        res= Math.abs(res);
        int temp;
        for(int i = 1 ; i<arr.length ; i++){
            temp = arr[i] - arr[i-1];
            temp = Math.abs(temp);
            if( temp< res ) res =temp;
        }
        System.out.println(res);
    }

    public static void addel( int[]arr , k){

    }

    public static void main(String[] args) {

        // Array sort-
        // int[] arr = { 0, 1, 1, 0, 1, 0, 0, 1, 1 };
        // sort01(arr);

        // Rotate array -
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // rotatear(arr, 19);

        // Small Largest -
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // sandl(arr);

        // K largest and smallest -
        // int[] arr = { 2, 3, 4, 5, 6, 7 , 1 , 0};
        // ksandl(arr, 0);

        //Minimum Distance -
        int[] arr = { 5 , 7 , 1 , -5 , 10};
        mindis(arr);

        //Insertion and deletion - 
        // int[] arr = { 5 , 7 , 1 , -5 , 10};
        

    }
}