int createAnagram(String s, String t) {

  int[] cnt1 = new int[26];
  int[] cnt2 = new int[26];
  for (int i = 0; i < s.length(); i++) {
    cnt1[s.charAt(i) - 'A']++;
    cnt2[t.charAt(i) - 'A']++;
  }

  int ans = 0;
  for (int i = 0; i < 26; i++) {
    ans += Math.abs(cnt1[i] - cnt2[i]);
  }

  return ans / 2;
}
