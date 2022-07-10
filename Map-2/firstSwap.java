public String[] firstSwap(String[] strings) 
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>(); 
        for(int i = 0;i<strings.length;i++)
        {
            if(map.containsKey(strings[i].charAt(0)) && map.get(strings[i].charAt(0)) != -1)
            {
                int poz = map.get(strings[i].charAt(0));
                map.put(strings[i].charAt(0), -1);
                String aux = strings[i];
                strings[i] = strings[poz];
                strings[poz] = aux;
            }
            else if(!map.containsKey(strings[i].charAt(0)))
                map.put(strings[i].charAt(0), i);
        }

        return strings;
    }
