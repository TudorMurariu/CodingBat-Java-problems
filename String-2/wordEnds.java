public String wordEnds(String str, String word)
    {
        String r = "";
        for(int i = 0;i <= str.length() - word.length();i++)
            if(str.substring(i, i+word.length()).equals(word))
            {
                if(i == 0 && i + word.length() != str.length())
                    r  = r + str.charAt(i + word.length());
                else if(i != 0 && i + word.length() == str.length())
                    r  = r + str.charAt(i-1);
                else if(i != 0 && i + word.length() != str.length())
                    r = r + str.charAt(i-1) + str.charAt(i + word.length());
            }

        return r;
    }
