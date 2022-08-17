package fastcampus.chapter2.backtracking;

import java.util.ArrayList;

/**
 * 퇴각 검색
 */

public class 백트래킹 {

    //N Queen 문제

    private boolean isAvailable (ArrayList<Integer> candidate, Integer currentCol) {
        Integer currentRow = candidate.size();
        for (int i = 0; i < currentRow; i++) {
            if ((candidate.get(i) == currentCol) || (Math.abs(candidate.get(i) - currentCol) == currentRow - i)){
                return false;
            }
        }
        return true;
    }
    private void dfsFunc(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate) {
        if (currentRow == N) {
            System.out.println(currentCandidate);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (this.isAvailable(currentCandidate, i)) {
                currentCandidate.add(i);
                this.dfsFunc(N, currentRow + 1, currentCandidate);
                currentCandidate.remove(currentCandidate.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        백트래킹 T = new 백트래킹();
        T.dfsFunc(4, 0, new ArrayList<>());
    }

}
