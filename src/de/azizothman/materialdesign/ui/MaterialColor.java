package de.azizothman.materialdesign.ui;

import com.codename1.charts.util.ColorUtil;

import java.util.Random;

public class MaterialColor {

    /**
     * The black color
     */
    public static final int BLACK = 0x0;

    /**
     * The white color
     */
    public static final int WHITE = 0xffffff;
    /**
     * Default primary color
     */
    public static final int PRIMARY = 0x0275d8;

    /**
     * Default dark color
     */
    public static final int PRIMARY_DARK = 0x3700B3;

    /**
     * Default error color
     */
    public static final int ERROR = 0xd9534f;

    /**
     * Default success color
     */
    public static final int SUCCESS = 0x5cb85c;

    /**
     * Default info color
     */
    public static final int INFO = 0x5bc0de;

    /**
     * Default warning color
     */
    public static final int WARNING = 0xf0ad4e;


    /**
     * Convert hex color in String to int color. the hex color can start with '#' or not. <br/>
     * eg."#ffffff" will be converted to 0xffffff <br/>
     * and "ff0000" will be converted to 0xff0000<br/>
     *
     * @param hexColor the hex color as text eg. "#ffffff" or "ffffff" for white
     * @return the given color as an Integer eg. 0xffffff for white
     */
    public static int hexToColor(String hexColor) {
        if (hexColor.startsWith("#")) {
            hexColor = hexColor.substring(1);
        }
        return ColorUtil.rgb(Integer.parseInt(hexColor.substring(0, 2), 16),
                Integer.parseInt(hexColor.substring(2, 4), 16),
                Integer.parseInt(hexColor.substring(4, 6), 16));
    }

    /**
     * This method create a random color and return it in an integer form eg. 0xffffff for white.
     *
     * @return a random color
     */
    public static int getRandomColor() {
        Random r = new Random();

        int red = r.nextInt(255);
        int green = r.nextInt(255);
        int blue = r.nextInt(255);
        return ColorUtil.rgb(red, green, blue);
    }

    /**
     * This method create a random dark color and return it in an Integer form eg. 0x0 for black.
     *
     * @return a random dark color
     */
    public static int getRandomDarkColor() {
        int color = getRandomColor();
        if (isColorDark(color)) {
            return color;
        } else {
            return getRandomDarkColor();
        }
    }

    /**
     * This method create a random light color and return it in an Integer form eg. 0xffffff for black
     *
     * @return a random light color
     */
    public static int getRandomLightColor() {
        int color = getRandomColor();
        if (!isColorDark(color)) {
            return color;
        } else {
            return getRandomLightColor();
        }
    }

    /**
     * this method used to check if the given color is dark color or light.
     * the given color should be in an Integer form <br/>
     * eg. 0x0 (black) for this color the return value will be true <br/>
     * eg2. 0xffffff (white) for this color the return value will be false <br/>
     *
     * @param color the color to check in integer form
     * @return true if the given color in the dark mode
     */
    public static boolean isColorDark(int color) {
        double darkness = 1 - (0.299 * ColorUtil.red(color) + 0.587 * ColorUtil.green(color) + 0.114 * ColorUtil.blue(color)) / 255;
        if (darkness < 0.5) {
            return false; // It's a light color
        } else {
            return true; // It's a dark color
        }
    }

    /**
     * this method used to check if the given color is dark color or light.
     * the given color should be in a hex form starting with '#' or not <br/>
     * eg. "#000000" (black) for this color the return value will be true <br/>
     * eg2. "ffffff" (white) for this color the return value will be false <br/>
     *
     * @param hexColor the color to check in hex form
     * @return true if the given color in the dark mode
     */
    public static boolean isColorDark(String hexColor) {
        return isColorDark(hexToColor(hexColor));
    }
}
