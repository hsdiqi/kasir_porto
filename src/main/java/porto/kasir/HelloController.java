package porto.kasir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class HelloController {
    public TextField tfBayar;
    public Label lbKembalian;
    public Label lbTotalBayar;
    public Text txtBack2;
    public Text txtBack1;
    public VBox vbBuy;
    public VBox vbListItems;
    public AnchorPane header;

    public void bayar(ActionEvent actionEvent) {
    }

    public void gridPane(String name, String price){
        GridPane gp = new GridPane();
        gp.getColumnConstraints().add(new ColumnConstraints(10, 390, 282));
        gp.getColumnConstraints().add(new ColumnConstraints(10, 360, 65));
        gp.getColumnConstraints().add(new ColumnConstraints(10, 360, 120));
        gp.getColumnConstraints().add(new ColumnConstraints(10, 360, 186));

        gp.getRowConstraints().add(new RowConstraints(10, 30, 30));

        Button btn = new Button("tambah");
        Text txtRp = new Text("Rp");
        Label lblPrice = new Label(price);
        Label lbName = new Label(name);

        GridPane.setConstraints(btn, 3, 0);
        GridPane.setConstraints(txtRp, 1, 0);
        GridPane.setConstraints(lblPrice, 2, 0);
        GridPane.setConstraints(lbName, 0, 0);

        gp.getChildren().addAll(btn, txtRp, lblPrice, lbName);
    }
}