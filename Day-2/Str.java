// import javax.print.DocFlavor.STRING;

// reverse words in string
// to find longest substring without repetetion\
// split and trim diff

public class Str {

    public static void wordbyword(String str) {
        int j=0;
        str = str+" ";
        for (int i=0 ; i<str.length() ; i++) {
            if(Character.isWhitespace(str.charAt(i)) && !Character.isWhitespace(str.charAt(i-1))){
                System.out.println(str.substring(j, i));
                j=i;
            }
        }
    }
    public static void revword(String str) {
        String[] res = str.split(" ", str.length());
        for (int i= res.length-1 ; i>=0 ; i--) {
            System.out.println(res[i]);
        }
    }
    public static void longsub( String str){
        String[] res = str.split(" ", str.length());
        String temp = res[0];        
        for ( int i=1 ; i<res.length ; i++) {
            if(temp.length() <= res[i].length()){
            temp=res[i];
            }
            // System.out.println(res[i]);
        }
        System.out.println(temp);
    }

    public static void main (String args[]) {
        String f= new String("Vansh is I am");
        // f.concat("nw");
        // wordbyword(f);        
        // revword(f);
        longsub(f);
    }
}