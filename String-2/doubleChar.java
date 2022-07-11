public String doubleChar(String str)
    {
        String r = "";
        for(int i = 0;i < str.length();i++)
        {
            r += (str.substring(i, i+1));
            r += (str.substring(i, i+1));
        }
        return r;
    }
