package com.factorymethod.factory;

import com.factorymethod.buttons.Button;
import com.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
