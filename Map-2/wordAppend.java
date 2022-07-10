public String wordAppend(String[] strings) 
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String r = "";
        for(String x : strings)
        {
            if(map.containsKey(x))
            {
                int c = map.get(x);
                map.put(x, ++c);
                if(c % 2 == 0)
                    r += x;
            }
            else
                map.put(x, 1);
        }

        return r;
    }
