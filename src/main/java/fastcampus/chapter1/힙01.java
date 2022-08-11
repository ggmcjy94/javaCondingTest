package fastcampus.chapter1;


import java.util.ArrayList;
import java.util.Collections;

class Heap {
    public ArrayList<Integer> heapArray = null;

    public Heap(Integer data) {
        this.heapArray = new ArrayList<>();
        heapArray.add(null);
        heapArray.add(data);
    }

    public boolean move_up(Integer inserted_idx) {
        if (inserted_idx <= 1) {
            return false;
        }
        Integer parent_idx = inserted_idx / 2;
        if (this.heapArray.get(inserted_idx) > this.heapArray.get(parent_idx)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insert(Integer data) {
        Integer inserted_idx , parent_idx;
        if (heapArray == null) {
            heapArray = new ArrayList<>();
            heapArray.add(null);
            heapArray.add(data);
            return true;
        }

        this.heapArray.add(data);
        inserted_idx = this.heapArray.size() - 1;

        while (this.move_up(inserted_idx)) {
            parent_idx = inserted_idx/2;
            Collections.swap(this.heapArray, inserted_idx , parent_idx);
            inserted_idx = parent_idx;
        }
        return true;
    }
}



public class 힙01 {

    public static void main(String[] args) {
        Heap heap = new Heap(15);
        heap.insert(10);
        heap.insert(8);
        heap.insert(5);
        heap.insert(4);
        heap.insert(20);
        System.out.println(heap.heapArray);
    }
}
