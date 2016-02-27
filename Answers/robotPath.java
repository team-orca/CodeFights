//CodeFights RobotPath Question
int[] robotPath(String instructions, int bound) {

  int[] dx = {-1, 0, 1,  0};
  int[] dy = { 0, 1, 0, -1};
  int x = 0, y = 0;

  String directions = "LURD";

  for (int i = 0; i < instructions.length(); i++) {
    int dirIndex = 0;
    for (int j = 1; j < 4; j++) {
      if (instructions.charAt(i) == directions.charAt(j)) {
