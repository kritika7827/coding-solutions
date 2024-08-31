class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        
        //use dfs
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int perimeter = 0;

        for(int i=0;i< m;i++){
            for (int j =0;j< n;j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    perimeter += dfs(i,j,grid,vis);
                }
            }
        }
        return perimeter;
    }

    public int dfs(int row, int col, int[][] grid, boolean[][] vis){

        vis[row][col] = true;
        int[][] directions = {{-1,0}, {1,0}, {0,1},{0,-1}};
        int m = grid.length;
        int n = grid[0].length;
        int perimeter =0;

        for(int[] direction : directions){
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if(newRow < 0 || newRow >= m || newCol<0 || newCol>=n || grid[newRow][newCol] == 0){
                perimeter+= 1;
            }
            else if (!vis[newRow][newCol] && grid[newRow][newCol]==1){
                perimeter += dfs(newRow, newCol, grid, vis);
            }
        }
        return perimeter;
    }
}
