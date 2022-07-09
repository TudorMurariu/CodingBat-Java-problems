public int[] zeroFront(int[] nums) 
    {
        int count0 = 0;
        int[] list = new int[nums.length+1]; 
        int j1 = 0;
        for(int i = 0;i< nums.length;i++)
        {
            if(nums[i] == 0)
                count0++;
            else
                list[j1++] = nums[i];
        }


        int i = 0;
        while(count0 != 0)
        {
            nums[i++] = 0;
            count0--;
        }

        for(int j = 0;j < j1 ;j++)
            nums[i++] = list[j];
        return nums;
    }
