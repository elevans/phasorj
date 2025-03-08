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

import org.scijava.command.Command;
import org.scijava.plugin.Plugin;

@Plugin(type = Command.class, menuPath = "Analyze>Phasor>PhasorJ")
public class PhasorJ implements Command {

	private static final String TITLE = "PhasorJ";

	@Override
	public void run() {
		// TODO
	}
}
