int differentSubstringsTrie(String inputStr) {

  class Helper {
    void addNode(ArrayList<int[]> lastVersion) {
      int[] line = new int[26];
      lastVersion.add(line);
    }
  }
  Helper h = new Helper();

  int nodesCount = 1;
  ArrayList<int[]> trie = new ArrayList<>();
  h.addNode(trie);

  for (int i = 0; i < inputStr.length(); i++) {
    int currentNode = 0;
    for (int j = i; j < inputStr.length(); j++) {
      int symbol =  inputStr.charAt(j)-97 ;
      if (trie.get(currentNode)[symbol] == 0) {
        h.addNode(trie);
        trie.get(currentNode)[symbol] = nodesCount;
        nodesCount++;
      }
      currentNode = trie.get(currentNode)[symbol];
    }
  }

  return nodesCount - 1;
}
