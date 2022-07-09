public Map<String, String> firstChar(String[] strings)
    {
        Map<String, String> map = new HashMap<String, String>();
        for(String x : strings)
            if(map.containsKey(x.substring(0, 1)))
            {
                String val = map.get(x.substring(0, 1));
                map.put(x.substring(0, 1), val.concat(x));
            }
            else
                map.put(x.substring(0, 1), x);

        return map;
    }
