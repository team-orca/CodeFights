boolean triangleExistence(int[] sides) {
    Arrays.sort(sides);
    if(sides[0]+sides[1]<sides[2])
        return false;
    return true;
}

