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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class  Piece {
    private int color;      // 0 => black  | 1 => white
    private int position;   
    private int moved=0;
    

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMoved() {
        return moved;
    }

    public void setMoved(int moved) {
        this.moved = moved;
    }

    public Piece(int color, int position, int moved) {
        this.color = color;
        this.position = position;
        this.moved = moved;
       
    }
    // should be abstract
    public void ViewMove(int  position ,ArrayList<Cell> cells){
    
    }
    // should be abstract
   public static void Move(int positionFrom,int  positionTo ,ArrayList<Cell> cells,ArrayList<Piece> killed,GridPane grid,Stage main){
        String color=cells.get(positionTo).getFirstColor();
        
        if( cells.get(positionTo).getCurrentColor()=="RED" ){
            killed.add(cells.get(positionTo).getPiece());
            if(cells.get(positionTo).getPiece() instanceof King ){
                if(cells.get(positionTo).getPiece().getColor()==1)
                    Alert.closeProgram(main, 0);
                else
                    Alert.closeProgram(main, 1);
                
            }
        }
        cells.set(positionTo,new Cell(cells.get(positionTo).getPane(),false,positionTo,cells.get(positionFrom).getPiece(),color,color,cells.get(positionFrom).getImg()));
        
        
        color=cells.get(positionFrom).getFirstColor();
        
        cells.set(positionFrom,new Cell(cells.get(positionFrom).getPane(),false,positionFrom,null,color,color,null));
        
        
        
    }
    
    
}
