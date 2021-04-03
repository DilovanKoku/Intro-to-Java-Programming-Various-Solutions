public class Chapter3Question24 {
    public static void main(String[] args) {

        int rankOfCard= (int)(Math.random()* 13);// 52 cards in 1 deck (0-51)
        int suitOfCard = (int)(Math.random() * 4);
        //Define rank and suit as Strings
        String rank = "";
        String suit = "";


        //Use switch statement for ranks
        switch (rankOfCard){
            case 0 -> rank = "Ace";
            case 1 -> rank = "2";
            case 2 -> rank = "3";
            case 3 -> rank = "4";
            case 4 -> rank = "5";
            case 5 -> rank = "6";
            case 6 -> rank = "7";
            case 7 -> rank = "8";
            case 8 -> rank = "9";
            case 9 -> rank = "10";
            case 10 -> rank = "Jack";
            case 11 -> rank = "Queen";
            case 12 -> rank = "King";
        }

        //Use switch statement for suit
        switch (suitOfCard){
            case 0 -> suit = "Clubs";
            case 1 -> suit = "Diamonds";
            case 2 -> suit = "Hearts";
            case 3 -> suit = "Spades";

        }
        System.out.println("The card you picked is " + rank + " of " + suit);




    }
}
