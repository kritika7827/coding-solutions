class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {

        int l = s.length();
        String sub ="";

        for(int i=0;i< l-1;i++){
            sub += s.charAt(i);
            boolean isRepeated = ifSubString(sub, s);
            if(isRepeated) return true;
        }

        return false;
    }

    public boolean ifSubString(String subString, String mainString){

        int l = mainString.length();
        int s = subString.length();

        String substitute = subString;

        int i=0; int j=0;
        while(subString.length() <=l){
            if(subString.equals(mainString)) return true;
            subString = subString.concat(substitute);
            i+=s;
        }

        return false;
    }
}
