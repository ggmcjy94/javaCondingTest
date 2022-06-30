package leetcode;


class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
public class _530_MinimumAbsoluteDifferenceInBST {
    //트리 순회(재귀)
    // preorder : self left right
    // inorder : left self right
    // postorder : left right self
    //이진검색트리 성질 -> inorder -> 오름차순 정렬이 됨!
    boolean init;
    int min;
    int prev;
    public int getMinimumDifference(TreeNode root) {
        init = false;
        min = Integer.MAX_VALUE;
        inorder(root);
        return min;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        //self 처리
        if (!init) {
            init = true;
        } else {
            min = Math.min(min, root.val-prev);
        }
        prev = root.val;
        inorder(root.right);
    }
}

