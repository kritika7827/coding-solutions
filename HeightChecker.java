class HeightChecker {
    public int heightChecker(int[] heights) {

        int mismatchCount = 0;
        
        int[] expected = new int[heights.length];

        for(int i=0;i < heights.length; i++){
            expected[i] = heights[i];
        }
        
        Arrays.sort(expected);

        for(int i=0; i <heights.length ; i++){
            if(expected[i] != heights[i])
            mismatchCount++;
        }

        return mismatchCount;
    }
}
