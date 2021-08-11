package com.memento.editor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import javax.swing.JComponent;

import com.memento.commands.Command;
import com.memento.history.History;
import com.memento.history.Memento;
import com.memento.shapes.CompoundShape;
import com.memento.shapes.Shape;

public class Editor extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Canvas canvas;
	private CompoundShape allShapes = new CompoundShape();
	private History history;
	
	public Editor() {
		canvas = new Canvas(this);
		history = new History();
	}
	
	public void loadShapes(Shape... shapes) {
		allShapes.clear();
		allShapes.add(shapes);
		canvas.refresh();
	}
	
	public CompoundShape getShapes() {
		return allShapes;
	}
	
	public void execute(Command c) {
		history.push(c, new Memento(this));
		c.execute();
	}
	
	public void undo() {
		if(history.undo()) canvas.repaint();
	}
	
	public void redo() {
		if(history.redo()) canvas.repaint();
	}
	
	public String backup() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this.allShapes);
			oos.close();
			
			return Base64.getEncoder().encodeToString(baos.toByteArray());
		} catch(IOException e) {
			return "";
		}
	}
	
	public void restore(String state) {
		try {
			byte[] data = Base64.getDecoder().decode(state);
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
			this.allShapes =  (CompoundShape) ois.readObject();
			ois.close();
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException occurred.");
		} catch(IOException e) {
			System.out.println("IOException occurred.");
		}
	}
}
