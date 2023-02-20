package enumerators;

public class Main {
    public static void main(String[] args) {
        USCurrency coins[] = new USCurrency[4];

        coins[0] = USCurrency.PENNY;
        coins[1] = USCurrency.NICKLE;
        coins[2] = USCurrency.DIME;
        coins[3] = USCurrency.QUARTER;

        for (USCurrency us : coins){
            System.out.println(us.val);
        }
    }
}
