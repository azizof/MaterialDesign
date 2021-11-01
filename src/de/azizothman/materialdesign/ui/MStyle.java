package de.azizothman.materialdesign.ui;

import com.codename1.ui.CN;
import com.codename1.ui.Component;
import com.codename1.ui.Font;
import com.codename1.ui.Stroke;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.RoundRectBorder;

import static de.azizothman.materialdesign.ui.MaterialColor.hexToColor;

/**
 * This Class is used as Style helper <br/>
 * all methods in this class return the same instance for chaining calls Eg.<br/>
 * <code>(componentUsingThisClass).margin(0).padding(2)<br/>.bgColor(0x000000).fgColor(0xffffff).roundBorder();</code>
 * <br/>
 * <br/>
 * it helps to do a lot by writing less :p
 */
public class MStyle {

    /**
     * The Component to which the style will be applied
     */
    private final Component component;

    private Integer bgColor;
    private Integer fgColor;
    private Integer bgTransparency;

    /**
     * The padding of the component
     */
    private Float paddingTop;
    private Float paddingBottom;
    private Float paddingLeft;
    private Float paddingRight;

    /**
     * The margin of the component
     */
    private Float marginTop;
    private Float marginBottom;
    private Float marginLeft;
    private Float marginRight;

    /**
     * the font of the component
     */
    private final Font font;


    MStyle(Component component) {
        this.component = component;
        byte b = com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS;
        this.component.getAllStyles().setPaddingUnit(b, b, b, b);
        this.component.getAllStyles().setMarginUnit(b, b, b, b);
        this.font = component.getUnselectedStyle().getFont();

    }


    /**
     * set the background color when the component pressed
     * <h6>Warning!</h6> this will not work after set the background to linear gradient
     *
     * @param bgColor the background color
     * @return component style for chaining calls
     */
    public MStyle onPressColor(int bgColor) {
        component.getPressedStyle().setBgColor(bgColor);
        component.getPressedStyle().setBgTransparency(255);
        return this;
    }


    /**
     * Set the font of the component to ITALIC
     *
     * @return component style for chaining calls
     */
    public MStyle fontItalic() {
        component.getAllStyles().setFont(font.derive(font.getPixelSize(), Font.STYLE_ITALIC));
        return this;
    }


    /**
     * Set the font of the component to PLAIN
     *
     * @return component style for chaining calls
     */
    public MStyle fontPlain() {
        component.getAllStyles().setFont(font.derive(font.getPixelSize(), Font.STYLE_PLAIN));
        return this;
    }

    /**
     * Set the font of the component to BOLD
     *
     * @return component style for chaining calls
     */
    public MStyle fontBold() {
        component.getAllStyles().setFont(font.derive(font.getPixelSize(), Font.STYLE_BOLD));
        return this;
    }

    /**
     * set the border of the component to empty
     *
     * @return component style for chaining calls
     */
    public MStyle noBorder() {
        component.getAllStyles().setBorder(Border.createEmpty());
        return this;
    }

    /**
     * Set the border of the component to round rect with stroke
     * width = 0 and corner radius = 1
     *
     * @return component style for chaining calls
     */
    public MStyle roundRectBorder() {
        return roundRectBorder(0, 0x0, 1, false);
    }

    /**
     * Set the border of the component to round with stroke width = 0
     *
     * @return component style for chaining calls
     */
    public MStyle roundBorder() {
        return roundBorder(0, 0x0);
    }

    /**
     * Set the border of the component to round rect
     *
     * @param strokeWidth  The width of the stroke pixels
     * @param strokeColor  the color of the stroke
     * @param cornerRadius the radius of the corner
     * @return component style for chaining calls
     */
    public MStyle roundRectBorder(int strokeWidth, int strokeColor, float cornerRadius, boolean shadow) {
        Stroke borderStroke = new Stroke(strokeWidth, Stroke.CAP_SQUARE, Stroke.JOIN_MITER, 1);
        int bg = getBgColor();
        RoundRectBorder border = RoundRectBorder.create().cornerRadius(cornerRadius)
                .strokeColor(strokeColor).
                        strokeOpacity(255).
                        stroke(borderStroke);
        if (shadow) {
            border.shadowOpacity(100).
                    shadowSpread(20).shadowX(0.5f).shadowBlur(2).shadowY(0.5f);
        }
        component.getAllStyles().setBorder(border);
        bgColor(bg);
        bgTransparency(255);
        return this;
    }

