package com.mediator;

import javax.swing.DefaultListModel;

import com.mediator.components.AddButton;
import com.mediator.components.DeleteButton;
import com.mediator.components.Filter;
import com.mediator.components.List;
import com.mediator.components.SaveButton;
import com.mediator.components.TextBox;
import com.mediator.components.Title;
import com.mediator.mediator.Editor;
import com.mediator.mediator.Mediator;

public class App {
    public static void main(String[] args) throws Exception {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
