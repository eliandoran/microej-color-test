/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package xyz.doran.elian.ej.colortest;

import ej.microui.MicroUI;
import ej.mwt.Desktop;
import ej.mwt.Panel;

/**
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MicroUI.start();

		Panel mainPanel = new Panel();
		mainPanel.setWidget(new PermutedBasicColorsPage());

		Desktop desktop = new Desktop();
		mainPanel.showFullScreen(desktop);

		StylesheetBuilder.initialize();
		desktop.show();
	}

}
