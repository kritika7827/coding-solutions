class MaxHeightTriangle {
    public int maxHeightOfTriangle(int red, int blue) {

        int height = 0;
        int level =1;
        
        return Math.max(height(red,blue, level),height(blue,red, level));
    }

    public int height(int red, int blue, int level){

        //corner case

        if(red <=0 && blue <=0 ) return 0;


        if(level %2 ==0 && red - level >=0) return 1+ height(red-level, blue, level+1);
            
        else if(level %2 ==1 && blue - level >=0) return 1+ height(red, blue-level,level+1);

        return 0;
    }
}
