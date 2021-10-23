package de.azizothman.materialdesign.ui;


public class MToast extends com.codename1.ui.Label implements MaterialComponent {

	/**
	 *  constructor create toast from given text and hide after timeout in millisecond
	 * 
	 *  @param text    the text of the toast
	 *  @param timeout how long to display the toast in millisecond
	 */
	public MToast(String text, int timeout) {
	}

	/**
	 *  constructor create toast from given text and icon. hide after timeout in millisecond
	 * 
	 *  @param text    the text of the toast
	 *  @param icon    the icon of the toast
	 *  @param timeout how long to display the toast in millisecond
	 *  @param rtl     set right to left
	 */
	public MToast(String text, com.codename1.ui.Image icon, int timeout, boolean rtl) {
	}

	/**
	 *  This Method used to initialize the material design of the component
	 */
	@java.lang.Override
	public void initMaterialComponent() {
	}

	/**
	 *  The Style helper of the Button
	 * 
	 *  @return style helper instance
	 */
	@java.lang.Override
	public MStyle style() {
	}

	/**
	 *  Show the toast
	 */
	public void show() {
	}

	/**
	 *  Show normal toast with the given text in white and black background
	 * 
	 *  @param text the text of the toast
	 */
	public static void showToast(String text) {
	}

	/**
	 *  Show info toast with the given text
	 * 
	 *  @param text the text of the toast
	 */
	public static void showInfo(String text) {
	}

	/**
	 *  Show warning toast with the given text
	 * 
	 *  @param text the text of the toast
	 */
	public static void showWarning(String text) {
	}

	/**
	 *  Show success toast with the given text
	 * 
	 *  @param text the text of the toast
	 */
	public static void showSuccess(String text) {
	}

	/**
	 *  Show success toast with the given text
	 * 
	 *  @param text the text of the toast
	 */
	public static void showError(String text) {
	}
}
