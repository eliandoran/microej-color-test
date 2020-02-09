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
import ej.mwt.Widget;
import xyz.doran.elian.ej.colortest.pages.BasicColorsPage;
import xyz.doran.elian.ej.colortest.pages.PermutedBasicColorsPage;

/**
 *
 */
public class Main {

	private static final boolean PERMUTE_COLORS = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MicroUI.start();

		Panel mainPanel = new Panel();

		Widget widget;
		if (PERMUTE_COLORS) {
			widget = new PermutedBasicColorsPage();
		} else {
			widget = new BasicColorsPage();
		}
		mainPanel.setWidget(widget);

		Desktop desktop = new Desktop();
		mainPanel.showFullScreen(desktop);

		StylesheetBuilder.initialize();
		desktop.show();
	}

}
