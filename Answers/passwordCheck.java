boolean passwordCheck(String pass) {
    int l = pass.length();
     if(l<5)  return false;

     if (!pass.matches(".*[A-Z].*")) return false;

     if (!pass.matches(".*[a-z].*")) return false;

     if (!pass.matches(".*\\d.*")) return false;

     return true;
}
