class DifferenceArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        List<List<Integer>> mergedList = new ArrayList();

        for (int i=0;i< nums1.length;i++){
            if(!list2.contains(nums1[i]) && !diff1.contains(nums1[i])){
                diff1.add(nums1[i]);
            }
        } 

        for (int i=0;i< nums2.length;i++){
            if(!list1.contains(nums2[i]) && !diff2.contains(nums2[i])){
                diff2.add(nums2[i]);
            }
        } 
        mergedList.add(diff1);
        mergedList.add(diff2);

        return mergedList;
    }
}
