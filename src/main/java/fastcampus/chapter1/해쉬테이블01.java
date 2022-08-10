package fastcampus.chapter1;

import javax.swing.plaf.SplitPaneUI;

import static fastcampus.chapter1.MyHash.*;

class MyHash {
    public Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String value;

        public Slot(String value) {
            this.value = value;
        }
    }
    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }
}


public class 해쉬테이블01 {

    public static void main(String[] args) {
        Slot[] hashTable = new Slot[20];
        hashTable[0] = new Slot("test");
        System.out.println(hashTable[0]);
        System.out.println(hashTable[0].value);


        MyHash myHash = new MyHash(20);
        myHash.saveData("DaveLee", "00000000000000");
        myHash.saveData("Hyun", "00000002");
        System.out.println(myHash.getData("Hyun"));
        // 해쉬 의 문제점
        myHash.saveData("David", "010100123123");
        myHash.saveData("Dave", "010101020310230123");
        System.out.println(myHash.getData("DaveLee")); //키의 충돌로인해 Dave 를 가져옴

    }
}
