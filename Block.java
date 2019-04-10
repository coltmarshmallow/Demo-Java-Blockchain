package document;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Block {
    private int index;
    private int previousHash;
    private LocalDateTime timestamp;
    private String[] businessdata;


    private int blockHash;


    public Block(int index, int previousHash, LocalDateTime timestamp, String[] businessdata) {
        this.index = index;
        this.previousHash = previousHash;
        this.timestamp = timestamp;
        this.businessdata = businessdata;

        Object[] contents = {businessdata.hashCode(), previousHash, timestamp};
        this.blockHash = Arrays.hashCode(contents);
    }


    public int getIndex() {
        index = index +1;
        System.out.println("index: " + index);
        return index;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }


    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getBusinessdata() {
        return businessdata;
    }


    public int getBlockHash() {
        return blockHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "index=" + index +
                ", previousHash=" + previousHash +
                ", timestamp=" + timestamp +
                ", businessdata=" + Arrays.toString(businessdata) +
                ", blockHash=" + blockHash +
                '}';
    }
}