    /**
     * Set the border of the component to round
     *
     * @param strokeWidth The width of the stroke pixels
     * @param strokeColor the color of the stroke
     * @return component style for chaining calls
     */
    public MStyle roundBorder(int strokeWidth, int strokeColor) {
        Stroke borderStroke = new Stroke(strokeWidth, Stroke.CAP_SQUARE, Stroke.JOIN_MITER, 1);
        int bg = getBgColor();
        component.getAllStyles().setBorder(
                com.codename1.ui.plaf.RoundBorder.create().rectangle(true).stroke(borderStroke)
                        .strokeColor(strokeColor).color(bg).
                        strokeOpacity(255));
        return this;
    }

    /**
     * set the font of the Component
     *
     * @param size the font size in mm
     * @return component style for chaining calls
     */
    public MStyle setFontSize(int size) {
        Font font = component.getAllStyles().getFont();
        component.getAllStyles().setFont(font.derive(convertToPixel(size), font.getStyle()));
        return this;
    }

    /**
     * put a line under the text
     *
     * @return component style for chaining calls
     */
    public MStyle underlineText() {
        component.getAllStyles().setUnderline(true);
        return this;
    }

    /**
     * set the alignment of the component to center
     *
     * @return component style for chaining calls
     */
    public MStyle alignCenter() {
        component.getAllStyles().setAlignment(Component.CENTER);
        return this;
    }

    /**
     * set the alignment of the component to left
     *
     * @return component style for chaining calls
     */
    public MStyle alignLeft() {
        component.getAllStyles().setAlignment(Component.LEFT);
        return this;
    }

    /**
     * set the alignment of the component to right
     *
     * @return component style for chaining calls
     */
    public MStyle alignRight() {
        component.getAllStyles().setAlignment(Component.RIGHT);
        return this;
    }

    /**
     * set the background of the component to a horizontal linear gradient
     *
     * @param startHex start color for the linear gradient
     * @param endHex   end color for the linear gradient
     * @return component style for chaining calls
     */
    public MStyle bgGradientHorizontal(String startHex, String endHex) {
        return bgGradientHorizontal(hexToColor(startHex), hexToColor(endHex));
    }

    /**
     * set the background of the component to a vertical linear gradient
     *
     * @param startHex start color for the linear gradient
     * @param endHex   end color for the linear gradient
     * @return component style for chaining calls
     */
    public MStyle bgGradientVertical(String startHex, String endHex) {
        return bgGradientVertical(hexToColor(startHex), hexToColor(endHex));
    }

    /**
     * set the background of the component to a horizontal linear gradient
     *
     * @param start start color for the linear gradient
     * @param end   end color for the linear gradient
     * @return component style for chaining calls
     */
    public MStyle bgGradientHorizontal(int start, int end) {
        component.getAllStyles().setBackgroundType(com.codename1.ui.plaf.Style.BACKGROUND_GRADIENT_LINEAR_HORIZONTAL);
        component.getAllStyles().setBackgroundGradientStartColor(start);
        component.getAllStyles().setBackgroundGradientEndColor(end);
        return this;
    }

    /**
     * set the background of the component to a vertical linear gradient
     *
     * @param start start color for the linear gradient
     * @param end   end color for the linear gradient
     * @return component style for chaining calls
     */
    public MStyle bgGradientVertical(int start, int end) {
        component.getAllStyles().setBackgroundType(com.codename1.ui.plaf.Style.BACKGROUND_GRADIENT_LINEAR_VERTICAL);
        component.getAllStyles().setBackgroundGradientStartColor(start);
        component.getAllStyles().setBackgroundGradientEndColor(end);
        return this;
    }

    /**
     * Sets the foreground color for the component
     *
     * @param hexColor the color of the foreground in hex
     * @return component style for chaining calls
     */
    public MStyle fgColor(String hexColor) {
        return fgColor(hexToColor(hexColor));
    }

