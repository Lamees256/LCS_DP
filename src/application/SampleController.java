package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	private AnchorPane ledPane, sourcePane;

	public void circuitBoard(String string, int[] leds, int[] source) throws IOException {
		Stage stage = new Stage();
		ScrollPane pane = new ScrollPane();
		//pane.setStyle("-fx-background-color: black");
		pane.setStyle("-fx-background: black");
		HBox hbox = new HBox();
		HBox hbox2 = new HBox();
		hbox.setSpacing(350);
		VBox ledLights = new VBox();
		VBox ledButtons = new VBox();
		VBox ledBox = new VBox();
		VBox sourceBox = new VBox();
		sourceBox.setAlignment(Pos.CENTER);
		sourceBox.setSpacing(42);
		sourceBox.setPadding(new Insets(20, 20, 20, 20));
		ledButtons.setAlignment(Pos.CENTER);
		ledButtons.setSpacing(42);
		ledButtons.setPadding(new Insets(20, 20, 20, 20));
		ledLights.setSpacing(-3);

		int[] lights = new int[leds.length];
		String[] tokens = string.split(" ");
		int[] result = new int[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			result[i] = Integer.parseInt(tokens[i]);
		}
		for (int i = 0; i < source.length; i++) {
			RadioButton button = new RadioButton(source[i] + "");
			// button.setStyle("-fx-background-color: yellow");
			sourceBox.getChildren().addAll(button);
			for (int j = 0; j < result.length; j++) {
				if (source[i] == result[j]) {
					button.setSelected(true);
				}
			}
		}
		for (int i = 0; i < leds.length; i++) {
			lights[i] = 0;
			for (int j = 0; j < result.length; j++) {
				if (leds[i] == result[j]) {
					lights[i] = 1;
					// ledBox.getChildren().addAll(onLight);
				}
			}
		}
		for (int i = 0; i < lights.length; i++) {
			RadioButton lightB = new RadioButton(leds[i] + "");
			ledButtons.getChildren().addAll(lightB);
			if (lights[i] == 1) {
				lightB.setSelected(true);
				ImageView view2 = new ImageView("onLb.jpg");
				view2.setFitWidth(86);
				view2.setFitHeight(61);
				ledLights.getChildren().add(view2);
			} else {
				ImageView view = new ImageView("offLb.jpg");
				view.setFitWidth(86);
				view.setFitHeight(61);
				ledLights.getChildren().addAll(view);

			}
		}
		hbox2.getChildren().addAll(ledLights, ledButtons);
		ledBox.getChildren().addAll(hbox2);
		hbox.getChildren().addAll(ledBox, sourceBox);
		pane.setContent(hbox);
		//pane.getChildren().add(hbox);
		Scene scene = new Scene(pane, 600, 800);
		stage.setScene(scene);
		stage.show();
	}

	public void circuitBoard213(String string, int[] leds, int[] source) throws IOException {
		Stage stage = new Stage();
		Pane pane = new Pane();
		pane.setStyle("-fx-background-color: black");
		HBox hbox = new HBox();
		HBox hbox2 = new HBox();
		hbox.setSpacing(350);
		VBox ledLights = new VBox();
		VBox ledButtons = new VBox();
		VBox ledBox = new VBox();
		VBox sourceBox = new VBox();
		sourceBox.setAlignment(Pos.CENTER);
		sourceBox.setSpacing(42);
		sourceBox.setPadding(new Insets(20, 20, 20, 20));
		ledButtons.setAlignment(Pos.CENTER);
		ledButtons.setSpacing(42);
		ledButtons.setPadding(new Insets(20, 20, 20, 20));
		ledLights.setSpacing(-3);

		int[] lights = new int[leds.length];
		String[] tokens = string.split(" ");
		int[] result = new int[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			result[i] = Integer.parseInt(tokens[i]);
		}
		for (int i = 0; i < source.length; i++) {
			RadioButton button = new RadioButton(source[i] + "");
			// button.setStyle("-fx-background-color: yellow");
			sourceBox.getChildren().addAll(button);
			for (int j = 0; j < result.length; j++) {
				if (source[i] == result[j]) {
					button.setSelected(true);
				}
			}
		}
		for (int i = 0; i < leds.length; i++) {
			lights[i] = 0;
			for (int j = 0; j < result.length; j++) {
				if (leds[i] == result[j]) {
					lights[i] = 1;
					// ledBox.getChildren().addAll(onLight);
				}
			}
		}
		for (int i = 0; i < lights.length; i++) {
			RadioButton lightB = new RadioButton(leds[i] + "");
			ledButtons.getChildren().addAll(lightB);
			if (lights[i] == 1) {
				lightB.setSelected(true);
				ImageView view2 = new ImageView("onLb.jpg");
				view2.setFitWidth(86);
				view2.setFitHeight(61);
				ledLights.getChildren().add(view2);
			} else {
				ImageView view = new ImageView("offLb.jpg");
				view.setFitWidth(86);
				view.setFitHeight(61);
				ledLights.getChildren().addAll(view);

			}
		}
		hbox2.getChildren().addAll(ledLights, ledButtons);
		ledBox.getChildren().addAll(hbox2);
		hbox.getChildren().addAll(ledBox, sourceBox);
		pane.getChildren().add(hbox);
		Scene scene = new Scene(pane, 630, 800);
		stage.setScene(scene);
		stage.show();
	}

//	public void circuitBoard2(String string, int[] leds, int[] source) throws IOException {
//		Stage stage = new Stage();
//		VBox sourceBox = new VBox();
//		VBox ledBox = new VBox();
//		sourceBox.setMinHeight(200);
//		sourceBox.setMinWidth(100);
//		sourceBox.setSpacing(25);
//		ledBox.setSpacing(-3);
//		int[] lights = new int[leds.length];
//		BorderPane pane = new BorderPane();
//		sourceBox.setPadding(new Insets(20, 20, 20, 20));
//
//		String[] tokens = string.split(" "); // this is the array that contains the sequence of connections
//		int[] result = new int[tokens.length];
//		for (int i = 0; i < tokens.length; i++) { // changes the array of strings into an array of integers
//			result[i] = Integer.parseInt(tokens[i]);
//		}
//		for (int i = 0; i < source.length; i++) {
//			RadioButton button = new RadioButton(source[i] + "");
//			sourceBox.getChildren().addAll(button);
//			for (int j = 0; j < result.length; j++) {
//				if (source[i] == result[j]) {
//					button.setSelected(true);
//				}
//			}
//		}
//		for (int i = 0; i < leds.length; i++) {
//			lights[i] = 0;
//			for (int j = 0; j < result.length; j++) {
//				if (leds[i] == result[j]) {
//					lights[i] = 1;
//					// ledBox.getChildren().addAll(onLight);
//				}
//			}
//		}
//		for (int i = 0; i < lights.length; i++) {
//			if (lights[i] == 1) {
//				ImageView view2 = new ImageView("onLb.jpg");
//				view2.setFitWidth(86);
//				view2.setFitHeight(61);
//				ledBox.getChildren().add(view2);
//			} else {
//				ImageView view = new ImageView("offLb.jpg");
//				view.setFitWidth(86);
//				view.setFitHeight(61);
//				ledBox.getChildren().addAll(view);
//
//			}
//		}
//		pane.setLeft(ledBox);
//		// pane.setCenter(FXMLLoader.load(getClass().getResource("Sample.fxml")));
//		pane.setRight(sourceBox);
//		// Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
//		Scene scene = new Scene(pane, 800, 600);
//		stage.setScene(scene);
//		stage.show();
//
//	}

}
