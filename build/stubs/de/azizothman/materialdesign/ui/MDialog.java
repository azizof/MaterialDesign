package de.azizothman.materialdesign.ui;


public class MDialog extends com.codename1.ui.Dialog implements MaterialComponent {

	/**
	 *  Default constructor with no title
	 */
	public MDialog() {
	}

	/**
	 *  set the title of the dialog
	 * 
	 *  @param title the title of the dialog
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog title(String title) {
	}

	/**
	 *  set the body of the dialog
	 * 
	 *  @param body the body of the dialog
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog body(String body) {
	}

	/**
	 *  set the body of the dialog and its icon
	 * 
	 *  @param body the body of the dialog
	 *  @param icon the icon of the body
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog body(String body, com.codename1.ui.Image icon) {
	}

	/**
	 *  set the text of confirm Button of the dialog
	 * 
	 *  @param confirm the text of the confirm button
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog confirmButton(String confirm) {
	}

	/**
	 *  set the text and icon of confirm Button of the dialog
	 * 
	 *  @param confirm the text of the confirm button
	 *  @param icon    the icon of the confirm button
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog confirmButton(String confirm, com.codename1.ui.Image icon) {
	}

	/**
	 *  set the text of cancel Button of the dialog
	 * 
	 *  @param cancel the text of the cancel button
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog cancelButton(String cancel) {
	}

	/**
	 *  set the text and icon of cancel Button of the dialog
	 * 
	 *  @param cancel the text of the cancel button
	 *  @param icon   the icon of the cancel button
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog cancelButton(String cancel, com.codename1.ui.Image icon) {
	}

	/**
	 *  Adds a listener to the confirm button
	 * 
	 *  @param listener the action listener
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog onConfirm(com.codename1.ui.events.ActionListener listener) {
	}

	/**
	 *  Adds a listener to the cancel button
	 * 
	 *  @param listener the action listener
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog onCancel(com.codename1.ui.events.ActionListener listener) {
	}

	/**
	 *  set the color of the confirm button. if confirm button not defined this method
	 *  will not run
	 * 
	 *  @param textColor color of the text
	 *  @param bgColor   background color
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog confirmButtonColors(int textColor, int bgColor) {
	}

	/**
	 *  set the color of the cancel button. if cancel button not defined this method
	 *  will not run
	 * 
	 *  @param textColor color of the text
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog cancelButtonColors(int textColor) {
	}

	/**
	 *  dispose the dialog if user clicked outside the dialog
	 * 
	 *  @return this MDialog for chaining calls
	 */
	public MDialog closeOnOutsideClick() {
	}

	/**
	 *  set the dialog to be RTL
	 * 
	 *  @return this confirmDialog for chaining calls
	 */
	public MDialog RTL() {
	}

	/**
	 *  This Method used to initialize the material design of the component
	 */
	@java.lang.Override
	public void initMaterialComponent() {
	}

	/**
	 *  The Style helper of the Component
	 * 
	 *  @return style helper instance
	 */
	@java.lang.Override
	public MStyle style() {
	}

	/**
	 *  show the dialog
	 */
	public void show() {
	}

	/**
	 *  Create Confirm Dialog with the {@code MaterialColor.PRIMARY} color
	 * 
	 *  @return new MDialog instance with
	 */
	public static MDialog createConfirm(String title, String body, String confirmButton, String cancelButton) {
	}

	/**
	 *  Create danger Dialog with the {@code MaterialColor.ERROR} color for the buttons as default
	 * 
	 *  @return new MDialog instances
	 */
	public static MDialog createDanger(String title, String body, String confirmButton, String cancelButton) {
	}
}
