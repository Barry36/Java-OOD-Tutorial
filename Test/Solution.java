///**
// * Definition of TreeNode:
// * public class TreeNode {
// *     public int val;
// *     public TreeNode left, right;
// *     public TreeNode(int val) {
// *         this.val = val;
// *         this.left = this.right = null;
// *     }
// * }
// */
//class ResultType {
//    public boolean a_exist, b_exist;
//    public TreeNode node;
//    ResultType(boolean a, boolean b, TreeNode n) {
//        a_exist = a;
//        b_exist = b;
//        node = n;
//    }
//}
//
public class Solution {
    /**
     * @param root The root of the binary tree.
     * @param A and B two nodes
     * @return: Return the LCA of the two nodes.
     */
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        String s = new String();
        System.out.println(chars.toString());
        System.out.println(chars.toString().equals("abc"));
    }

    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so
        // that we can skip
        // middle five numbers
        // in below loop
        if (n % 2 == 0 ||
                n % 3 == 0)
            return false;

        for (int i = 5;
             i * i <= n; i = i ++)
            if (n % i == 0 ||
                    n % (i + 2) == 0)
                return false;

        return true;
    }
}