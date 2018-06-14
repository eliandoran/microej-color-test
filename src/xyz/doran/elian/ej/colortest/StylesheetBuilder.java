/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package xyz.doran.elian.ej.colortest;

import ej.microui.display.Colors;
import ej.style.Stylesheet;
import ej.style.background.PlainBackground;
import ej.style.outline.ComplexOutline;
import ej.style.selector.TypeSelector;
import ej.style.util.EditableStyle;
import ej.style.util.StyleHelper;

/**
 *
 */
public class StylesheetBuilder {
	private StylesheetBuilder() {
		// Prevent instantiation.
	}

	public static void initialize() {
		Stylesheet stylesheet = StyleHelper.getStylesheet();

		setDefaultStyle(stylesheet);
		setColorTileStyle(stylesheet);
	}

	private static void setDefaultStyle(Stylesheet stylesheet) {
		EditableStyle style = new EditableStyle();
		style.setBackground(new PlainBackground());
		style.setBackgroundColor(Colors.BLACK);
		stylesheet.setDefaultStyle(style);
	}

	private static void setColorTileStyle(Stylesheet stylesheet) {
		EditableStyle style = new EditableStyle();
		style.setMargin(new ComplexOutline(0, 1, 1, 0));
		stylesheet.addRule(new TypeSelector(ColorTile.class), style);
	}
}
