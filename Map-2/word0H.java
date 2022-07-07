public Map<String, Integer> word0(String[] strings) 
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String x : strings)
        {
            map.put(x, 0);
        }
        return map;
    }
