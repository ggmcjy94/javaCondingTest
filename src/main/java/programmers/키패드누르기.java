package programmers;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        // 1 4 7 왼속
        // 3 6 9 오른손
        // 2 5 8 0 더 가까운
        // 1 3 4 5 8 2 1 4 5 9 5
        String answer = "";

        int len = numbers.length;
        int leftIndex = 10;
        int rightIndex = 12;
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftIndex = number; // 4
            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightIndex = number; // 3
            } else {
                if (number == 0) number = 11;
                int leftdist = Math.abs(number - leftIndex)/3 + Math.abs(number - leftIndex) %3;
                int rightdist = Math.abs(number - rightIndex)/3 + Math.abs(number - rightIndex)%3;

                if (leftdist < rightdist) {
                    answer += "L";
                    leftIndex = number;
                } else if (leftdist > rightdist) {
                    answer += "R";
                    rightIndex = number;
                } else {
                    if (hand.equals("left")) {
                        answer+= "L";
                        leftIndex = number;
                    } else {
                        answer+="R";
                        rightIndex = number;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(1/3);
        System.out.println(1%3);
    }

}
