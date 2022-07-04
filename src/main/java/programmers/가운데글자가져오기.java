package programmers;

public class 가운데글자가져오기 {

    String getMiddle(String word){
        String answer = "";
        if (word.length() % 2 == 1) {
            answer = String.valueOf(word.charAt(word.length()/2));
        } else {
            answer = word.charAt(word.length()/2-1) + String.valueOf(word.charAt(word.length()/2));
        }
        return answer;
    }

    public static void main(String[] args) {
        가운데글자가져오기 T = new 가운데글자가져오기();
        System.out.println(T.getMiddle("qwer"));
    }
}
