// we use the list api
public List<Integer> doubling(List<Integer> nums) 
    {
        nums.replaceAll(n -> n*2);
        return nums;
    }
 
// or this way using Java stream system 
public List<Integer> doubling(List<Integer> nums) 
    {
        return nums.stream().map(n -> n*2).collect(Collectors.toList());
    }
