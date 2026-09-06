package JavaPractice.Datatypes;

public class BillExample {

    public static void main(String[] args){
        int ricePrice = 60;
        int riceQuantity = 5;

        int oilPrice = 120;
        int oilQuantity = 2;

        int biscuitPrice = 30;
        int biscuitQuantity = 4;

        int  ricetotal   =   ricePrice*riceQuantity;
        int oilTotal = oilPrice * oilQuantity;
        int biscuitTotal = biscuitPrice * biscuitQuantity;

        int totalBill   =  ricetotal+ oilTotal+biscuitTotal;
        int discount = 50;
        int finalAmount = totalBill - discount;

        System.out.println("Rice Total: " + ricetotal);
        System.out.println("Oil Total: " + oilTotal);
        System.out.println("Biscuit Total: " + biscuitTotal);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}
