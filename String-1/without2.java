public String without2(String str) {
  if(str.length() < 2)
    return str;
  if(str.charAt(0) == str.charAt(str.length()-2) && str.charAt(1) == str.charAt(str.length()-1)){
    return str.substring(2,str.length());
  }
  return str;
}
