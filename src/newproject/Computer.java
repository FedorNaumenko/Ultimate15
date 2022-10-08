/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import static java.nio.file.Files.move;
import java.util.ArrayList;
/**
 *
 * @author User
 */
/*
public class Computer {
    Board board;
    Move bestMove;
    int depth = 3;
    int c;
    
    public Computer(Board board) {
        this.board = board;            
    }
    
    void DoStep() {
        int maxGrade = Integer.MIN_VALUE;
        ArrayList<Move>  moves = getPossibleMoves(board.enableSquare);
        for (int i = 0; i < moves.size(); i++) {
             c++;
           DoMove(moves.get(i));
            int grade = Min(depth);
            if ( grade > maxGrade)
            {
               maxGrade = grade;
               bestMove = moves.get(i);
            }
            UnDoMove(moves.get(i));
        }
        DoBestMove();               
    }
    
    int Min(int depth) {
        if ( depth == 0 )
            return evaluate();
        int minGrade = Integer.MAX_VALUE;
        ArrayList<Move>  moves = getPossibleMoves(board.enableSquare);
        for (int i = 0; i < moves.size(); i++) {
            c++;
            DoMove(moves.get(i));
            int grade = Max(depth-1);
            if ( grade < minGrade)
               minGrade = grade;
            UnDoMove(moves.get(i));
        }
        return minGrade;              
    }
    int Max(int depth) {
        if ( depth == 0 )
            return evaluate();
        int maxGrade = Integer.MIN_VALUE;
        ArrayList<Move>  moves = getPossibleMoves(board.enableSquare);
        for (int i = 0; i < moves.size(); i++) {
            c++;
            DoMove(moves.get(i));
            int grade = Min(depth-1);
            if ( grade > maxGrade)
               maxGrade = grade;
            UnDoMove(moves.get(i));
        }
        return maxGrade;              
    }

    void DoMove(Move move){
        
    }
    
    void UnDoMove(Move move){
        
    }

    private int evaluate(Square enableSquare) {
        
        //return score;
        return 1;
    }
    
    private int evaluateLine(Square cells[][]){
        int score = 0;
        
        
        
        return score;
    }

    private ArrayList<Move> getPossibleMoves(Square enableSquare) {
        ArrayList<Move>  moves = new ArrayList<Move>();
        for(int i = 0;i < Square.N ;i++) {
            for(int j = 0;j < Square.N;j++){
                if( enableSquare.cells[i][j].getText().equals("")){
                    for (int num = 1; num < 10; num++) {
                        if ( enableSquare.Check(num))
                            moves.add(new Move(i,j,num));
                    }
                }
            }
        }
        return moves;
    }

    private void DoBestMove() {
        board.enableSquare.cells[bestMove.row][bestMove.col].setText(""+ bestMove.num);
        board.enableSquare.values |= 1<<bestMove.num;
        board.enableSquare.cells[bestMove.row][bestMove.col].determineWhoseTurn();
        board.enableOne(bestMove.row,bestMove.col);
    }

   

}*/
