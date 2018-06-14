/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package xyz.doran.elian.ej.colortest.pages;

import ej.bon.Timer;
import ej.bon.TimerTask;
import ej.microui.display.Colors;
import ej.widget.container.Grid;
import ej.widget.navigation.page.Page;
import xyz.doran.elian.ej.colortest.ColorTile;

/**
 *
 */
public class PermutedBasicColorsPage extends Page {
	private static final int UPDATE_DELAY_MS = 1000;

	private final int[][] colors = new int[][] {
			//
		{ Colors.BLACK, Colors.BLUE, Colors.CYAN, Colors.GRAY },
		{ Colors.GREEN, Colors.LIME, Colors.MAGENTA, Colors.MAROON },
		{ Colors.NAVY, Colors.OLIVE, Colors.PURPLE, Colors.RED },
		{ Colors.SILVER, Colors.TEAL, Colors.WHITE, Colors.YELLOW }
		//
	};

	private final int numRows, numColumns;

	private Timer timer;

	private final Grid colorGrid;

	/**
	 *
	 */
	public PermutedBasicColorsPage() {
		numRows = colors.length;
		numColumns = colors[0].length;

		colorGrid = new Grid(true, 4);

		for (int i = 0; i < numRows * numColumns; i++) {
			ColorTile colorTile = new ColorTile();
			colorGrid.add(colorTile);
		}

		startTimer();
		setWidget(colorGrid);
	}

	private void update() {
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				ColorTile colorTile = (ColorTile) colorGrid.getWidget(numColumns * row + col);
				colorTile.setColor(colors[row][col]);
			}
		}
	}

	private void permute() {
		for (int row = 0; row < numRows; row++) {
			int lastColor = colors[row][numColumns - 1];

			for (int col = numColumns - 1; col > 0; col--) {
				colors[row][col] = colors[row][col - 1];
			}

			colors[row][0] = lastColor;
		}
	}

	private void startTimer() {
		if (timer == null) {
			timer = new Timer();
		}

		TimerTask updateTask = new TimerTask() {
			@Override
			public void run() {
				update();
				permute();
			}
		};

		timer.schedule(updateTask, 0, UPDATE_DELAY_MS);
	}
}
