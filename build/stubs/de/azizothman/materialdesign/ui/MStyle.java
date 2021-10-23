package de.azizothman.materialdesign.ui;


/**
 *  This Class is used as Style helper <br/>
 *  all methods in this class return the same instance for chaining calls Eg.<br/>
 *  <code>(componentUsingThisClass).margin(0).padding(2)<br/>.bgColor(0x000000).fgColor(0xffffff).roundBorder();</code>
 *  <br/>
 *  <br/>
 *  it helps to do a lot by writing less :p
 */
public class MStyle {

	public MStyle(com.codename1.ui.Component component) {
	}

	/**
	 *  set the background color when the component pressed
	 *  <h6>Warning!</h6> this will not work after set the background to linear gradient
	 * 
	 *  @param bgColor the background color
	 *  @return component style for chaining calls
	 */
	public MStyle onPressColor(int bgColor) {
	}

	/**
	 *  Set the font of the component to ITALIC
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle fontItalic() {
	}

	/**
	 *  Set the font of the component to PLAIN
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle fontPlain() {
	}

	/**
	 *  Set the font of the component to BOLD
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle fontBold() {
	}

	/**
	 *  set the border of the component to empty
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle noBorder() {
	}

	/**
	 *  Set the border of the component to round rect with stroke
	 *  width = 0 and corner radius = 1
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle roundRectBorder() {
	}

	/**
	 *  Set the border of the component to round with stroke width = 0
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle roundBorder() {
	}

	/**
	 *  Set the border of the component to round rect
	 * 
	 *  @param strokeWidth  The width of the stroke pixels
	 *  @param strokeColor  the color of the stroke
	 *  @param cornerRadius the radius of the corner
	 *  @return component style for chaining calls
	 */
	public MStyle roundRectBorder(int strokeWidth, int strokeColor, float cornerRadius, boolean shadow) {
	}

	/**
	 *  Set the border of the component to round
	 * 
	 *  @param strokeWidth The width of the stroke pixels
	 *  @param strokeColor the color of the stroke
	 *  @return component style for chaining calls
	 */
	public MStyle roundBorder(int strokeWidth, int strokeColor) {
	}

	/**
	 *  set the font of the Component
	 * 
	 *  @param size the font size in mm
	 *  @return component style for chaining calls
	 */
	public MStyle setFontSize(int size) {
	}

	/**
	 *  put a line under the text
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle underlineText() {
	}

	/**
	 *  set the alignment of the component to center
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle alignCenter() {
	}

	/**
	 *  set the alignment of the component to left
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle alignLeft() {
	}

	/**
	 *  set the alignment of the component to right
	 * 
	 *  @return component style for chaining calls
	 */
	public MStyle alignRight() {
	}

	/**
	 *  set the background of the component to a horizontal linear gradient
	 * 
	 *  @param startHex start color for the linear gradient
	 *  @param endHex   end color for the linear gradient
	 *  @return component style for chaining calls
	 */
	public MStyle bgGradientHorizontal(String startHex, String endHex) {
	}

	/**
	 *  set the background of the component to a vertical linear gradient
	 * 
	 *  @param startHex start color for the linear gradient
	 *  @param endHex   end color for the linear gradient
	 *  @return component style for chaining calls
	 */
	public MStyle bgGradientVertical(String startHex, String endHex) {
	}

	/**
	 *  set the background of the component to a horizontal linear gradient
	 * 
	 *  @param start start color for the linear gradient
	 *  @param end   end color for the linear gradient
	 *  @return component style for chaining calls
	 */
	public MStyle bgGradientHorizontal(int start, int end) {
	}

	/**
	 *  set the background of the component to a vertical linear gradient
	 * 
	 *  @param start start color for the linear gradient
	 *  @param end   end color for the linear gradient
	 *  @return component style for chaining calls
	 */
	public MStyle bgGradientVertical(int start, int end) {
	}

	/**
	 *  Sets the foreground color for the component
	 * 
	 *  @param hexColor the color of the foreground in hex
	 *  @return component style for chaining calls
	 */
	public MStyle fgColor(String hexColor) {
	}

	/**
	 *  Sets the background color for the component
	 * 
	 *  @param hexColor the color of the background in hex
	 *  @return component style for chaining calls
	 */
	public MStyle bgColor(String hexColor) {
	}

	/**
	 *  Sets the foreground color for the component
	 * 
	 *  @param fgColor the color of the foreground
	 *  @return component style for chaining calls
	 */
	public MStyle fgColor(int fgColor) {
	}

	/**
	 *  Sets the Component transparency level
	 * 
	 *  @param bgTransparency the Component transparency level between 0-255
	 *  @return component style for chaining calls
	 */
	public MStyle bgTransparency(int bgTransparency) {
	}

