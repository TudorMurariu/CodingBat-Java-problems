public List<String> addStar(List<String> strings) 
    {
        return strings.stream().map(n -> n+"*").collect(Collectors.toList());
    }

// or 

public List<String> addStar(List<String> strings) 
    {
        strings.replaceAll(n -> n+"*");
        return strings;
    }
