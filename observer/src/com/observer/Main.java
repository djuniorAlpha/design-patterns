package com.observer;

import com.observer.editor.Editor;
import com.observer.listeners.EmailNotificationListener;
import com.observer.listeners.LogOpenListener;

public class Main {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.events.subscribe("open", new LogOpenListener("C:\\Users\\dimas\\Desktop\\Observable_Teste\\file.txt"));
		editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
		
		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
