public class Types_and_percentage_of_characters {
    public static void main(String[] args) {
        String str="Hello how are you Amit@123";
        System.out.println(str);
        int uc=0,lc=0,digits=0,sp=0;
        int l=str.length();
        String s="";
        s=str.replaceAll("[A-Z]","");
        uc=l-s.length();
        s=str.replaceAll("[a-z]","");
        lc=l-s.length();
        s=str.replaceAll("[0-9]","");
        digits=l-s.length();
        s=str.replaceAll("[A-Za-z0-9]","");
        s=s.trim();
        sp=s.length();

        System.out.println("NO.of uppercase = "+uc+" percentage = "+((uc*100)/l));
        System.out.println("NO.of lowercase = "+lc+" percentage = "+((lc*100)/l));
        System.out.println("NO.of digits = "+digits+" percentage = "+((digits*100)/l));
        System.out.println("NO.of special characters = "+sp+" percentage = "+((sp*100)/l));
    }
}