    /**
     * Sets the background color for the component
     *
     * @param hexColor the color of the background in hex
     * @return component style for chaining calls
     */
    public MStyle bgColor(String hexColor) {
        return bgColor(hexToColor(hexColor));
    }

    /**
     * Sets the foreground color for the component
     *
     * @param fgColor the color of the foreground
     * @return component style for chaining calls
     */
    public MStyle fgColor(int fgColor) {
        this.fgColor = fgColor;
        component.getAllStyles().setFgColor(this.fgColor);
        return this;
    }

    /**
     * Sets the Component transparency level
     *
     * @param bgTransparency the Component transparency level between 0-255
     * @return component style for chaining calls
     */
    public MStyle bgTransparency(int bgTransparency) {
        this.bgTransparency = bgTransparency;
        component.getAllStyles().setBgTransparency(this.bgTransparency);
        return this;
    }

    /**
     * Sets the background color for the component
     *
     * @param bgColor the color of the background
     * @return component style for chaining calls
     */
    public MStyle bgColor(int bgColor) {
        this.bgColor = bgColor;
        if (bgTransparency == null || bgTransparency == 0) {
            component.getAllStyles().setBgTransparency(255);
        }
        component.getAllStyles().setBgColor(this.bgColor);
        return this;
    }

    /**
     * Set the opacity value of the component
     *
     * @param opacity the opacity value
     * @return component style for chaining calls
     */
    public MStyle opacity(int opacity) {
        component.getAllStyles().setOpacity(opacity);
        return this;
    }

    /**
     * get the foreground color
     *
     * @return the foreground color
     */
    public int getFgColor() {
        if (fgColor == null) {
            return component.getAllStyles().getFgColor();
        } else {
            return fgColor;
        }
    }

    /**
     * get the background color
     *
     * @return the background color
     */
    public Integer getBgColor() {
        if (bgColor == null) {
            return component.getAllStyles().getBgColor();
        } else {
            return bgColor;
        }
    }

    /**
     * get the transparency level
     *
     * @return the transparency level
     */
    public int getBgTransparency() {
        if (bgTransparency == null) {
            return component.getAllStyles().getBgTransparency();
        }
        return bgTransparency;
    }

    /**
     * Set the padding which will be applied to the top,bottom,left and right of
     * the component
     *
     * @param padding number of padding
     * @return component style for chaining calls
     */
    public MStyle padding(float padding) {
        padding(padding, padding);
        return this;
    }

    /**
     * set the padding of the top and bottom same and left and right the same
     *
     * @param top_bottom the padding on top and bottom of the component
     * @param left_right the padding on left and right of the component
     * @return component style for chaining calls
     */
    public MStyle padding(float top_bottom, float left_right) {
        paddingTop(top_bottom);
        paddingBottom(top_bottom);
        paddingLeft(left_right);
        paddingRight(left_right);
        return this;
    }

    /**
     * set the padding of the top , bottom , left and right
     *
     * @param top    the padding on top of the component
     * @param bottom the padding on bottom of the component
     * @param left   the padding on left of the component
     * @param right  the padding on right of the component
     * @return component style for chaining calls
     */
    public MStyle padding(float top, float bottom, float left, float right) {
        paddingTop(top);
        paddingBottom(bottom);
        paddingLeft(left);
        paddingRight(right);
        return this;
    }

    /**
     * Set the top padding of the Component
     *
     * @param paddingTop number of top padding
     * @return component style for chaining calls
     */
    public MStyle paddingTop(float paddingTop) {
        this.paddingTop = convertToPixel(paddingTop);
        component.getAllStyles().setPaddingTop(this.paddingTop);
        return this;
    }

    /**
     * Set the bottom padding of the Component
     *
     * @param paddingBottom number of bottom padding
     * @return component style for chaining calls
     */
    public MStyle paddingBottom(float paddingBottom) {
        this.paddingBottom = convertToPixel(paddingBottom);
        component.getAllStyles().setPaddingBottom(this.paddingBottom);
        return this;
    }

    /**
     * Set the left padding of the Component
     *
     * @param paddingLeft number of left padding
     * @return component style for chaining calls
     */
    public MStyle paddingLeft(float paddingLeft) {
        this.paddingLeft = convertToPixel(paddingLeft);
        component.getAllStyles().setPaddingLeft(this.paddingLeft);
        return this;
    }

