import java.util.ArrayList;

class Assignment4 {

    public static void sort01(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>() ;
        int cnt =0;
        for(int i=0 ;i<arr.length ; i++){
            if(arr[i] == 0){
                res.add(arr[i]);
            }
            else cnt++;
        }
        for( int j=0 ; j<cnt ; j++){
            res.add(1);
        }

        for (Integer x : res) {
            System.out.println(x);
        }
    }


    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0,0,1,1};
        sort01(arr);
    }
}