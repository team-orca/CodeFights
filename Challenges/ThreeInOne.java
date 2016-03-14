int ThreeInOne(int[] a, char o, int s) {
    int A =0, i, l=a.length;
    for(i=0; i<l; i++)
        A+=a[i];
    A/=l;
    switch (o) {
  case '+': return A+s;
  case '-': return A - s;
  case '*': return A*s;
  }
  return A/s;
}
