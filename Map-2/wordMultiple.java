public Map<String, Boolean> wordMultiple(String[] strings) 
    {
        Map<String, Boolean> map = new HashMap<String, Boolean>(); 
        for(String x : strings)
        {
            if(map.containsKey(x))
               map.put(x, true);
            else
                map.put(x, false);
        }

        return map;
    }
