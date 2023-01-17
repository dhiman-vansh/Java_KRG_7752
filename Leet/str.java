class str {
    public static void isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll(",", "");
        s = s.replaceAll(":", "");
        s = s.replaceAll("@", "");
        s = s.replaceAll("_", "");
        s = s.replaceAll("/", "");
        s = s.replaceAll("}", "");
        s = s.replaceAll("\\{", "");
        s = s.replaceAll("\\\\", "");
        s = s.replaceAll("#", "");
        s = s.replace(".", "");
        s = s.replaceAll(" ", "");  

        // System.out.println(s);
        // System.out.println(res);
        StringBuilder f = new StringBuilder();
        f.append(s);
        // for(char a : res.toCharArray())
        f.reverse();
        String res = f.toString();
        System.out.println("res is "+ res + " \n s "+ s);
        // System.out.println(res.equals(s));
        // return res.equals(s);
        // return false;
    }
    public static void main(String[] args) {
        isPalindrome("Marge, let's \"[went].\" I await {news} telegram");
    }
} 