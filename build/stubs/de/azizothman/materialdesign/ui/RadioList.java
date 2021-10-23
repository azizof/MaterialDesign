package de.azizothman.materialdesign.ui;


public class RadioList extends container.YBox {

	/**
	 *  create list of radio buttons with the given Strings as text.
	 * 
	 *  @param radioButtons list of string to set the text of the radio buttons
	 */
	public RadioList(String[] radioButtons) {
	}

	/**
	 *  set the items of the list. the string values will create a list of radio buttons
	 *  with the given text.
	 * 
	 *  <p>in case of "radioButtons = null" this method will create a list contains one radio button with an empty text
	 *  to avoid null pointer exception </p>
	 * 
	 *  @param radioButtons the string to set radio buttons text
	 *  @return same RadioList instance for chaining calls
	 */
	public RadioList setItems(String[] radioButtons) {
	}

	/**
	 *  set selected item
	 * 
	 *  @param index the index of the selected item
	 *  @return same RadioList instance for chaining calls
	 */
	public RadioList setSelectedIndex(int index) {
	}

	/**
	 *  Return the selected radio button within the list
	 * 
	 *  @return the selected radio button within the list
	 */
	public MRadioButton getSelected() {
	}

	/**
	 *  check if a radio button in the list is selected or not
	 * 
	 *  @return true if a selection was made
	 */
	public boolean isSelected() {
	}

	/**
	 *  Clears the selection such that none of the buttons in the list are selected.
	 * 
	 *  @return same RadioList instance for chaining calls
	 */
	public RadioList clearSelection() {
	}

	/**
	 *  Return the index of the selected radio button within the list
	 * 
	 *  @return the index of the selected radio button within the list
	 */
	public int getSelectedIndex() {
	}

	/**
	 *  Adds an action listener to all the buttons in the list
	 * 
	 *  @param al the listener
	 *  @return same RadioList instance for chaining calls
	 */
	public RadioList action(com.codename1.ui.events.ActionListener al) {
	}

	/**
	 *  Removes an action listener from all the buttons in the list
	 * 
	 *  @param al the listener
	 *  @return same RadioList instance for chaining calls
	 */
	public RadioList removeAction(com.codename1.ui.events.ActionListener al) {
	}
}
