public abstract class abstractClass {
    private int price;
    private double discount;
    
    public int setPrice(int amount){
        return this.price += amount;
    }
    public double setDiscount(double amount){
        return this.discount += amount;
    }
    public int getPrice(){
        return this.price;
    }
    public double getDiscount(){
        return this.discount;
    }
    public static void displayItems(){
        System.out.println("Iphone products: ");
        System.out.println("1) Iphone 11 --> 34,490");
        System.out.println("2) Iphone 12 --> 44,990");
        System.out.println("3) Iphone 13 --> 52,440");
        System.out.print("Enter product number: ");
    }
    public static void displayDiscounts(){
        System.out.println("\nDiscounts: ");
        System.out.println("1) DSC00 --> 0%");
        System.out.println("2) DSC01 --> 10%");
        System.out.println("3) DSC02 --> 20%");
        System.out.println("4) DSC03 --> 30%");
        System.out.print("Enter discount number: ");
    }
    public abstract int itemChoice(int itemNum);
    public abstract int discountChoice(int discountNum);
    public abstract void calculateBill(int price, double discount);
}
