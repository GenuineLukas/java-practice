package ArtGallery;

import java.util.Locale;

public class Main{

    public static void main(String[] args) {
        Arts endlessValley = new Arts(1000, 10, 50, 50, "endlessValley", "Picasso", "abstract");
        Arts startOfBigBang = new Arts(3000, 20, 40, 20, "startOfBigBang", "Jin", "modern");
        Arts bestSculpture = new Arts(10000,10,  100, 100, "bestSculpture", "Luke", "sculpture");
        //customers who buy everything buy the pieces regardless of the piece's kind
        //careful customer buys only when the piece's kind matches with their favor
        //people can't buy any item unless they are the same or older than 18 years old.
        Customers Dlyan = new Customers.HumanBuyAnything("Dylan", 40000,16, 2, "abstract");
        Customers Erica = new Customers.HumanBuyAnything("Erica", 20000, 42, 10, "modern");
        Customers Rebecca = new Customers.HumanCareful("Rebecca", 15000, 18, 1, "sculpture");
        Customers William = new Customers.HumanCareful("William", 15000, 15 , 1, "modern");
        Customers King = new Customers.HumanCareful("King", 30000000, 20, 10, "modern");

        //list out the art pieces' information
        System.out.println("-----------Arts pieces' information is below------------");
        Arts[] artArr = new Arts[]{endlessValley, startOfBigBang, bestSculpture}; // list of arts
        Customers[] cusArr = new Customers[]{Dlyan, Erica, Rebecca, William, King}; // list of customers
        Customers[] buyAnyArr = new Customers[]{Dlyan,Erica}; // list of customers who's willing to buy anything
        Customers[] buyCarefulArr = new Customers[]{Rebecca, William, King}; // list of customers who buy carefully

        for(int i = 0; i < artArr.length; i++) {
            int sequence = i + 1;
            if (sequence == 1) {
                System.out.println(sequence + "st Piece");
            }
            else if (sequence == 2){
                System.out.println(sequence + "nd Piece");
            }
            else if (sequence == 3){
                System.out.println(sequence + "rd Piece");
            }
            else {
                System.out.println(sequence + "th Customer");
            }
            artArr[i].getArtsInfo();
        }

        //list out the customers' information.
        System.out.println("-----------Customers' information is below------------");
        for(int j = 0; j < cusArr.length; j++) {
            int sequence2 = j + 1;
            if (sequence2 == 1) {
                System.out.println(sequence2 + "st Customer");
            }
            else if (sequence2 == 2){
                System.out.println(sequence2 + "nd Customer");
            }
            else if (sequence2 == 3){
                System.out.println(sequence2 + "rd Customer");
            }
            else {
                System.out.println(sequence2 + "th Customer");
            }
            cusArr[j].getCustomerInfo();
        }

        System.out.println("-----------THE PURCHASING HISTORY STARTS HERE-----------");
        /* The code below shows the purchasing history of customers (Dylan, Erica, Rebecca, William, King).
         * Each time customer make purchase, the price of the piece he/she purchased will be deducted from his/her budget.
         * Starting from Dylan, people will sequentially purchase the items up until King.
         * The code below will print out the reason why the customer is not able to buy the piece.
         * The code should indicate each individual's purchasing habit, taste, and so on.
         */
        for(int i = 0; i < cusArr.length; i++) {
            Customers cus = cusArr[i];
            //when the customer is too young to buy the art piece
            if (cus.isOldEnough() == false) {
                System.out.println(cus.name + " cannot buy the item because he/she is too young.");
            }
            //when the customer is old enough to but the art piece
            else{
               for(int j = 0; j < artArr.length; j++) {
                   Arts art = artArr[j];
                   int curBudget = cus.budget - art.price*cus.number;
                   if(curBudget > 0) {
                       if (cus.isBuyingAnything() == true && art.stock >= cus.number) {
                           System.out.println(cus.name + " has purchased the item " + art.name.toUpperCase(Locale.ROOT) + " !");
                           art.stock -= cus.number;
                           System.out.println(cus.name +"'s current budget: " + curBudget);
                       } else if (cus.isBuyingAnything() == false && art.stock >= cus.number && (art.kind == cus.favor)) {
                           System.out.println(cus.name + " has purchased the item " + art.name.toUpperCase(Locale.ROOT) + " !");
                           art.stock -= cus.number;
                           System.out.println(cus.name +"'s current budget: " + curBudget);
                       } else if (cus.number > art.stock) {
                           if (art.stock == 0) {
                               System.out.println(cus.name + " cannot buy the item " + art.name.toUpperCase(Locale.ROOT) + " because the item is not in stock");
                           }
                           else if (cus.number>art.stock) {
                               System.out.println(cus.name + " is trying to buy more than the items " + art.name.toUpperCase(Locale.ROOT) + " are available");
                           }
                       } else {
                           System.out.println(cus.name + " won't buy the item " + art.name.toUpperCase(Locale.ROOT) + " because the item doesn't matches with " +
                                   "his/her favor/preference");
                       }
                   }
                   else {
                       System.out.println(cus.name + " is not able to buy this item because he/she is running out of budget");
                   }
                   System.out.println("***** the number of " + art.name + " available NOW: " + art.stock + " ******");
               }
            }
        }
        System.out.println("-------------THE END OF THE PURCHASING HISTORY-------------");
    }
}

