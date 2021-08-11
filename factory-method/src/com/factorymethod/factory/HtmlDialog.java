package com.factorymethod.factory;

import com.factorymethod.buttons.Button;
import com.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
	
	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}
