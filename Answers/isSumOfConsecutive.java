boolean isSumOfConsecutive(int n) {
    if((n > 0) && ((n & (n - 1)) == 0)){
        return false;
    }
    return true;
    
}
//The impolite numbers are exactly the powers of two.
//See wiki about Polite Numbers: https://en.wikipedia.org/wiki/Polite_number
