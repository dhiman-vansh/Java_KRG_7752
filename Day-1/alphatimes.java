public class alphatimes {

    public static void charocc(String inp, char a) {
        int lenold = inp.length();
        
        String newstr = inp.replaceAll("a", "");
        System.out.println(newstr);
        // newstr = ;
        System.out.println(lenold-newstr.length());
    }
    public static void main( String[] args) {
        String inp= "jasdkljdqwdajscasadnldaa";
        char a = 'a';
        charocc(inp , a);
    }
}
