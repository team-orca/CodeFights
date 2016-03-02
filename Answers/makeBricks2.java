int makeBricks(int a, int b, int c) {
    return a+b*5 < c | c%5 > a? 0 : 1;
}
