package com.state;

import com.state.ui.Player;
import com.state.ui.UI;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		UI ui = new UI(player);
		ui.init();
	}

}
