public class StringBuffer_remove {
    public static void main(String[] args) {

        String str="The sky looks pretty clear";
        System.out.println(str);
        StringBuffer sb =new StringBuffer(str);
        sb.reverse();
        sb.delete(4,10);
        System.out.println(sb);
    }
}
