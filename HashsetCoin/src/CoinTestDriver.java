import java.util.HashSet;

public class CoinTestDriver {
    public static void main(String[] args) {
        // create the hashset
        HashSet<Coin> bagOfCoins = new HashSet<>();

        // Create coin objects with denominations (1, 2, 5, 10, 20, 50, 100)
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);

        // Add coins (1, 2, 5, 10, 20, 50) to the bagOfCoins HashSet. Do not add coin100!
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);

        // Add coin10 to the HashSet twice!
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin10);

        // Print the contents of the bagOfCoins HashSet
        System.out.println("Contents of bagOfCoins HashSet:");
        for (Coin coin : bagOfCoins) {
            System.out.println("Coin denomination: " + coin.getDenomination());
        }

        findCoin(bagOfCoins, coin10);
        findCoin(bagOfCoins, coin100);
        displayBagContents(bagOfCoins);
        displayBagDetails(bagOfCoins);

        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }

    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin) {
        if (bagOfCoins.contains(coin)) {
            System.out.println("There is a coin " + coin.getDenomination() + " in the bag");
        } else {
            System.out.println("There is no coin " + coin.getDenomination() + " in the bag");
        }
    }

    static void displayBagContents(HashSet<Coin> bagOfCoins) {
        // display the contents of the bag
        System.out.println("Bag contents:");
        for (Coin coin : bagOfCoins) {
            System.out.println(coin.getDenomination());
        }
    }

    static void displayBagDetails(HashSet<Coin> bagOfCoins) {
        if (bagOfCoins.isEmpty()) {
            System.out.println("There are no coins in the bag");
        } else {
            System.out.println("There are " + bagOfCoins.size() + " coins in the bag");
        }
    }
}

class Coin {
    private int denomination;

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}
