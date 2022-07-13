public int bunnyEars(int bunnies)
    {
        // a lil bit cringe ngl
        if(bunnies == 0)
            return 0;
        return 2 + bunnyEars(bunnies-1);
    }
