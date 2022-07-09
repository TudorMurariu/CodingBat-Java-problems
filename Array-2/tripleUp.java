public boolean tripleUp(int[] nums)
    {
        if(nums.length < 3)
            return false;
        int c = 0, f = nums[0];
        for(int i = 1;i < nums.length; i++)
        {
            if(nums[i] == 1 + f)
                c++;
            else 
                c = 0;
            if( c == 2 )
                return true;
            f = nums[i];
        }
        return false;
    }
