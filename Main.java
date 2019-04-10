package document;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Main {



    static void timeadd (){
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }


    static LocalDateTime timecalculate (){
        LocalDateTime timegen1 = LocalDateTime.now();
        return timegen1;
    }

    public static void main(String[] args) {

        LocalDateTime timegen = timecalculate();

        System.out.println();

        ArrayList<Block> chain = new ArrayList<>();

        timegen = timecalculate();
        String[] genesisTransactions = {"This is the beginning"};
        Block genesisBlock = new Block(5,0, timegen , genesisTransactions);
        chain.add(genesisBlock);

        timegen = timecalculate();
        String[] block2Transactions = {"ivan sent 10 bitcoin to satoshi", "satoshi sent 10 bitcoin to starbuck"};
        Block block2 = new Block(genesisBlock.getIndex(), genesisBlock.getBlockHash(), timegen , block2Transactions);
        chain.add(block2);

        timegen = timecalculate();
        String[] block3Transactions = {"ivan sent 999 bitcoin to my mom"};
        Block block3 = new Block(block2.getIndex(), block2.getBlockHash(), timegen, block3Transactions);
        chain.add(block3);



        for (int i = 0; i < chain.size(); i ++){
            System.out.println(chain.get(i).getTimestamp());
        }





    }
}
