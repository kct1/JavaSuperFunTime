// KCT 2015
// utilizing javaFx 
// demo of using css to format javafx app

package newPack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CSSdemoJava extends Application {
  @Override 
  public void start(Stage primaryStage) {
    HBox hBox = new HBox(5);
    Scene scene = new Scene(hBox, 400, 350);        
    scene.getStylesheet().add("stylesheet.css");          

    Pane pane1 = new Pane();
    Rectangle shape1 = new Rectangle(60, 60, 40);
    Rectangle shape2 = new Rectangle(160, 60, 40);
    Rectangle shape3 = new Rectangle(110, 110, 40);
    pane1.getChildren().addAll(shape1, shape2, shape3);
    pane1.getStyle().add("border");
    
    shape1.getStyleClass().add("plaincircle"); 
    shape2.getStyleClass().add("plaincircle"); 
    shape3.setId("blueShape"); 
  
    Pane pane2 = new Pane();
    Rectangle shape4 = new Rectangle(110, 110, 40);
    shape4.getStyleClass().addAll("circleborder", "plainRectangle"); 
    shape4.setId("greenShape"); 
    pane2.getChildren().add(circle4);
    pane2.getStyle().add("border");

    hBox.getChildren().addAll(pane1, pane2); 
    
    primaryStage.setTitle("CSSdemoJava"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
}
