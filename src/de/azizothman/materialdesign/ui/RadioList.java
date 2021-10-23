package de.azizothman.materialdesign.ui;

import com.codename1.ui.ButtonGroup;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import de.azizothman.materialdesign.ui.container.YBox;

import java.util.ArrayList;


public class RadioList extends YBox {

    /**
     * the radio button list
     */
    private ArrayList<MRadioButton> mRadioButtons;
    /**
     * the radio button list
     */
    private ArrayList<String> mRadioButtonsHelper;

    /**
     * the group of the radio buttons
     */
    private ButtonGroup buttonGroup;

    /**
     * create list of radio buttons with the given Strings as text.
     *
     * @param radioButtons list of string to set the text of the radio buttons
     */
    public RadioList(String... radioButtons) {
        super();
        this.mRadioButtons = new ArrayList<>();
        this.mRadioButtonsHelper = new ArrayList<>();
        this.buttonGroup = new ButtonGroup();
        setItems(radioButtons);
        setSelectedIndex(0);
    }

    /**
     * add the radio buttons to  the YBox
     */
    private void addItemsToTheContainer() {
        // delete all radio buttons
        this.removeAll();
        for (MRadioButton mRadioButton : mRadioButtons) {
            this.add(mRadioButton);
        }
        this.revalidate();
    }

    /**
     * set the items of the list. the string values will create a list of radio buttons
     * with the given text.
     *
     * <p>in case of "radioButtons = null" this method will create a list contains one radio button with an empty text
     * to avoid null pointer exception </p>
     *
     * @param radioButtons the string to set radio buttons text
     * @return same RadioList instance for chaining calls
     */
    public RadioList setItems(String... radioButtons) {
        if (radioButtons == null) {
            radioButtons = new String[1];
            radioButtons[0] = " ";
        }
        this.mRadioButtons.clear();
        this.mRadioButtonsHelper.clear();
        for (String text : radioButtons) {
            MRadioButton mRadioButton = new MRadioButton(text);
            mRadioButtons.add(mRadioButton);
            mRadioButtonsHelper.add(text);
            buttonGroup.add(mRadioButton);
        }
        addItemsToTheContainer();
        return this;
    }


    ///TODO ADD AND REMOVE RADIO BUTTON TO THE LIST
    /*
    public RadioList addRadioButton(String text) {
        this.mRadioButtonsHelper.add(text);
        String[] newItems = this.mRadioButtonsHelper.toArray(new String[0]);
        return setItems(newItems);
    }
    public RadioList removeRadioButton(String text) {
        this.mRadioButtonsHelper.remove(text);
        String[] newItems = this.mRadioButtonsHelper.toArray(new String[0]);
        return setItems(newItems);
    }*/

    /**
     * set selected item
     *
     * @param index the index of the selected item
     * @return same RadioList instance for chaining calls
     */
    public RadioList setSelectedIndex(int index) {
        if (index > buttonGroup.getButtonCount()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        buttonGroup.setSelected(index);
        return this;
    }

    /**
     * Return the selected radio button within the list
     *
     * @return the selected radio button within the list
     */
    public MRadioButton getSelected() {
        return (MRadioButton) buttonGroup.getSelected();
    }

    /**
     * check if a radio button in the list is selected or not
     *
     * @return true if a selection was made
     */
    public boolean isSelected() {
        return this.buttonGroup.isSelected();
    }

    /**
     * Clears the selection such that none of the buttons in the list are selected.
     *
     * @return same RadioList instance for chaining calls
     */
    public RadioList clearSelection() {
        this.buttonGroup.clearSelection();
        return this;
    }


    /**
     * Return the index of the selected radio button within the list
     *
     * @return the index of the selected radio button within the list
     */
    public int getSelectedIndex() {
        return buttonGroup.getSelectedIndex();
    }

    /**
     * Adds an action listener to all the buttons in the list
     *
     * @param al the listener
     * @return same RadioList instance for chaining calls
     */
    public RadioList action(ActionListener<ActionEvent> al) {
        buttonGroup.addActionListener(al);
        return this;
    }


    /**
     * Removes an action listener from all the buttons in the list
     *
     * @param al the listener
     * @return same RadioList instance for chaining calls
     */
    public RadioList removeAction(ActionListener<ActionEvent> al) {
        buttonGroup.removeActionListener(al);
        return this;
    }


}
