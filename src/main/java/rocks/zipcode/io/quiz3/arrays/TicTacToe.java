package rocks.zipcode.io.quiz3.arrays;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
String[][] board;
    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {

    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] colArr=new String[3];

        for(int i=0;i<3;i++) {

            colArr[i]=board[i][value];

        }
        return colArr;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
    String[] ishomo = getRow(rowIndex);
//    for(int i=0;i<2;i++){
//        if(!ishomo[i].equals(ishomo[i+1])){
//            return false;
//        }
//    }
//        return true;
        return checkEqual(ishomo);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] colHomo=getColumn(columnIndex);
//        for(int i=0;i<2;i++){
//            if(!colHomo[i].equals(colHomo[i+1])) {
//                return false;
//            }
//        }
//        return true;

        return checkEqual(colHomo);
    }

    public String getWinner() {
        for(int i=0;i<2;i++){
            if(isRowHomogenous(i)){
                return board[i][0];
            }
            if(isColumnHomogeneous(i)){
                return board[0][i];
            }
            if(isDigonallyHomo()){
                return board[1][1];
            }
        }

        return null;
    }

    public String[][] getBoard() {


        return null;
    }

    public Boolean isDigonallyHomo(){
        String[] diag1 = {board[0][0], board[1][1],board[2][2]};
        String[] diag2 = {board[0][2], board[1][1],board[2][0]};
        if(checkEqual(diag1)||checkEqual(diag2))
        {return true;}
        return false;
    }

    private Boolean checkEqual(String[] arraytobeChecked){
        for(int i=0;i<2;i++){
            if(!arraytobeChecked[i].equals(arraytobeChecked[i+1])) {
                return false;
            }
        }
        return true;
    }


}
