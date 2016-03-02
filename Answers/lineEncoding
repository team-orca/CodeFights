String lineEncoding(String s) {

  s += "#";
  int cnt = 1;
  StringBuilder result = new StringBuilder();
  for (int i = 1; i < s.length(); i++) {
    if (s.charAt(i) == s.charAt(i - 1)) {
      cnt++;
    } else {
      if (cnt > 1) {
        result.append(cnt);
      }
      result.append(s.charAt(i-1));
        cnt=1;
    }
  }

  return result.toString();
}
