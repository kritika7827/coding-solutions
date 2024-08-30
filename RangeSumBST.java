class RangeSumBST {
    int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {

        dfs(root, low, high);
        return ans;
    }

    public void dfs(TreeNode node, int low, int high){

        if(node != null){
            if(low<= node.val && node.val <= high){
                ans+=node.val;
            }
            if(node.val > low)
            dfs(node.left, low,high);

            if(node.val < high)
            dfs(node.right,low,high);
        }
    }
}
