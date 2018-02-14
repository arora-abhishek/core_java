 class Bank_inheritance {
    protected double rate;

    protected void printdetails()
    {
        System.out.println("Details of Bank are :");
    }
}

 class SBI extends Bank_inheritance{
    protected double rate;

    public SBI(double rate) {
        this.rate = rate;
    }


    protected void printdetails()
    {
        super.printdetails();
        System.out.println("Rate :"+rate);
    }
}


 class BOI extends Bank_inheritance{
     protected double rate;

     public BOI(double rate) {
         this.rate = rate;
     }


     protected void printdetails()
     {
         super.printdetails();
         System.out.println("Rate :"+rate);
     }
 }


 class ICICI extends Bank_inheritance{
     protected double rate;

     public ICICI(double rate) {
         this.rate = rate;
     }


     protected void printdetails()
     {
         super.printdetails();
         System.out.println("Rate :"+rate);
     }
 }


 class TEST{


     public static void main(String[] args) {
         Bank_inheritance obj1=new Bank_inheritance();
         SBI obj2=new SBI(8);
         BOI obj3=new BOI(8.3);
         ICICI obj4=new ICICI(8.6);

         obj1.printdetails();
         obj2.printdetails();
         obj3.printdetails();
         obj4.printdetails();

     }
 }


