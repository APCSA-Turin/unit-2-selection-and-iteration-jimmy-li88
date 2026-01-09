package U3T3;

public class GameRunner {
    public static void main(String[] args) {
        System.out.println("------ Scenario Step 1 ------");

        System.out.println("-----> There's a new bank in town!");

        Bank bank = new Bank();

        System.out.println(bank.bankInfo() + "\n");
        System.out.println("------ Scenario Step 2 ------");

        System.out.println("-----> Ms.Turin is getting a new credit card!");

        CreditCard myCard = new CreditCard("Ms.Turin", "9254");

        System.out.println(myCard.cardInfo() + "\n");
        System.out.println("------ Scenario Step 3 ------");

        System.out.println("-----> Oh nice! A new bagel shop in town!");

        BagelShop jimsBagelShop = new BagelShop("Jim's Bagel Shop", 1000, 2, bank);

        System.out.println(jimsBagelShop.shopInfo() + "\n");
        System.out.println("------ Scenario Step 4 ------");

        System.out.println("-----> Ms.Turin wants to buy 5 bagels using his new credit card");

        boolean buyBagels = jimsBagelShop.payForBagels(myCard, 5, "9254");

        System.out.println(buyBagels + "\n");

        System.out.println(myCard.cardInfo() + "\n");

        System.out.println(jimsBagelShop.shopInfo() + "\n");
        
    }
}