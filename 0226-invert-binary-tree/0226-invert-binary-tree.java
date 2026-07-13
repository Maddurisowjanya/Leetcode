/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
       
        if(root==null || (root.left==null && root.right==null)){
            return root;
        }      
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int a = q.size();
            List<Integer> l = new ArrayList<>();
            while(a>0){
                TreeNode curr = q.poll();
                if(curr.left !=null || curr.right !=null){
                    TreeNode p= curr.left;
                    curr.left=curr.right;
                    curr.right=p;
                }
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                a--;
            }
           
        }
        return root;
    }
}