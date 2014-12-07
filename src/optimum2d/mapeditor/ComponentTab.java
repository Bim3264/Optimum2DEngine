package optimum2d.mapeditor;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Biw on 6/12/2557.
 */
@Deprecated
public class ComponentTab extends Application
{
    public static boolean isRunning = false;

    @FXML public TreeView main_tree;
    @FXML public Button add_button;
    @FXML public TextField component_name;
    @FXML public VBox vBox;
    @FXML public HBox hBox;

    public TreeItem<String> default_assets = new TreeItem<String>("Default Assets");

    @Override
    public void start(Stage stage) throws Exception
    {
//        Parent scene = FXMLLoader.load(getClass().getResource("fxml/component_loader.fxml"));

        TreeItem<String> box = new TreeItem<String>("Box");

        default_assets.getChildren().add(box);

        main_tree = new TreeView(default_assets);

        vBox = new VBox();
        vBox.getChildren().add(main_tree);

        stage.setTitle("Game Component");
        stage.setScene(new Scene(vBox, 321, 400));
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
