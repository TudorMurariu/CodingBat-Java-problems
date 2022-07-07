public boolean endsLy(String str) {
  if(str.length() < 2)
    return false;
  return str.charAt(str.length()-1) == 'y' && str.charAt(str.length()-2) == 'l';
}
