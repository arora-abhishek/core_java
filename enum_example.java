public class enum_example {

    enum shops{

        shop1(8.5),shop(8.8),shop3(8.9);
        private double price;

        shops(double price){
            this.price=price;
        }

        private double getprice()
        {
            return price;
        }
    }

    public static void main(String[] args) {

        for(shops s:shops.values())
            System.out.println("Price = "+s.getprice());
    }
}