    /**
     * Set the right padding of the Component
     *
     * @param paddingRight number of right padding
     * @return component style for chaining calls
     */
    public MStyle paddingRight(float paddingRight) {
        this.paddingRight = convertToPixel(paddingRight);
        component.getAllStyles().setPaddingRight(this.paddingRight);
        return this;
    }

    /**
     * get the top padding
     *
     * @return the top padding
     */
    public float getPaddingTop() {
        if (paddingTop == null) {
            return component.getAllStyles().getPaddingTop();
        } else {
            return paddingTop;
        }
    }

    /**
     * get the bottom padding
     *
     * @return the bottom padding
     */
    public float getPaddingBottom() {
        if (paddingBottom == null) {
            return component.getAllStyles().getPaddingBottom();
        } else {
            return paddingBottom;
        }
    }

    /**
     * get the left padding
     *
     * @return the left padding
     */
    public float getPaddingLeft() {
        if (paddingLeft == null) {
            return component.getAllStyles().getPaddingLeft(component.isRTL());
        } else {
            return paddingLeft;
        }
    }

    /**
     * get the right padding
     *
     * @return the right padding
     */
    public float getPaddingRight() {
        if (paddingRight == null) {
            return component.getAllStyles().getPaddingRight(component.isRTL());
        } else {
            return paddingRight;
        }
    }

    /**
     * Set the margin which will be applied to the top,bottom,left and right of
     * the component
     *
     * @param margin number of margin
     * @return component style for chaining calls
     */
    public MStyle margin(float margin) {
        margin(margin, margin);
        return this;
    }

    /**
     * set the margin of the top and bottom same and left and right the same
     *
     * @param top_bottom the margin on top and bottom of the component
     * @param left_right the margin on left and right of the component
     * @return component style for chaining calls
     */
    public MStyle margin(float top_bottom, float left_right) {
        marginTop(top_bottom);
        marginBottom(top_bottom);
        marginLeft(left_right);
        marginRight(left_right);
        return this;
    }

    /**
     * Set the top Margin of the Component
     *
     * @param marginTop number of top margin
     * @return component style for chaining calls
     */
    public MStyle marginTop(float marginTop) {
        this.marginTop = convertToPixel(marginTop);
        component.getAllStyles().setMarginTop(this.marginTop);
        return this;
    }

    /**
     * Set the bottom Margin of the Component
     *
     * @param marginBottom number of bottom margin
     * @return component style for chaining calls
     */
    public MStyle marginBottom(float marginBottom) {
        this.marginBottom = convertToPixel(marginBottom);
        component.getAllStyles().setMarginBottom(this.marginBottom);
        return this;
    }

    /**
     * Set the left Margin of the Component
     *
     * @param marginLeft number of left margin
     * @return component style for chaining calls
     */
    public MStyle marginLeft(float marginLeft) {
        this.marginLeft = convertToPixel(marginLeft);
        component.getAllStyles().setMarginLeft(this.marginLeft);
        return this;
    }

    /**
     * Set the top Margin of the Component
     *
     * @param marginRight number of right margin
     * @return component style for chaining calls
     */
    public MStyle marginRight(float marginRight) {
        this.marginRight = convertToPixel(marginRight);
        component.getAllStyles().setMarginRight(this.marginRight);
        return this;
    }

    /**
     * get the top margin
     *
     * @return the top margin
     */
    public float getMarginTop() {
        if (marginTop == null) {
            return component.getAllStyles().getMarginTop();
        } else {
            return marginTop;
        }
    }

    /**
     * get the bottom margin
     *
     * @return the bottom margin
     */
    public float getMarginBottom() {
        if (marginBottom == null) {
            return component.getAllStyles().getMarginBottom();
        } else {
            return marginBottom;
        }
    }

    /**
     * get the left margin
     *
     * @return the left margin
     */
    public float getMarginLeft() {
        if (marginLeft == null) {
            return component.getAllStyles().getMarginLeft(component.isRTL());
        } else {
            return marginLeft;
        }
    }

