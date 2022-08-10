package fastcampus.chapter1;


import java.util.HashMap;

class MyHashAddLinearProbing {
    public Slot[] hashTable;

    public MyHashAddLinearProbing(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String key;
        String value;
        public Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
                return true;
            } else {
                Integer currAddress = address + 1;
                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        this.hashTable[currAddress].value = value;
                        return true;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return false;
                        }
                    }
                }
                this.hashTable[currAddress] = new Slot(key, value);
            }
        } else {
            this.hashTable[address] = new Slot(key,value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                return  this.hashTable[address].value;
            } else {
                Integer currAddress = address + 1;
                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        return  this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }
}

public class 해쉬테이블03 {

    public static void main(String[] args) {
        MyHashAddLinearProbing myHash = new MyHashAddLinearProbing(20);
        myHash.saveData("DaveLee", "00000000000000");
        myHash.saveData("Hyun", "00000002");
        System.out.println(myHash.getData("Hyun"));
        // 해쉬 의 문제점
        myHash.saveData("David", "010100123123");
        myHash.saveData("Dave", "010101020310230123");
        System.out.println(myHash.getData("DaveLee")); //키의 충돌로인해 Dave 를 가져오는걸 막음
        System.out.println(myHash.getData("Dave"));


        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"사과");
        map1.put(2,"바나나");
        map1.put(3,"포도");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("DaveLee", "010232323");
        map2.put("Dave", "011232323");
        map2.put("David", "012232323");

        System.out.println(map1.get(1));

        System.out.println(map2.get("DaveLee"));
    }


}
