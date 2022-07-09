public List<String> moreY(List<String> strings) 
    {
        return strings.stream().map(n -> "y"+n+"y").collect(Collectors.toList());
    }
