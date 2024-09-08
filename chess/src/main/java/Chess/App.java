package Chess;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.*;
import static javafx.print.PrintColor.COLOR;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
/**
 * JavaFX App
 */
public class App extends Application implements EventHandler<ActionEvent>{
    static int isClicked=0;
    static int plays=1;
    public static Background gold=new Background(new BackgroundFill(Color.GOLD, CornerRadii.EMPTY, Insets.EMPTY));
    public static Background yellow=new Background(new BackgroundFill(Color.LIGHTYELLOW, CornerRadii.EMPTY, Insets.EMPTY));
    public static Background green=new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY));
    public static Background red=new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY));
    public static Background blue=new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY));
    
    public static Image WhitepawnImg =new Image("file:Images/whitepawn.png");
    
    public static Image BlackpawnImg =new Image("file:Images/blackpawn.png");
    public static Image WhiterookImg =new Image("file:Images/whiterook.png");
    public static Image BlackrookImg =new Image("file:Images/blackrook.png");
    public static Image WhitekingImg =new Image("file:Images/whiteking.png");
    public static Image BlackkingImg =new Image("file:Images/blackking.png");
    public static Image WhitequeenImg =new Image("file:Images/whitequeen.png");
    public static Image BlackqueenImg =new Image("file:Images/blackqueen.png");
    public static Image WhiteknightImg =new Image("file:Images/whiteknight.png");
    public static Image BlackknightImg =new Image("file:Images/blackknight.png");
    public static Image WhitebishopImg =new Image("file:Images/whitebishop.png");
    public static Image BlackbishopImg =new Image("file:Images/blackbishop.png");
    
    @Override
    public void start(Stage stage) {
        
        ArrayList<Cell> cells =new ArrayList<Cell>();
        ArrayList<Piece> killed =new ArrayList<Piece>();
        GridPane grid =new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(0);
        grid.setHgap(0);
        grid.setAlignment(Pos.CENTER);
        
        
        int i=0;
        
        boolean color=true;
        cells.add(new Cell(new Pane(),false,i,new Rook(1,i,0),"LIGHTYELLOW","LIGHTYELLOW",WhiterookImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Knight(1,i,0),"GOLD","GOLD",WhiteknightImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Bishop(1,i,0),"LIGHTYELLOW","LIGHTYELLOW",WhitebishopImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new King(1,i,0),"GOLD","GOLD",WhitekingImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Queen(1,i,0),"LIGHTYELLOW","LIGHTYELLOW",WhitequeenImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Bishop(1,i,0),"GOLD","GOLD",WhitebishopImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Knight(1,i,0),"LIGHTYELLOW","LIGHTYELLOW",WhiteknightImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Rook(1,i,0),"GOLD","GOLD",WhiterookImg));
        i++;
        
        
        for(;i<16;i++){
            
            cells.add(new Cell(new Pane(),false,i,new Pawn(1,i,0),"GOLD","GOLD",WhitepawnImg));
            i++;
            cells.add(new Cell(new Pane(),false,i,new Pawn(1,i,0),"LIGHTYELLOW","LIGHTYELLOW",WhitepawnImg));
            
        }
        
        
        for(;i<48;i++){
            if(color){
            cells.add(new Cell(new Pane(),false,i,null,"LIGHTYELLOW","LIGHTYELLOW",null));
            i++;
            cells.add(new Cell(new Pane(),false,i,null,"GOLD","GOLD",null));
            }else{
            cells.add(new Cell(new Pane(),false,i,null,"GOLD","GOLD",null));
            i++;
            cells.add(new Cell(new Pane(),false,i,null,"LIGHTYELLOW","LIGHTYELLOW",null));
            }
            if(i%8==7)
            color =!color;
            
        }
        for(;i<56;i++){
            
            cells.add(new Cell(new Pane(),false,i,new Pawn(0,i,0),"LIGHTYELLOW","LIGHTYELLOW",BlackpawnImg));
            i++;
            cells.add(new Cell(new Pane(),false,i,new Pawn(0,i,0),"GOLD","GOLD",BlackpawnImg));
            
        }
        
        
        
        cells.add(new Cell(new Pane(),false,i,new Rook(0,i,0),"GOLD","GOLD",BlackrookImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Knight(0,i,0),"LIGHTYELLOW","LIGHTYELLOW",BlackknightImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Bishop(0,i,0),"GOLD","GOLD",BlackbishopImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new King(0,i,0),"LIGHTYELLOW","LIGHTYELLOW",BlackkingImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Queen(0,i,0),"GOLD","GOLD",BlackqueenImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Bishop(0,i,0),"LIGHTYELLOW","LIGHTYELLOW",BlackbishopImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Knight(0,i,0),"GOLD","GOLD",BlackknightImg));
        i++;
        cells.add(new Cell(new Pane(),false,i,new Rook(0,i,0),"LIGHTYELLOW","LIGHTYELLOW",BlackrookImg));
        i++;
        
        
        i=0;
        
        for(;i<64;i++){
            GridPane.setConstraints(cells.get(i).getPane(), i%8, i/8);
            grid.getChildren().add(cells.get(i).getPane());
        }
        
        
        i=0;
        for(;i<64;i++){
            final int  ii=i;
            cells.get(i).getPane().setOnMouseReleased(e -> {
                
                if(cells.get(ii).isEmpty()==false && App.getPlays()== cells.get(ii).getPiece().getColor()){
                    
                    if(App.getCliked()==0 && App.getPlays()== cells.get(ii).getPiece().getColor()){
                        App.click();
                        cells.get(ii).getPane().setBackground(blue);
                        cells.get(ii).setCurrentColor("BLUE");
                        cells.get(ii).getPiece().ViewMove(ii,cells);
                    }else if( App.getPlays()== cells.get(ii).getPiece().getColor() ){
                        App.click();
                        int iii=0;
                        for(;iii<64;iii++){
                            if(cells.get(iii).getFirstColor()=="GOLD")
                            {    
                                cells.get(iii).getPane().setBackground(gold);
                                cells.get(iii).setCurrentColor("GOLD");
                            }
                            else
                            {    
                                cells.get(iii).getPane().setBackground(yellow);
                                cells.get(iii).setCurrentColor("LIGHTYELLOW");
                            }
                        }
                        cells.get(ii).getPane().setBackground(blue);
                        cells.get(ii).setCurrentColor("BLUE");
                        cells.get(ii).getPiece().ViewMove(ii,cells);
                    }
                }else{
                    App.clickClear();
                    int iii=0;
                    if( cells.get(ii).getCurrentColor()=="GREEN" || cells.get(ii).getCurrentColor()=="RED"){
                        int blue =-1;
                        for(;iii<64;iii++){
                            if(cells.get(iii).getCurrentColor()=="BLUE"){
                                blue=iii;
                                break;
                            }
                        }
                        
                        Piece.Move(blue,ii,cells,killed,grid,stage);
                        plays++;
                        plays=plays%2;
                        
                        if(cells.get(ii).getPiece() instanceof Pawn && ii/8==0 && cells.get(ii).getPiece().getColor()==0){
                            // promote black
                            Piece prom=Alert.promoteBlack(BlackbishopImg, BlackqueenImg, BlackrookImg, BlackknightImg, ii);
                            if(prom instanceof Queen)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),BlackqueenImg));
                            else if(prom instanceof Rook)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),BlackrookImg));
                            else if(prom instanceof Bishop)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),BlackbishopImg));
                            else if(prom instanceof Knight)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),BlackknightImg));
                            
                        }else if(cells.get(ii).getPiece() instanceof Pawn && ii/8==7 && cells.get(ii).getPiece().getColor()==1){
                        
                            // promote white
                            Piece prom=Alert.promoteWhite(WhitebishopImg, WhitequeenImg, WhiterookImg, WhiteknightImg, ii);
                            if(prom instanceof Queen)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),WhitequeenImg));
                            else if(prom instanceof Rook)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),WhiterookImg));
                            else if(prom instanceof Bishop)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),WhitebishopImg));
                            else if(prom instanceof Knight)
                                cells.set(ii,new Cell(cells.get(ii).getPane(),false,ii,prom,cells.get(ii).getFirstColor(),cells.get(ii).getFirstColor(),WhiteknightImg));
                            
                        }
                    }
                    iii=0;
                    for(;iii<64;iii++){
                        if(cells.get(iii).getFirstColor()=="GOLD")
                        {
                            cells.get(iii).getPane().setBackground(gold);
                            cells.get(iii).setCurrentColor("GOLD");
                        }
                        else
                        {    
                            cells.get(iii).getPane().setBackground(yellow);
                            cells.get(iii).setCurrentColor("LIGHTYELLOW");
                        }
                    }
                }
            } );
            
        }
        
        
        grid.setStyle("-fx-background-color: grey;");
        Scene scene = new Scene(grid, 640, 480);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void handle(ActionEvent t) {
       
    }
    public static void click(){
        isClicked=1;
    }
    public static void clickClear(){
        isClicked=0;
    }
    public static int getCliked(){
        return isClicked;
    }

    public static int getPlays() {
        return plays;
    }

    public static void setPlays(int plays) {
        App.plays = plays;
    }
    
}

