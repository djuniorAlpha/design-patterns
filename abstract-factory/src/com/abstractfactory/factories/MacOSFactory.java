package com.abstractfactory.factories;

import com.abstractfactory.buttons.Button;
import com.abstractfactory.buttons.MacOSButton;
import com.abstractfactory.checkboxes.Checkbox;
import com.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
