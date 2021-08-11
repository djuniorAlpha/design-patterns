package com.abstractfactory.factories;

import com.abstractfactory.buttons.Button;
import com.abstractfactory.buttons.WindowsButton;
import com.abstractfactory.checkboxes.Checkbox;
import com.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
