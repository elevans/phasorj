/*-
 * #%L
 * Phasor analysis in Fiji.
 * %%
 * Copyright (C) 2025 - 2025 PhasorJ developers.
 * %%
 * TODO add unlicense text here
 */
package fiji.plugin.phasorj;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.scijava.command.Command;
import org.scijava.plugin.Plugin;

@Plugin(type = Command.class, menuPath = "Analyze>Phasor>PhasorJ")
public class PhasorJ implements Command {

	private static final String TITLE = "PhasorJ";

	@Override
	public void run() {
		// HACK: initialize the JavaFX toolkit first
		new JFXPanel();

		// initialize the gui
		Platform.runLater(() -> {
			createGUI();
		});
	}

	private static void createGUI() {
		// create GUI elements
		StackPane root = new  StackPane();
		Stage stage = new Stage();
		Button button = new Button("OK");

		// configure elements
		stage.setTitle("PhasorJ");
		root.getChildren().add(button);

		// create the scene
		Scene scene = new Scene(root, 300, 200);
		stage.setScene(scene);

		stage.show();
	}
}
