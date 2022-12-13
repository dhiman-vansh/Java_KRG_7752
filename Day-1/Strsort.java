public class Strsort {

    public static void sortstr(String inp) {
        
        char[] res = new char[inp.length()];
        for(int i=0 ; i<inp.length() ; i++) {
            char[] comp = inp.toCharArray();    
            char temp = comp[i];
            // temp = comp[i];
            for(int j=0 ; j<inp.length() ; j++) {
                if(temp > comp[j]) {
                    temp= comp[j];
                }
            }
            res[i]= temp;
            inp.replace(temp, "");
            System.out.println(res[i]);
        }

    }


    public static void main( String[] args) {
        String inp= "jasdkljdqwdajscasadnldaa";
        sortstr(inp);
    }
}
