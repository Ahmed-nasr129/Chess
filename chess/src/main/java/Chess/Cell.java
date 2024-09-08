/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

/**
 *
 * @author pc
 */
public class Cell {
    private Pane pane;
    private boolean empty;
    private int position;
    private Piece piece;
    private final String firstColor;
    private String currentColor;
    private Image img;
    public Pane getPane() {
        return pane;
    }

    public Image getImg() {
        return img;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public String getFirstColor() {
        return firstColor;
    }

    public String getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(String currentColor) {
        this.currentColor = currentColor;
    }

    public void setImg(Image img) {
        ImageView view =new ImageView(img);
        view.setLayoutX(10);
        view.setLayoutY(10);
        view.setFitWidth(40);  // Fit width to pane's width
        view.setFitHeight(40); // Fit height to pane's height
        view.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        pane.getChildren().add(view);
    }

    public Cell(Pane pane, boolean empty, int position, Piece piece, String firstColor, String currentColor,Image img) {
        this.piece = piece;
        if(piece==null)
            empty=true;
        else
            empty=false;
        pane.setPrefSize(60, 60); 
        
        if(firstColor=="GOLD")
            pane.setBackground(App.gold);
        else
            pane.setBackground(App.yellow);
        
        this.img=img;
        ImageView view =new ImageView(img);
        view.setLayoutX(10);
        view.setLayoutY(10);
        view.setFitWidth(40);  // Fit width to pane's width
        view.setFitHeight(40); // Fit height to pane's height
        view.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        pane.getChildren().clear();
        pane.getChildren().add(view);
        this.pane = pane;
        this.empty = empty;
        this.position = position;
        this.firstColor = firstColor;
        this.currentColor = currentColor;
        
    }
    
}
