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
public class Rook extends Piece{

    public Rook(int color, int position, int moved) {
        super(color, position, moved);
    }
    @Override
    public void ViewMove(int  position ,ArrayList<Cell> cells){
        try{
            int i=1;
            for(;i<8;i++){
                if(cells.get(position+8*i).isEmpty()==true && !(  position/8==7) )
                {    
                    cells.get(position+8*i).setCurrentColor("GREEN");
                    cells.get(position+8*i).getPane().setBackground(App.green);
                }
                else if( cells.get(position+8*i).isEmpty()==false && !(  position/8==7) && cells.get(position+8*i).getPiece().getColor()!= cells.get(position).getPiece().getColor() ){
                    cells.get(position+8*i).getPane().setBackground(App.red);
                    cells.get(position+8*i).setCurrentColor("RED");
                    break;
                }else
                    break;
                if((position+8*i)/8==7)
                    break;
            }
        }catch(Exception e){
        }
        
        try{
            int i=1;
            for(;i<8;i++){
                
                if(cells.get(position-8*i).isEmpty()==true && !(  position/8==0))
                {
                    cells.get(position-8*i).getPane().setBackground(App.green);
                    cells.get(position-8*i).setCurrentColor("GREEN");
                }
                else if( cells.get(position-8*i).isEmpty()==false && !(position/8==0)  && cells.get(position-8*i).getPiece().getColor()!=cells.get(position).getPiece().getColor() ){
                                cells.get(position-8*i).getPane().setBackground(App.red);
                                cells.get(position-8*i).setCurrentColor("RED");
                                break;
                }else
                    break;
                if((position-8*i)/8==0)
                    break;
            }
        }catch(Exception e){
        }
        
        try{
            int i=1;
            for(;i<8;i++){
                if(cells.get(position+i).isEmpty()==true && !(  position%8==7))
                {
                    cells.get(position+i).getPane().setBackground(App.green);
                    cells.get(position+i).setCurrentColor("GREEN");
                }
                else if( cells.get(position+i).isEmpty()==false && !(position%8==7)  && cells.get(position+i).getPiece().getColor()!=cells.get(position).getPiece().getColor() ){
                                cells.get(position+i).getPane().setBackground(App.red);
                                cells.get(position+i).setCurrentColor("RED");
                                break;
                }else
                    break;
                if((position+i)%8==7)
                    break;
            }
        }catch(Exception e){
        }
        
        try{
            int i=1;
            for(;i<8;i++){
                if(cells.get(position-i).isEmpty()==true && !(  position%8==0))
                {
                    cells.get(position-i).getPane().setBackground(App.green);
                    cells.get(position-i).setCurrentColor("GREEN");
                }
                else if( cells.get(position-i).isEmpty()==false && !(position%8==0)  && cells.get(position-i).getPiece().getColor()!=cells.get(position).getPiece().getColor() ){
                                cells.get(position-i).getPane().setBackground(App.red);
                                cells.get(position-i).setCurrentColor("RED");
                                break;
                }else
                    break;
                if((position-i)%8==0)
                    break;
            }
        }catch(Exception e){
        }
        
    }
}
