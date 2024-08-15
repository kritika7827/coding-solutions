class HappyNumber {
    public boolean isHappy(int n) {

        HashSet<Integer> uniqueSet = new HashSet<>();

        while(n !=1 && !uniqueSet.contains(n)){
            uniqueSet.add(n);
            n = getSum(n);
        }
        
        return n== 1;
    }


    public int getSum(int n){
        int sum = 0;
        while(n > 0){
            sum+= (n%10)* (n%10);
            n = n/10;
        }
        return sum;
    }
}
