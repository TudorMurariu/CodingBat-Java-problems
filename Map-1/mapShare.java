public Map<String, String> mapShare(Map<String, String> map) {
  String a = map.get("a");
  if(a != null)
    map.put("b",a);
  map.remove("c");
  return map;
}
