package programmers;

public class 비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String formatsum = "";
            String format = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
            String format2 = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
            System.out.println("format : " + format);
            System.out.println("format2 : " +format2);
            for (int j = 0; j < format2.length(); j++) {
                if (format.charAt(j) == '1' || format2.charAt(j) == '1') {
                    formatsum += '1';
                } else {
                    formatsum += '0';
                }
            }
            String replaceFormatOne = formatsum.replace('1', '#');
            String replaceFormatZero = replaceFormatOne.replace('0', ' ');
            answer[i] = replaceFormatZero;
        }
        return answer;
    }


    public static void main(String[] args) {
        비밀지도 T = new 비밀지도();
        for (String s : T.solution2(5, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10})) {
            System.out.println(s);
        }
    }

    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
