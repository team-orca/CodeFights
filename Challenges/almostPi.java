String almostPi(double n) {
    double PI=3.14159265359, r = (n / PI) *100;
    String s=  String.format("%.02f", r);
    return s +"%";
}
