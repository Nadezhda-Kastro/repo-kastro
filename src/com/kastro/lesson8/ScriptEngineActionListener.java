package com.kastro.lesson8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScriptEngineActionListener implements ActionListener {

    private final ScriptEngine scriptEngine;
    private final JTextField textField;

    public ScriptEngineActionListener(JTextField textField) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        this.textField = textField;
        this.scriptEngine = scriptEngineManager.getEngineByName("Nashorn");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object expResult1 = scriptEngine.eval(textField.getText());
            textField.setText(String.valueOf(expResult1));

        } catch (ScriptException scriptException) {
            scriptException.printStackTrace();
        }
    }

}
