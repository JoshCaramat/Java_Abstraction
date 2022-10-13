import java.util.Scanner;
public class Main extends abstractClass {
    public static Scanner sc = new Scanner(System.in);
    public static Main main = new Main();
    public static int itemInput;
    public static int discountInput;

    public static void main(String[] args) throws Exception {
        main.runCode();
    }
    public void runCode(){
        displayItems();
        itemInput = sc.nextInt();
            itemChoice(itemInput);
        displayDiscounts();
        discountInput = sc.nextInt();  
            discountChoice(discountInput);    
        calculateBill(getPrice(), getDiscount());
    }

    public int itemChoice(int itemNum) {
        switch (itemNum) {
            case 1 -> {setPrice(34490);}
            case 2 -> {setPrice(44990);}
            case 3 -> {setPrice(52440);}
          }
        return itemNum;
    }

    public int discountChoice(int discountNum) {
        switch (discountNum) {
            case 1 -> {setDiscount(0.0);}            
            case 2 -> {setDiscount(0.10);}
            case 3 -> {setDiscount(0.20);}
            case 4 -> {setDiscount(0.30);}
          }
        return discountNum;
    } 

    public void calculateBill(int price, double discount){
        double discountedAmount = price * discount;
        double totalBill = price - discountedAmount;
        if (getDiscount() == 0){
            System.out.println("Your total bill is Php." + (int) Math.round(getPrice()));
        }
        else{
            System.out.println("Your total bill is Php." + (int) Math.round(totalBill));
        }
    }
}
