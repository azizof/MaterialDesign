package de.azizothman.materialdesign.ui;


public class MaterialColor {

	/**
	 *  The black color
	 */
	public static final int BLACK = 0;

	/**
	 *  The white color
	 */
	public static final int WHITE = 16777215;

	/**
	 *  Default primary color
	 */
	public static final int PRIMARY = 161240;

	/**
	 *  Default dark color
	 */
	public static final int PRIMARY_DARK = 3604659;

	/**
	 *  Default error color
	 */
	public static final int ERROR = 14242639;

	/**
	 *  Default success color
	 */
	public static final int SUCCESS = 6076508;

	/**
	 *  Default info color
	 */
	public static final int INFO = 6013150;

	/**
	 *  Default warning color
	 */
	public static final int WARNING = 15773006;

	public MaterialColor() {
	}

	/**
	 *  Convert hex color in String to int color. the hex color can start with '#' or not. <br/>
	 *  eg."#ffffff" will be converted to 0xffffff <br/>
	 *  and "ff0000" will be converted to 0xff0000<br/>
	 * 
	 *  @param hexColor the hex color as text eg. "#ffffff" or "ffffff" for white
	 *  @return the given color as an Integer eg. 0xffffff for white
	 */
	public static int hexToColor(String hexColor) {
	}

	/**
	 *  This method create a random color and return it in an integer form eg. 0xffffff for white.
	 * 
	 *  @return a random color
	 */
	public static int getRandomColor() {
	}

	/**
	 *  This method create a random dark color and return it in an Integer form eg. 0x0 for black.
	 * 
	 *  @return a random dark color
	 */
	public static int getRandomDarkColor() {
	}

	/**
	 *  This method create a random light color and return it in an Integer form eg. 0xffffff for black
	 * 
	 *  @return a random light color
	 */
	public static int getRandomLightColor() {
	}

	/**
	 *  this method used to check if the given color is dark color or light.
	 *  the given color should be in an Integer form <br/>
	 *  eg. 0x0 (black) for this color the return value will be true <br/>
	 *  eg2. 0xffffff (white) for this color the return value will be false <br/>
	 * 
	 *  @param color the color to check in integer form
	 *  @return true if the given color in the dark mode
	 */
	public static boolean isColorDark(int color) {
	}

	/**
	 *  this method used to check if the given color is dark color or light.
	 *  the given color should be in a hex form starting with '#' or not <br/>
	 *  eg. "#000000" (black) for this color the return value will be true <br/>
	 *  eg2. "ffffff" (white) for this color the return value will be false <br/>
	 * 
	 *  @param hexColor the color to check in hex form
	 *  @return true if the given color in the dark mode
	 */
	public static boolean isColorDark(String hexColor) {
	}
}
