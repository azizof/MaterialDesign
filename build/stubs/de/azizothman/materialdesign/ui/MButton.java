package de.azizothman.materialdesign.ui;


public class MButton extends com.codename1.ui.Button implements MaterialComponent {

	/**
	 *  Constructs a button with an empty string for its text.
	 */
	public MButton() {
	}

	/**
	 *  Constructs a button with the specified material image icon.
	 * 
	 *  @param icon appearing on the button
	 */
	public MButton(char icon) {
	}

	/**
	 *  Constructs a button with the specified material image icon.
	 * 
	 *  @param icon     appearing on the button
	 *  @param iconSize the size of the icon in millimeters
	 */
	public MButton(char icon, int iconSize) {
	}

	/**
	 *  Constructs a button with the specified text.
	 * 
	 *  @param text label appearing on the button
	 */
	public MButton(String text) {
	}

	/**
	 *  This Method used to initialize the material design of the component
	 */
	@java.lang.Override
	public void initMaterialComponent() {
	}

	/**
	 *  Adds a listener to the button
	 * 
	 *  @param listener the action listener
	 *  @return this for chaining calls Eg.<br/>
	 *  <code>form.add(new MButton("text")<br/>.action(l->print("Clicked!"));</code>
	 */
	public MButton action(com.codename1.ui.events.ActionListener listener) {
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
	 *  This method is shorthand for {@link FontImage#setMaterialIcon(Label, char)}
	 * 
	 *  @param icon one of the constants from {@link FontImage}
	 */
	@java.lang.Override
	public void setMaterialIcon(char icon) {
	}

	/**
	 *  This method is shorthand for {@link FontImage#setMaterialIcon(Label l, char icon, float size)}
	 * 
	 *  @param icon one of the constants from {@link FontImage}
	 *  @param size the size of the icon in millimeters
	 */
	@java.lang.Override
	public void setMaterialIcon(char icon, float size) {
	}

	/**
	 *  Create instance of MButton with info background
	 * 
	 *  @param text the text of the Button
	 *  @return instance of MButton with error background.Eg.<br/>
	 *  <code>form.add(MButton.info("error").action(l-> MToast.showError("Error")));</code>
	 */
	public static MButton info(String text) {
	}

	/**
	 *  Create instance of MButton with error background
	 * 
	 *  @param text the text of the Button
	 *  @return instance of MButton with error background.Eg.<br/>
	 *  <code>form.add(MButton.error("error").action(l-> MToast.showError("Error")));</code>
	 */
	public static MButton error(String text) {
	}

	/**
	 *  Create instance of MButton with error background
	 * 
	 *  @param text the text of the Button
	 *  @return instance of MButton with error backgroundEg.<br/>
	 *  <code>form.add(MButton.success("success").action(l-> MToast.showSuccess("Success")));</code>
	 */
	public static MButton success(String text) {
	}

	/**
	 *  Create instance of MButton with warning background
	 * 
	 *  @param text the text of the Button
	 *  @return instance of MButton with warning background.Eg.<br/>
	 *  <code>form.add(MButton.warning("warning").action(l-> MToast.showWarning("Warning")));</code>
	 */
	public static MButton warning(String text) {
	}

	/**
	 *  Create instance of MButton with no background (transparency = 0)
	 * 
	 *  @param text      the text of the Button
	 *  @param color     the color of the text
	 *  @param underLine if true make the text of the button underline
	 *  @return instance of MButton with no background.Eg.<br/>
	 *  <code>form.add(MButton.textOnly("text only",MaterialColor.ERROR,false).action(l-> System.out.println("textOnly")));</code>
	 */
	public static MButton textOnly(String text, int color, boolean underLine) {
	}

	/**
	 *  Create instance of MButton with no background (transparency = 0) and rounded border
	 * 
	 *  @param text  the text of the Button
	 *  @param color the color of the text
	 *  @return instance of MButton with no background.Eg.<br/>
	 *  <code>form.add(MButton.outline("text only",MaterialColor.ERROR).action(l-> System.out.println("outline")));</code>
	 */
	public static MButton outline(String text, int color) {
	}
}
