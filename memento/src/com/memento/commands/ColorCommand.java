package com.memento.commands;

import java.awt.Color;

import com.memento.editor.Editor;
import com.memento.shapes.Shape;

public class ColorCommand implements Command {
	private Editor editor;
	private Color color;
	
	public ColorCommand(Editor editor, Color color) {
		this.editor = editor;
		this.color = color;
	}

	@Override
	public String getName() {
		return "Colorize: " + color.toString() ;
	}

	@Override
	public void execute() {
		for(Shape child : editor.getShapes().getSelected()) {
			child.setColor(color);
		}
	}

}
