import java.util.HashMap;
import java.util.Map;

public class String_occurrences {
    public static void main(String[] args) {
        int count=1,j;
        String s="";
        String str1="I live in India. The capital of India is Delhi. Delhi is great";
        System.out.println(str1);
        Map<String,Integer> m =new HashMap<String,Integer>();
        String[] arr=str1.split(" ");
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            count=1;
            s=arr[i];
            s=s.replace(".","");

            if(m.containsKey(s))
            {
                count=m.get(s);
                m.put(s,count+1);
            }
            else
                m.put(s,count);

        }

           for(Map.Entry mp:m.entrySet())
               System.out.println("word = "+mp.getKey()+" : "+mp.getValue()+" times");



    }
}
