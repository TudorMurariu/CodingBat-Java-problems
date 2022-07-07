public Map<String, Integer> wordLen(String[] strings) 
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String x : strings)
        {
            map.put(x, x.length());
        }
        return map;
    }
