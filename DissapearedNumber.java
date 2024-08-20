class DissapearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> missingList = new ArrayList<Integer>();
        List<Integer> initialList = Arrays.stream(nums).boxed().toList();
        int n = nums.length;

        for(int i=1;i<=n;i++){
            if(!initialList.contains(i)){
                missingList.add(i);
            }
        }

        return missingList;
    }
}
