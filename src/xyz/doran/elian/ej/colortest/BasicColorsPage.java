/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package xyz.doran.elian.ej.colortest;

import ej.microui.display.Colors;
import ej.widget.container.Grid;
import ej.widget.navigation.page.Page;

/**
 *
 */
public class BasicColorsPage extends Page {
	/**
	 *
	 */
	public BasicColorsPage() {
		Grid grid = new Grid(true, 4);

		int[] colors = new int[] {
				Colors.BLACK,
				Colors.BLUE,
				Colors.CYAN,
				Colors.GRAY,
				Colors.GREEN,
				Colors.LIME,
				Colors.MAGENTA,
				Colors.MAROON,
				Colors.NAVY,
				Colors.OLIVE,
				Colors.PURPLE,
				Colors.RED,
				Colors.SILVER,
				Colors.TEAL,
				Colors.WHITE,
				Colors.YELLOW };

		for (int color : colors) {
			ColorTile colorTile = new ColorTile(color);
			grid.add(colorTile);
		}

		setWidget(grid);
	}
}
