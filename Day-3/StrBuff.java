// package Day-3;

//SCP uses

public class StrBuff {
    public static void main(String[] args) {
        
        // Immutable String
        String s = new String("Hello");
        s.concat("world");
        System.out.println(s);
        String s2 = new String("Hello");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        // Mutable StringBuffer
        StringBuffer sb= new StringBuffer("Hello");
        sb.append("world");
        System.out.println(sb + "In buff");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb==sb2);
        System.out.println(sb.equals(sb2));

        //How many objects created - 
        String s3 = new String("h");
        String s4 = new String("h");
        String s5 = "h";
        String s6 = "h";
        //Here only 3 objects created s5 s6 points to same s3 and s4 is created as object s3 objects created in heap and scp

        
    }
}
