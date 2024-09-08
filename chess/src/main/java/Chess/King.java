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
public class King extends Piece{

    public King(int color, int position, int moved) {
        super(color, position, moved);
    }
    
    @Override
    public void ViewMove(int  position ,ArrayList<Cell> cells){
        try{
            if(cells.get(position+1).isEmpty()==true && !(  position%8==7))
            {
                cells.get(position+1).getPane().setBackground(App.green);
                cells.get(position+1).setCurrentColor("GREEN");
            }
            else if(cells.get(position+1).isEmpty()==false && !(  position%8==7) && cells.get(position+1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            {
                cells.get(position+1).getPane().setBackground(App.red);
                cells.get(position+1).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        try{
            if(cells.get(position-1).isEmpty()==true && !(  position%8==0) )
            { 
                cells.get(position-1).getPane().setBackground(App.green);
                cells.get(position-1).setCurrentColor("GREEN");
            }
            else if( cells.get(position-1).isEmpty()==false && !(  position%8==0) && cells.get(position-1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            {  
                cells.get(position-1).getPane().setBackground(App.red);
                cells.get(position-1).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        try{
            if(cells.get(position+8).isEmpty()==true)
            { 
                cells.get(position+8).getPane().setBackground(App.green);
                cells.get(position+8).setCurrentColor("GREEN");
            }
            else if(cells.get(position+8).isEmpty()==false && cells.get(position+8).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            {
                cells.get(position+8).getPane().setBackground(App.red);
                cells.get(position+8).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        try{
            if(cells.get(position-8).isEmpty()==true)
            {
                cells.get(position-8).getPane().setBackground(App.green);
                cells.get(position-8).setCurrentColor("GREEN");
            }
            else if(cells.get(position-8).isEmpty()==false  && cells.get(position-8).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            { 
                cells.get(position-8).getPane().setBackground(App.red);
                cells.get(position-8).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        // double
        try{
            if(cells.get(position+1+8).isEmpty()==true && !(  position%8==7 || position/8==7))
            {
                cells.get(position+1+8).getPane().setBackground(App.green);
                cells.get(position+1+8).setCurrentColor("GREEN");
            }
            else if(cells.get(position+1+8).isEmpty()==false && !(  position%8==7 || position/8==7) && cells.get(position+1+8).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            {
                cells.get(position+1+8).getPane().setBackground(App.red);
                cells.get(position+1+8).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        try{
            if(cells.get(position-1+8).isEmpty()==true && !(  position%8==0 || position/8==7) )
            { 
                cells.get(position-1+8).getPane().setBackground(App.green);
                cells.get(position-1+8).setCurrentColor("GREEN");
            }
            else if( cells.get(position-1+8).isEmpty()==false && !(  position%8==0 || position/8==7) && cells.get(position-1+8).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            {  
                cells.get(position-1+8).getPane().setBackground(App.red);
                cells.get(position-1+8).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        try{
            if(cells.get(position+1-8).isEmpty()==true && !(  position%8==7 || position/8==0))
            { 
                cells.get(position+1-8).getPane().setBackground(App.green);
                cells.get(position+1-8).setCurrentColor("GREEN");
            }
            else if(cells.get(position+1-8).isEmpty()==false && !(  position%8==7 || position/8==0) && cells.get(position+1-8).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            {
                cells.get(position+1-8).getPane().setBackground(App.red);
                cells.get(position+1-8).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        try{
            if(cells.get(position-8-1).isEmpty()==true && !(  position%8==0 || position/8==0) )
            {
                cells.get(position-8-1).getPane().setBackground(App.green);
                cells.get(position-8-1).setCurrentColor("GREEN");
            }
            else if(cells.get(position-8-1).isEmpty()==false && !(  position%8==0 || position/8==0) && cells.get(position-8-1).getPiece().getColor()!=cells.get(position).getPiece().getColor())
            { 
                cells.get(position-8-1).getPane().setBackground(App.red);
                cells.get(position-8-1).setCurrentColor("RED");
            }
        }catch(Exception e){
        }
        
    }
}
