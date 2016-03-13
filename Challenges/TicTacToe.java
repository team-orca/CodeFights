boolean TicTacToe(char[][] board) {
    int counterO=0, counterX=0;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(board[i][j] == 'x'){
                counterX++;
            }
            if(board[i][j] == 'o'){
                counterO++;
            }
        }
    }
    if(counterX-counterO == 1 || (counterO== 0 && counterX==0) || counterX==counterO)
        return true;
    return false;
}
