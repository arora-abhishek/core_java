public class Static_prop {

   static
   {
       System.out.println("firstname : Abhishek");
   }

   public static void lastname()
   {
       System.out.println("lastname : Arora");

   }

   private  static int age=22;



   public static void main(String[] args) {

       Static_prop.lastname();
       System.out.println("age : "+age);
    }
}
