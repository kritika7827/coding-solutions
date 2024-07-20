class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> duplicateSet = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            if(duplicateSet.contains(nums[i])){
                return true;
            }
            duplicateSet.add(nums[i]);
            if(duplicateSet.size() > k){
                duplicateSet.remove(nums[i-k]);
            }
        }
        return false;
    
