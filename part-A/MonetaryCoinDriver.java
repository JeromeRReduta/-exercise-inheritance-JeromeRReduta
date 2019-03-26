//********************************************************************
//  MonetaryCoinDriver.java       
//********************************************************************

public class MonetaryCoinDriver
{
    //-----------------------------------------------------------------
    //  Demonstrates the use of a MonetaryCoin derived from Coin.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        MonetaryCoin[] coins = new MonetaryCoin[7];

        coins[0] = new MonetaryCoin(.01);
        coins[1] = new MonetaryCoin(.25);
        coins[2] = new MonetaryCoin(.10);
        coins[3] = new MonetaryCoin(.25);
        coins[4] = new MonetaryCoin(.05);
        coins[5] = new MonetaryCoin(1.00);
        coins[6] = new MonetaryCoin(.01);

        // flip all of the coins
        for (MonetaryCoin coin : coins)
            coin.flip();

        // compute total value
        double sum = 0;
        for (MonetaryCoin coin : coins)
            sum += coin.getValue();

        // print the coins
        for (MonetaryCoin coin : coins)
            System.out.println(coin);

        System.out.printf("\nTotal Value:%8.2f\n", sum);
    }
}
