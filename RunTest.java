package DiwaliHomework14;
//inheritance
public class RunTest {
    public static void main(String[] args){
        Iphone I = new Iphone();
        I.price = 679;
        I.colour = "Blue";
        I.RAM = "4GB";
        System.out.println("Iphone13 mini colour is " + I.colour);
        System.out.println("Iphone13 mini price is " + I.price);
        System.out.println("Iphone13 mini RAM is " + I.RAM);

        AppleWatch A = new AppleWatch();

        A.colour = "White";
        A.RAM = "1GB";
        A.getPrice();
        System.out.println("AppleWatch series 6 colour is " + A.colour);
        System.out.println("AppleWatch series RAM is " + A.RAM);







    }
}
