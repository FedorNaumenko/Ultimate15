/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static newproject.Square.N;

/**
 *
 * @author Fedor
 */
public class Cell extends JButton{
    
    static int CellSize = 66;
    int row, col;
    Square square;
    static boolean turn;
    
    public Cell(Square square, int row, int col) {
        this.square = square;
        this.row = row;
        this.col = col;
        this.setBounds(col*CellSize, row*CellSize, CellSize, CellSize);
        this.setFont(new Font("Arial", Font.BOLD, 40));
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               Cell cell = (Cell)e.getSource();
               cell.Click();
            }
        });
        square.add(this);
    }
    
    /*Check whos turn*/
    public void determineWhoseTurn(){
        this.setForeground( turn ?  Color.blue : Color.red);   
        turn = !turn;
    }
    
    private void Click(){
       String possibleValues = "123456789";
       String res =  JOptionPane.showInputDialog(square.board, "Please enter number");
       if ( res != null && res.length() == 1 && possibleValues.contains(res) && 
               this.square.Check(this, res) && (this.square.isFull(this) == false)){ 
            this.setText(res);
            determineWhoseTurn();
            square.WhoWon(square);
       }
       
    }
    
}

