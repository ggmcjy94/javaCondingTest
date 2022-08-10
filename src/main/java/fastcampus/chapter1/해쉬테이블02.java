package fastcampus.chapter1;


class MyHashAddChaining {
    public Slot[] hashTable;

    public MyHashAddChaining(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String key;
        String value;
        Slot next;

        public Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key,value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return  findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }



}

public class 해쉬테이블02 {

    public static void main(String[] args) {
        MyHashAddChaining myHash = new MyHashAddChaining(20);
        myHash.saveData("DaveLee", "00000000000000");
        myHash.saveData("Hyun", "00000002");
        System.out.println(myHash.getData("Hyun"));
        // 해쉬 의 문제점
        myHash.saveData("David", "010100123123");
        myHash.saveData("Dave", "010101020310230123");
        System.out.println(myHash.getData("DaveLee")); //키의 충돌로인해 Dave 를 가져오는걸 막음
        System.out.println(myHash.getData("Dave"));
    }
}
