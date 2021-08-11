package com.mediator.components;

import javax.swing.JButton;

import java.awt.event.ActionEvent;

import com.mediator.mediator.Mediator;
import com.mediator.mediator.Note;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton(){
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
