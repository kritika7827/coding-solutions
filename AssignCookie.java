class AssignCookie {
    public int findContentChildren(int[] g, int[] s) {

        int contentChildren = 0;
        
        Arrays.sort(g);
        Arrays.sort(s);

        int i=0; int j=0;

        while(j < s.length && i< g.length){
            if(s[j] >= g[i]){
                contentChildren++;
                i++; j++;
            }
            else{
                j++;
            }
        }

    return contentChildren;
    }
}
