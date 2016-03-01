 ArrayList<String> fileNaming(String[] names) {
		  class HashMapElement {
		    String element;
		    int hash;
		    int version; //the smallest possible integer to use with this name

		    HashMapElement(String a, int b, int c) {
		      element = a;
		      hash = b;
		      version = c;
		    }
		  };

		  class Helper {
		    int hashMapSize;
		    HashMapElement[] hashMap;

		    Helper(int halfSize) {
		      hashMapSize = halfSize * 2;
		      hashMap = new HashMapElement[hashMapSize];
		      for (int i = 0; i < hashMapSize; i++) {
		        hashMap[i] = new HashMapElement("", -1, 0);
		      }
		    }

		    int calculateHash(String inputString) {
		      final int P = 997,
		                M = 28001;
		      int hashValue = 0;
		      for (int i = 0; i < inputString.length(); i++) {
		        hashValue = (hashValue * P + (int)inputString.charAt(i)) % M;
		      }
		      return hashValue;
		    }

		    int searchHM(int position, int hash) {
		      while (hashMap[position].element != ""
		          && hashMap[position].hash != hash) {
		        position = (position + 1) % hashMapSize;
		      }
		      return position;
		    }
		  };

		  ArrayList<String> result = new ArrayList<>();
		  Helper h = new Helper(names.length);

		  for (int i = 0; i < names.length; i++) {
		    int hash = h.calculateHash(names[i]),
		        startPos =  h.searchHM(h.calculateHash(names[i])%h.hashMapSize, hash);
		    if (h.hashMap[startPos].element == "") {
		      h.hashMap[startPos] = new HashMapElement(names[i], hash, 1);
		      result.add(names[i]);
		    }
		    else {
		      String newName = names[i] + "(" +
		          Integer.toString(h.hashMap[startPos].version) + ")";
		      int newNameHash = h.calculateHash(newName),
		          position = h.searchHM(newNameHash % h.hashMapSize, newNameHash);

		      while (h.hashMap[position].element != "") {
		        h.hashMap[startPos].version++;
		        newName = names[i] + "(" +
		            Integer.toString(h.hashMap[startPos].version) + ")";
		        newNameHash = h.calculateHash(newName);
		        position = h.searchHM(newNameHash % h.hashMapSize, newNameHash);
		      }
		      h.hashMap[position] = new HashMapElement(newName, newNameHash, 1);
		      result.add(newName);
		      h.hashMap[startPos].version++;
		    }
		  }
		  return result;
		}
}
