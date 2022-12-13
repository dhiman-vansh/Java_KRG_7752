public class consonant {

    public static void vowel( String str ) {
        char[] x = str.toCharArray();
        String cons = new String();

        System.out.println("Vowels are - ");

        for(int i=0 ; i<str.length() ;i++){
            if(x[i] =='a' || x[i] =='e' || x[i] =='i' || x[i] =='o' ||x[i] =='u' ){
                
                System.out.println(x[i]);
            }
            else if((int)x[i] >= 97 && (int)x[i]<=122) {
                cons = cons+x[i];
            }
        }

        System.out.println("Consonent are - "+ cons);
    }
    public static void main( String[] args) {
        String inp= "ukhiohuvhcfgzxsfZa";
        vowel(inp);
    }
}
