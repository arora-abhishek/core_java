import java.util.Set;
import java.util.TreeSet;

public class Common_ele_between_arrays {
    public static void main(String[] args) {
        int[] arr1={1,3,4,7,4,6,5};
        int[] arr2={2,3,6,4,7};

        System.out.println("Array1 :");
        for(int i:arr1)
            System.out.print(i+" ");

        System.out.println("");
        System.out.println("Array2 :");

        for(int i:arr2)
            System.out.print(i+" ");
        
        Set<Integer> set=new TreeSet<Integer>();

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    set.add(arr1[i]);
                    break;
                }

            }

        }

        System.out.println("");
        System.out.println("Common elements are :");
        for(int i:set)
            System.out.println(i);
    }
}