    /**
     * get the right margin
     *
     * @return the right margin
     */
    public float getMarginRight() {
        if (marginRight == null) {
            return component.getAllStyles().getMarginRight(component.isRTL());
        } else {
            return marginRight;
        }
    }

    /**
     * Converts the dips count to pixels, dips are roughly 1mm in length.
     *
     * @param dip the dips that we will convert to pixels
     * @return the value of dip in pixels
     */
    private float convertToPixel(float dip) {
        return CN.convertToPixels(dip);
    }

    /**
     * <p>create MStyle instance and bind it to the component.</p>
     *
     * <p>this helps to style the component fast and easy. by binding the style to the component
     * you can be able to change the following style attribute with only one line:</p>
     *
     * <ul>
     *     <li>foreground :  by calling {@link MStyle#fgColor(int) } or
     *     {@link MStyle#fgColor(String) } method which take color as Integer eg.0xffffff or a String hex color eg. "#ffffff" .</li>
     *      <br/>
     *
     *     <li>background : by calling {@link MStyle#bgColor(int) } or
     *      {@link MStyle#bgColor(String) } method which take color as Integer eg.0xffffff or a String hex color eg. "#ffffff". </li>
     *      <br/>
     *
     *     <li>gradient background :  in horizon by calling {@link MStyle#bgGradientHorizontal(int, int)} or
     *     {@link MStyle#bgGradientHorizontal(String, String)} or vertical by calling {@link MStyle#bgGradientVertical(int, int)} or
     *     {@link MStyle#bgGradientVertical(String, String)}</li>
     *       <br/>
     *
     *     <li>background transparency : by calling {@link MStyle#bgTransparency(int transparency)}
     *     which take an Integer as transparency level for the background. <b>!important </b> the value should be between 0-255.</li>
     *      <br/>
     *
     *     <li>alignment: by calling one of the following method
     *           <ul>
     *             <li>{@link MStyle#alignCenter()}</li>
     *             <li> {@link MStyle#alignLeft()}</li>
     *             <li>{@link MStyle#alignRight()}</li>
     *         </ul>
     *    </li>
     *    <br/>
     *
     *     <li>margin : by calling {@link MStyle#marginTop(float)},{@link MStyle#marginBottom(float)},{@link MStyle#marginLeft(float)}
     *     ,{@link MStyle#marginRight(float)} or by calling {@link MStyle#margin(float, float)} which take two parameters
     *     the first for (top and bottom) and the second for (left and right) . or by calling {@link MStyle#margin(float)} to set
     *     the margin for top,bottom,right,left at the same time </li>
     *      <br/>
     *
     *     <li>padding : by calling {@link MStyle#paddingTop(float)},{@link MStyle#paddingBottom(float)},{@link MStyle#paddingLeft(float)}
     *     ,{@link MStyle#paddingRight(float)} or by calling {@link MStyle#padding(float, float)} which take two parameters
     *     the first for (top and bottom) and the second for (left and right). or by calling {@link MStyle#padding(float)} to set
     *     the padding for top,bottom,right,left at the same time</li>
     *      <br/>
     *
     *     <li>opacity : set the opacity level for the component by calling {@link MStyle#opacity(int)}</li>
     *      <br/>
     *
     *     <li>font style :  change font style by calling
     *          <ul>
     *              <li>{@link MStyle#fontBold()}</li>
     *              <li>{@link MStyle#fontPlain()}</li>
     *              <li>{@link MStyle#fontItalic()}</li>
     *          </ul>
     *     </li>
     *      <br/>
     *
     *     <li>round border : create simple round border for the component by calling {@link MStyle#roundBorder()}
     *     or set specific stroke width and color to the border by calling {@link MStyle#roundBorder(int, int)}</li>
     *      <br/>
     *
     *     <li>round rect border : create simple round rect border for the component by calling {@link MStyle#roundRectBorder()}
     *          or set specific stroke width and color , corner radius and show shadow to the border by calling
     *          {@link MStyle#roundRectBorder(int, int, float, boolean)}}</li>
     *
     * </ul>
     *
     * @param component the component to which the MStyle instance will be bind
     * @return new MStyle instance for the given component
     */
    public static MStyle forComponent(Component component) {
        return new MStyle(component);
    }
}
