package de.azizothman.materialdesign.ui;


public class MCheckBox extends com.codename1.ui.CheckBox implements MaterialComponent {

	/**
	 *  Constructs a CheckBox with an empty string for its text.
	 */
	public MCheckBox() {
	}

	/**
	 *  Constructs a checkbox with the given icon
	 * 
	 *  @param icon icon to display next to the checkbox
	 */
	public MCheckBox(com.codename1.ui.Image icon) {
	}

	/**
	 *  Constructs a checkbox with the given text
	 * 
	 *  @param text to display next to the checkbox
	 */
	public MCheckBox(String text) {
	}

	/**
	 *  Constructs a CheckBox with the specified text.
	 * 
	 *  @param text label appearing on the button
	 */
	public MCheckBox(String text, com.codename1.ui.Image icon) {
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
	 *  set the value of the check box to be selected
	 * 
	 *  @return same MCheckBox instance for chaining
	 */
	public MCheckBox select() {
	}

	/**
	 *  Adds a listener to be notified when the the check box selected value changes
	 * 
	 *  @param l Listener to be notified when selected value changes.
	 *  @return same MCheckBox instance for chaining calls eg.
	 *  <pre><code>form.add(new MCheckBox("Hello")<br/>.dataChangeListener(l->System.out.println("selected value changed")))</code></pre>
	 */
	public MCheckBox dataChangeListener(com.codename1.ui.events.ActionListener l) {
	}

	/**
	 *  set the color of all check boxes box while selected
	 * 
	 *  @param color the color of all check boxes box while selected
	 */
	public static void setCheckBoxesDesign(int color, boolean round) {
	}
}