	/**
	 *  Sets the background color for the component
	 * 
	 *  @param bgColor the color of the background
	 *  @return component style for chaining calls
	 */
	public MStyle bgColor(int bgColor) {
	}

	/**
	 *  get the foreground color
	 * 
	 *  @return the foreground color
	 */
	public int getFgColor() {
	}

	/**
	 *  get the background color
	 * 
	 *  @return the background color
	 */
	public Integer getBgColor() {
	}

	/**
	 *  get the transparency level
	 * 
	 *  @return the transparency level
	 */
	public int getBgTransparency() {
	}

	/**
	 *  Set the padding which will be applied to the top,bottom,left and right of
	 *  the component
	 * 
	 *  @param padding number of padding
	 *  @return component style for chaining calls
	 */
	public MStyle padding(float padding) {
	}

	/**
	 *  set the padding of the top and bottom same and left and right the same
	 * 
	 *  @param top_bottom the padding on top and bottom of the component
	 *  @param left_right the padding on left and right of the component
	 *  @return component style for chaining calls
	 */
	public MStyle padding(float top_bottom, float left_right) {
	}

	/**
	 *  set the padding of the top , bottom , left and right
	 * 
	 *  @param top    the padding on top of the component
	 *  @param bottom the padding on bottom of the component
	 *  @param left   the padding on left of the component
	 *  @param right  the padding on right of the component
	 *  @return component style for chaining calls
	 */
	public MStyle padding(float top, float bottom, float left, float right) {
	}

	/**
	 *  Set the top padding of the Component
	 * 
	 *  @param paddingTop number of top padding
	 *  @return component style for chaining calls
	 */
	public MStyle paddingTop(float paddingTop) {
	}

	/**
	 *  Set the bottom padding of the Component
	 * 
	 *  @param paddingBottom number of bottom padding
	 *  @return component style for chaining calls
	 */
	public MStyle paddingBottom(float paddingBottom) {
	}

	/**
	 *  Set the left padding of the Component
	 * 
	 *  @param paddingLeft number of left padding
	 *  @return component style for chaining calls
	 */
	public MStyle paddingLeft(float paddingLeft) {
	}

	/**
	 *  Set the right padding of the Component
	 * 
	 *  @param paddingRight number of right padding
	 *  @return component style for chaining calls
	 */
	public MStyle paddingRight(float paddingRight) {
	}

	/**
	 *  get the top padding
	 * 
	 *  @return the top padding
	 */
	public float getPaddingTop() {
	}

	/**
	 *  get the bottom padding
	 * 
	 *  @return the bottom padding
	 */
	public float getPaddingBottom() {
	}

	/**
	 *  get the left padding
	 * 
	 *  @return the left padding
	 */
	public float getPaddingLeft() {
	}

	/**
	 *  get the right padding
	 * 
	 *  @return the right padding
	 */
	public float getPaddingRight() {
	}

	/**
	 *  Set the margin which will be applied to the top,bottom,left and right of
	 *  the component
	 * 
	 *  @param margin number of margin
	 *  @return component style for chaining calls
	 */
	public MStyle margin(float margin) {
	}

	/**
	 *  set the margin of the top and bottom same and left and right the same
	 * 
	 *  @param top_bottom the margin on top and bottom of the component
	 *  @param left_right the margin on left and right of the component
	 *  @return component style for chaining calls
	 */
	public MStyle margin(float top_bottom, float left_right) {
	}

	/**
	 *  Set the top Margin of the Component
	 * 
	 *  @param marginTop number of top margin
	 *  @return component style for chaining calls
	 */
	public MStyle marginTop(float marginTop) {
	}

	/**
	 *  Set the bottom Margin of the Component
	 * 
	 *  @param marginBottom number of bottom margin
	 *  @return component style for chaining calls
	 */
	public MStyle marginBottom(float marginBottom) {
	}

	/**
	 *  Set the left Margin of the Component
	 * 
	 *  @param marginLeft number of left margin
	 *  @return component style for chaining calls
	 */
	public MStyle marginLeft(float marginLeft) {
	}

	/**
	 *  Set the top Margin of the Component
	 * 
	 *  @param marginRight number of right margin
	 *  @return component style for chaining calls
	 */
	public MStyle marginRight(float marginRight) {
	}

	/**
	 *  get the top margin
	 * 
	 *  @return the top margin
	 */
	public float getMarginTop() {
	}

	/**
	 *  get the bottom margin
	 * 
	 *  @return the bottom margin
	 */
	public float getMarginBottom() {
	}

	/**
	 *  get the left margin
	 * 
	 *  @return the left margin
	 */
	public float getMarginLeft() {
	}

	/**
	 *  get the right margin
	 * 
	 *  @return the right margin
	 */
	public float getMarginRight() {
	}
}
