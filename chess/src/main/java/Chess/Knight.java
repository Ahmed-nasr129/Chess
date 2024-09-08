/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author pc
 */
public class Knight extends Piece{

    public Knight(int color, int position, int moved) {
        super(color, position, moved);
    }
    @Override
    public void ViewMove(int  position ,ArrayList<Cell> cells){
        
        if(position%8>=2){
            try{
                if(cells.get(position-2+8).isEmpty()==true){
                    cells.get(position-2+8).getPane().setBackground(App.green);
                    cells.get(position-2+8).setCurrentColor("GREEN");
                }else if(cells.get(position-2+8).isEmpty()==false && cells.get(position-2+8).getPiece().getColor()!= cells.get(position).getPiece().getColor() ){
                    cells.get(position-2+8).getPane().setBackground(App.red);
                    cells.get(position-2+8).setCurrentColor("RED");
                }
                }catch(Exception e){
            }

            try{
                if(cells.get(position-2-8).isEmpty()==true){
                    cells.get(position-2-8).getPane().setBackground(App.green);
                    cells.get(position-2-8).setCurrentColor("GREEN");
                }else if(cells.get(position-2-8).isEmpty()==false && cells.get(position-2-8).getPiece().getColor()!= cells.get(position).getPiece().getColor() ){
                    cells.get(position-2-8).getPane().setBackground(App.red);
                    cells.get(position-2-8).setCurrentColor("RED");
                }
            }catch(Exception e){
            }
        }
        if(position%8<=5){
            try{
                if(cells.get(position+2-8).isEmpty()==true){
                    cells.get(position+2-8).getPane().setBackground(App.green);
                    cells.get(position+2-8).setCurrentColor("GREEN");
                }else if(cells.get(position+2-8).isEmpty()==false && cells.get(position+2-8).getPiece().getColor()!= cells.get(position).getPiece().getColor() ){
                    cells.get(position+2-8).getPane().setBackground(App.red);
                    cells.get(position+2-8).setCurrentColor("RED");
                }
            }catch(Exception e){
            }

            try{
                if(cells.get(position+2+8).isEmpty()==true){
                    cells.get(position+2+8).getPane().setBackground(App.green);
                    cells.get(position+2+8).setCurrentColor("GREEN");
                }else if(cells.get(position+2+8).isEmpty()==false && cells.get(position+2+8).getPiece().getColor()!= cells.get(position).getPiece().getColor() ){
                    cells.get(position+2+8).getPane().setBackground(App.red);
                    cells.get(position+2+8).setCurrentColor("RED");
                }
            }catch(Exception e){
            }


        }
        if(position%8<=6){
            try{
                if(cells.get(position-16+1).isEmpty()==true){
                    cells.get(position-16+1).getPane().setBackground(App.green);
                    cells.get(position-16+1).setCurrentColor("GREEN");
                }else if(cells.get(position-16+1).isEmpty()==false && cells.get(position-16+1).getPiece().getColor()!= cells.get(position).getPiece().getColor() )
                {
                    cells.get(position-16+1).getPane().setBackground(App.red);
                    cells.get(position-16+1).setCurrentColor("RED");
                }
            }catch(Exception e){
            }

            ////
            try{
                if(cells.get(position+16+1).isEmpty()==true){
                    cells.get(position+16+1).getPane().setBackground(App.green);
                    cells.get(position+16+1).setCurrentColor("GREEN");
                }else if(cells.get(position+16+1).isEmpty()==false && cells.get(position+16+1).getPiece().getColor()!= cells.get(position).getPiece().getColor() )
                {
                    cells.get(position+16+1).getPane().setBackground(App.red);
                    cells.get(position+16+1).setCurrentColor("RED");
                }
            }catch(Exception e){
            }
            
            

        }
        if(position%8>=1){
            
            try{
                if(cells.get(position+16-1).isEmpty()==true){
                    cells.get(position+16-1).getPane().setBackground(App.green);
                    cells.get(position+16-1).setCurrentColor("GREEN");
                }else if(cells.get(position+16-1).isEmpty()==false && cells.get(position+16-1).getPiece().getColor()!= cells.get(position).getPiece().getColor() )
                {
                    cells.get(position+16-1).getPane().setBackground(App.red);
                    cells.get(position+16-1).setCurrentColor("RED");
                }
            }catch(Exception e){
            }
            
            ////
            try{
                if(cells.get(position-16-1).isEmpty()==true){
                    cells.get(position-16-1).getPane().setBackground(App.green);
                    cells.get(position-16-1).setCurrentColor("GREEN");
                }else if(cells.get(position-16-1).isEmpty()==false && cells.get(position-16-1).getPiece().getColor()!= cells.get(position).getPiece().getColor() )
                {
                    cells.get(position-16-1).getPane().setBackground(App.red);
                    cells.get(position-16-1).setCurrentColor("RED");
                }
            }catch(Exception e){
            }

        }
            
        
    }
    
    // should be abstract
//    public void Move(int positionFrom,int  positionTo ,ArrayList<Cell> cells,ArrayList<Piece> killed){
//    
//    }
    
}
