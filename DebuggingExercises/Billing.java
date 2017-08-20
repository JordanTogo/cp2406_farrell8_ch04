public class Billing {
    public static void main(String[] args) {
        computeBill(100);
        computeBill(100, 2);
        computeBill(100, 2, 3);

    }
    public static void computeBill(float price){
        double result = price * .8;
        System.out.println(result);
    }
    public static void computeBill(float photo, int quantity){
        double result = (photo * quantity) * .8;
        System.out.println(result);
    }
    public static void computeBill(float photoBook, int quantityOrdered, int couponValue){
        double result = ((quantityOrdered * photoBook) - couponValue) * .8;
        System.out.println(result);
    }
}