class Alert{
    static Piece returnPiece;
    static Pane pane1=new Pane();
    static Pane pane2=new Pane();
    static Pane pane3=new Pane();
    static Pane pane4=new Pane();
    public static Piece promoteWhite(Image bishopimg,Image queenimg,Image rookimg,Image knightimg,int pos){
        
        Stage window =new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        ImageView bishopview =new ImageView(bishopimg);
        bishopview.setLayoutX(10);
        bishopview.setLayoutY(10);
        bishopview.setFitWidth(40);  // Fit width to pane's width
        bishopview.setFitHeight(40); // Fit height to pane's height
        bishopview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        ImageView queenview =new ImageView(queenimg);
        queenview.setLayoutX(10);
        queenview.setLayoutY(10);
        queenview.setFitWidth(40);  // Fit width to pane's width
        queenview.setFitHeight(40); // Fit height to pane's height
        queenview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        ImageView rookview =new ImageView(rookimg);
        rookview.setLayoutX(10);
        rookview.setLayoutY(10);
        rookview.setFitWidth(40);  // Fit width to pane's width
        rookview.setFitHeight(40); // Fit height to pane's height
        rookview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        ImageView knightview =new ImageView(knightimg);
        knightview.setLayoutX(10);
        knightview.setLayoutY(10);
        knightview.setFitWidth(40);  // Fit width to pane's width
        knightview.setFitHeight(40); // Fit height to pane's height
        knightview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        pane1.setPrefSize(60, 60);
        pane2.setPrefSize(60, 60);
        pane3.setPrefSize(60, 60);
        pane4.setPrefSize(60, 60);
        pane1.setBackground(App.gold);
        pane2.setBackground(App.gold);
        pane3.setBackground(App.gold);
        pane4.setBackground(App.gold);
        pane1.getChildren().add(queenview);
        pane2.getChildren().add(bishopview);
        pane3.getChildren().add(knightview);
        pane4.getChildren().add(rookview);
        
        HBox hbox=new HBox();
        VBox vbox=new VBox();
        Label lbl=new Label("Promote your pawn to...");
        lbl.setStyle("-fx-font-size: 17px; -fx-font-weight: bold;");
        hbox.setSpacing(10);
        hbox.getChildren().addAll(pane1,pane2,pane3,pane4);
        hbox.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(lbl,hbox);
        
        pane1.setOnMouseReleased(e -> {
            returnPiece=new Queen(1,pos,0);
            window.close();
        });
        
        pane4.setOnMouseReleased(e -> {
            returnPiece=new Rook(1,pos,0);
            window.close();
        });
        
        pane2.setOnMouseReleased(e -> {
            returnPiece=new Bishop(1,pos,0);
            window.close();
        });
        
        pane3.setOnMouseReleased(e -> {
            returnPiece=new Knight(1,pos,0);
            window.close();
        });
        window.setOnCloseRequest(e -> {
        e.consume();
        });
        Scene newScene =new Scene(vbox,480,360);
        window.setScene(newScene);
        window.showAndWait();
        return returnPiece;
    }
    
    
    public static Piece promoteBlack(Image bishopimg,Image queenimg,Image rookimg,Image knightimg,int pos){
        
        Stage window =new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        ImageView bishopview =new ImageView(bishopimg);
        bishopview.setLayoutX(10);
        bishopview.setLayoutY(10);
        bishopview.setFitWidth(40);  // Fit width to pane's width
        bishopview.setFitHeight(40); // Fit height to pane's height
        bishopview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        ImageView queenview =new ImageView(queenimg);
        queenview.setLayoutX(10);
        queenview.setLayoutY(10);
        queenview.setFitWidth(40);  // Fit width to pane's width
        queenview.setFitHeight(40); // Fit height to pane's height
        queenview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        ImageView rookview =new ImageView(rookimg);
        rookview.setLayoutX(10);
        rookview.setLayoutY(10);
        rookview.setFitWidth(40);  // Fit width to pane's width
        rookview.setFitHeight(40); // Fit height to pane's height
        rookview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        ImageView knightview =new ImageView(knightimg);
        knightview.setLayoutX(10);
        knightview.setLayoutY(10);
        knightview.setFitWidth(40);  // Fit width to pane's width
        knightview.setFitHeight(40); // Fit height to pane's height
        knightview.setPreserveRatio(false); // Stretch the image to fit the pane exactly
        pane1.setPrefSize(60, 60);
        pane2.setPrefSize(60, 60);
        pane3.setPrefSize(60, 60);
        pane4.setPrefSize(60, 60);
        pane1.setBackground(App.gold);
        pane2.setBackground(App.gold);
        pane3.setBackground(App.gold);
        pane4.setBackground(App.gold);
        pane1.getChildren().add(queenview);
        pane2.getChildren().add(bishopview);
        pane3.getChildren().add(knightview);
        pane4.getChildren().add(rookview);
        HBox hbox=new HBox();
        VBox vbox=new VBox();
        Label lbl=new Label("Promote your pawn to...");
        lbl.setStyle("-fx-font-size: 17px; -fx-font-weight: bold;");
        hbox.setSpacing(10);
        hbox.getChildren().addAll(pane1,pane2,pane3,pane4);
        hbox.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(lbl,hbox);
        
        pane1.setOnMouseReleased(e -> {
            returnPiece=new Queen(0,pos,0);
            window.close();
        });
        
        pane4.setOnMouseReleased(e -> {
            returnPiece=new Rook(0,pos,0);
            window.close();
        });
        
        pane2.setOnMouseReleased(e -> {
            returnPiece=new Bishop(0,pos,0);
            window.close();
        });
        
        pane3.setOnMouseReleased(e -> {
            returnPiece=new Knight(0,pos,0);
            window.close();
        });
        window.setOnCloseRequest(e -> {
        e.consume();
        });
        
        Scene newScene =new Scene(vbox,480,360);
        window.setScene(newScene);
        window.showAndWait();
        return returnPiece;
    }
    public static void closeProgram(Stage main,int color){
        Stage window =new Stage();
        Label lbl;
        if(color==0)
            lbl=new Label("Black Player Won!!!");
        else
            lbl=new Label("White Player Won!!!");
        lbl.setStyle("-fx-font-size: 17px; -fx-font-weight: bold;");
        lbl.setAlignment(Pos.CENTER);
        Scene wow=new Scene(lbl,360,240);
        window.setScene(wow);
        window.show();
        main.close();
        
    }
}