public String[] allSwap(String[] strings)
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<strings.length;i++)
        {
            if(map.containsKey(strings[i].charAt(0)))
            {
                int poz = map.get(strings[i].charAt(0));
                String aux = strings[i];
                strings[i] = strings[poz];
                strings[poz] = aux;
                map.remove(strings[i].charAt(0));
            }
            else
                map.put(strings[i].charAt(0),i);
        }

        return strings;
    }
