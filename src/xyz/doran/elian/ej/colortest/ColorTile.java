/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * IS2T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package xyz.doran.elian.ej.colortest;

import ej.microui.display.GraphicsContext;
import ej.mwt.MWT;
import ej.style.Style;
import ej.style.container.Rectangle;
import ej.widget.StyledWidget;

/**
 *
 */
public class ColorTile extends StyledWidget {
	private final int color;

	public ColorTile(int color) {
		this.color = color;
	}

	@Override
	public void renderContent(GraphicsContext g, Style style, Rectangle bounds) {
		g.setColor(color);
		g.fillRect(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
	}

	@Override
	public Rectangle validateContent(Style style, Rectangle bounds) {
		return new Rectangle(bounds.getX(), bounds.getY(), MWT.NONE, MWT.NONE);
	}
}
