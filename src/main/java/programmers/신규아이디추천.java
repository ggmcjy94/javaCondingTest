package programmers;

public class 신규아이디추천 {
    public String solution(String new_id) {
        String answer = "";
        String step_1 = new_id.toLowerCase();
        StringBuilder step_2 = new StringBuilder();
        for (char c : step_1.toCharArray()) {
            if ((c >= 'a' && c <= 'z')|| (c >= '0' && c<='9') || c=='-' || c=='_'|| c=='.') {
                step_2.append(c);
            }
        }

        String step3 = step_2.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }

        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length()-1) == '.') {
                step4 = step4.substring(0, step4.length()-1);
            }
        }

        String step5 = step4;
        if (step5.equals("")) {
            step5 = "a";
        }

        String step6 = step5;
        while (step6.length() >= 16) {
            step6 = step6.substring(0, 15);
            if (step6.charAt(step6.length() -1) == '.') {
                step6 = step6.substring(0, step6.length() -1);
            }

        }

        StringBuilder step7 = new StringBuilder(step6);
        if (step7.length() <= 2) {
            char end = step7.charAt(step7.length() - 1);
            while (step7.length() < 3) {
                step7.append(end);
            }
        }
        answer = String.valueOf(step7);
        return answer;
    }

    public String solution2(String new_id) {
        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();
        return s;
    }

    private static class KAKAOID {
        private String s;
        KAKAOID(String s) {
            this.s = s;
        }
        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KAKAOID noStartEndDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }
        private String getResult() {
            return s;
        }
    }
    public static void main(String[] args) {
        신규아이디추천 T = new 신규아이디추천();
        System.out.println(T.solution2("...!@BaT#*..y.abcdefghijklm"));
    }
}
