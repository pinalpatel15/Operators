package DiwaliHomework14;

//using different data type together

public class MethodOverloading {
    public static int add1(int x, int y) {
        return x + y;
    }
    public static double add1(double x, double y, double z) {
        return x + y + z;
    }
public static void main(String[] args){
        int myExample1 = add1(3,4);
        double myExample2 = add1(3.5,4.5d,5.5d);
        System.out.println("int - " + myExample1);
        System.out.println("double - "+ myExample2);

}

}
