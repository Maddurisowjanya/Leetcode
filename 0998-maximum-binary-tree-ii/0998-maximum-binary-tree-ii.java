class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(val>root.val){
            TreeNode newnode=new TreeNode(val);
            newnode.left=root;
            return newnode;
        }
        root.right=insertIntoMaxTree(root.right,val);
        return root;
    }
}