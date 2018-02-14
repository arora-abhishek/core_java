public class Overloading_example {

    protected  static void add(int a, int b)
    {
        int sum=a+b;
        System.out.println("Numbers are :"+a+" and "+b);
        System.out.println("Sum of two numbers : "+sum);

    }

    protected  static void add(double a, double b)
    {
        double sum=a+b;
        System.out.println("Numbers are :"+a+" and "+b);
        System.out.println("Sum of two numbers : "+sum);

    }

    protected  static void mul(int a, int b)
    {
        int mul=a*b;
        System.out.println("Numbers are :"+a+" and "+b);
        System.out.println("Multiplication of two numbers : "+mul);

    }

    protected  static void mul(float a, float b)
    {
        float mul=a*b;
        System.out.println("Numbers are :"+a+" and "+b);
        System.out.println("Multiplication of two numbers : "+mul);

    }

    protected  static void con(String a, String b)
    {
        String s=a+" "+b;
        System.out.println("Strings are :"+a+" and "+b);
        System.out.println("New string after concatination : "+(s));

    }

    protected  static void con(String a, String b, String c)
    {
        String s=a+" "+b+" "+c;
        System.out.println("Strings are :"+a+" , "+b+" and "+c);
        System.out.println("New string after concatination : "+(s));


    }

    public static void main(String[] args) {

        Overloading_example.add(5,7);
        Overloading_example.add(5.3,7.2);
        Overloading_example.mul(5,7);
        Overloading_example.mul(5.2f,7.3f);
        Overloading_example.con("Abhishek","Arora");
        Overloading_example.con("How","are","you");



    }
}
