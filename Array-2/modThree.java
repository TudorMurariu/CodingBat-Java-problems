public boolean modThree(int[] nums)
    {
        int even = 0,odd = 0;
        for(int x : nums)
        {
            if(x % 2 == 1)
            {
                odd++;
                even = 0;
            }
            else
            {
                odd = 0;
                even++;
            }

            if(even == 3 || odd == 3)
                return true;
        }

        return false;
    }
