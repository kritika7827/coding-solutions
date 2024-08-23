class GCDTwoString {
    public String gcdOfStrings(String str1, String str2) {

        String gcdString = "";
        
        int l1 = str1.length();
        int l2 = str2.length();
        
        if(l1 <= l2){
            gcdString = findGCDString(l1,l2,str1,str2);
        }
        else if(l1 > l2){
            gcdString = findGCDString(l2,l1,str2,str1);
        }

        return gcdString;

    }

    public String findGCDString(int l1, int l2, String str1, String str2){

        String maxPrefix = "";

        for(int i=1;i <=l1;i++){
            String prefix = str1.substring(0,i);
            if(str2.contains(prefix) && (l2 % prefix.length()) == 0 && (l1 % prefix.length()) == 0 ){
                maxPrefix = prefix;
            }
        }
        return maxPrefix;
    }
}
