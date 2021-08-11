package com.abstractfactory.factories;

import com.abstractfactory.buttons.Button;
import com.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
