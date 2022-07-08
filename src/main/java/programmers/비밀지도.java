package programmers;

public class 비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        for (int i : arr1) {
            System.out.println(String.format("%05d", Integer.parseInt(Integer.toBinaryString(i))));
        }
        return answer;
    }


    public static void main(String[] args) {
        비밀지도 T = new 비밀지도();
        for (String s : T.solution(5, new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28})) {
            System.out.println(s);
        }
    }
}
