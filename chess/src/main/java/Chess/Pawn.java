/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 *
 * @author pc
 */
public class Pawn extends Piece {

    public Pawn(int color, int position, int moved) {
        super(color, position, moved);
    }

    @Override
    public void ViewMove(int position, ArrayList<Cell> cells) {
        if(getColor()==0){
            try{
            if(position/8==6){
                if(cells.get(position-8).isEmpty()==true)
                {
                    cells.get(position-8).getPane().setBackground(App.green);
                    cells.get(position-8).setCurrentColor("GREEN");
                }
                if(cells.get(position-16).isEmpty()==true && cells.get(position-8).isEmpty()==true)
                {
                    cells.get(position-16).setCurrentColor("GREEN");
                    cells.get(position-16).getPane().setBackground(App.green);
                }
                if(position%8!=7){
                    if(cells.get(position-8+1).isEmpty()==false && cells.get(position-8+1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {
                        cells.get(position-8+1).setCurrentColor("RED");
                        cells.get(position-8+1).getPane().setBackground(App.red);
                    }
                }
                if(position%8!=0){
                    if(cells.get(position-8-1).isEmpty()==false && cells.get(position-8-1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {
                        cells.get(position-8-1).getPane().setBackground(App.red);
                        cells.get(position-8-1).setCurrentColor("RED");
                    }
                }
            }else{
                if(cells.get(position-8).isEmpty()==true)
                {
                    cells.get(position-8).getPane().setBackground(App.green);
                    cells.get(position-8).setCurrentColor("GREEN");
                }
                if(position%8!=7){
                    if(cells.get(position-8+1).isEmpty()==false && cells.get(position-8+1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {
                        cells.get(position-8+1).getPane().setBackground(App.red);
                        cells.get(position-8+1).setCurrentColor("RED");
                    }
                }
                if(position%8!=0){
                    if(cells.get(position-8-1).isEmpty()==false && cells.get(position-8-1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {
                        cells.get(position-8-1).getPane().setBackground(App.red);
                        cells.get(position-8-1).setCurrentColor("RED");
                    }
                }
            }
            }catch(Exception e){
            }
        }else if(getColor()==1){
            try{
            if(position/8==1){
                if(cells.get(position+8).isEmpty()==true)
                {    
                    cells.get(position+8).getPane().setBackground(App.green);
                    cells.get(position+8).setCurrentColor("GREEN");
                }
                if(cells.get(position+16).isEmpty()==true && cells.get(position+8).isEmpty()==true)
                {    
                    cells.get(position+16).getPane().setBackground(App.green);
                    cells.get(position+16).setCurrentColor("GREEN");
                }
                if(position%8!=7){
                    if(cells.get(position+8+1).isEmpty()==false && cells.get(position+8+1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {
                        cells.get(position+8+1).getPane().setBackground(App.red);
                        cells.get(position+8+1).setCurrentColor("RED");
                    }
                }
                if(position%8!=0){
                    if(cells.get(position+8-1).isEmpty()==false && cells.get(position+8-1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {        
                        cells.get(position+8-1).getPane().setBackground(App.red);
                        cells.get(position+8-1).setCurrentColor("RED");
                    }
                }
            }else{
                if(cells.get(position+8).isEmpty()==true)
                {    
                    cells.get(position+8).getPane().setBackground(App.green);
                    cells.get(position+8).setCurrentColor("GREEN");
                }
                if(position%8!=7){
                    if(cells.get(position+8+1).isEmpty()==false && cells.get(position+8+1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {    
                        cells.get(position+8+1).getPane().setBackground(App.red);
                        cells.get(position+8+1).setCurrentColor("RED");
                    }
                }
                if(position%8!=0){
                    if(cells.get(position+8-1).isEmpty()==false && cells.get(position+8-1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
                    {
                        cells.get(position+8-1).getPane().setBackground(App.red);
                        cells.get(position+8-1).setCurrentColor("RED");
                    }
                }
            }
            }catch(Exception e){
            }
        
        }
            
    }
    
}
