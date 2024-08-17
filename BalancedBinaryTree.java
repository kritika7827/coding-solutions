class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {

        if(root == null) return true;

        return Math.abs(isHeightBalanced(root.left)- isHeightBalanced(root.right)) > 1 ? false : 
        (isBalanced(root.left) && isBalanced(root.right)) ? true : false; 
        
    }

    public int isHeightBalanced(TreeNode root){

        if(root == null) return -1;

        return 1+ Math.max(isHeightBalanced(root.left),isHeightBalanced(root.right));
    }
}
