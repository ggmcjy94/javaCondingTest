package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 백트래킹 backtracking
 * recursion + termination check
 */
public class _22_GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        process(n, 0, 0,"", ret);//recurse
        return ret;
    }
    // numClosed > numOpen -> invalid 오픈 갯수가 많거나 같아야함
    private void process(int n, int numOpen, int numClose, String str ,List<String> ret) {
        //terminate check
        if (numOpen == n && numClose == n) {
            ret.add(str);
            return;
        }
        // recurse next
        if (numOpen < n) {
            process(n, numOpen + 1, numClose,str+"(", ret);// add open bracket
        }
        if (numOpen > numClose) {
            process(n, numOpen ,numClose + 1, str+")", ret); // add close bracket
        }

    }
}
