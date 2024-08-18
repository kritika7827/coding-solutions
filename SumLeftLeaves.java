class SumLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {

        return dfs(root, false);

    }

    public int dfs(TreeNode subtree, boolean isLeft){

        if(subtree == null) return 0;

        if(subtree.left == null && subtree.right == null) {
            return isLeft ? subtree.val : 0;
        }

        return dfs(subtree.left, true) +dfs(subtree.right, false);

    }
}
