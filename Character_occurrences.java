public class Character_occurrences {
    public static void main(String[] args) {

        String str="Hello";
        count(str);
    }

    public static void count(String str)
    {
        int l=str.length();
        if(l==0)
           return;
        int diff=0;
        String s=str.charAt(0)+"";
        str=str.replaceAll(s,"");
        diff=l-str.length();
        if(diff>0)
            System.out.println(s+" "+diff+" times");
        count(str);
    }
}
