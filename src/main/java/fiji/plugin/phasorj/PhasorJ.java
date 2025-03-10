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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.scijava.command.Command;
import org.scijava.plugin.Plugin;

import java.io.IOException;

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
		// load the GUI from FXML files
		FXMLLoader fxmlLoader = new FXMLLoader(PhasorJ.class.getResource("fxml/plot-pane.fxml"));

		// create GUI elements
		Stage stage = new Stage();

		// configure elements
		stage.setTitle("PhasorJ");

		// create the scene
		Scene scene = null;
		try {
			scene = new Scene(fxmlLoader.load());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		stage.setScene(scene);
		stage.show();
	}
}
