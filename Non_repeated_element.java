public class Non_repeated_element {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,2,3,1,5,5};
        int count;

        System.out.println("Array :");
        for(int i:arr1)
            System.out.print(i+" ");

        System.out.println("");
        

        for(int i=0;i<arr1.length;i++)
        {
            count=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                    ++count;
                if(count==2)
                    j=arr1.length-1;
            }
            
            if(count==1)
                System.out.println("Non repeated number is : "+arr1[i]);
        }
    }
}
