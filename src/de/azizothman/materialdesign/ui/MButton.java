package de.azizothman.materialdesign.ui;

import com.codename1.ui.Button;
import com.codename1.ui.FontImage;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;


public class MButton extends Button implements MaterialComponent {

    /**
     * The style helper
     */
    private final MStyle style;


    /**
     * Constructs a button with an empty string for its text.
     */
    public MButton() {
        this("");
    }

    /**
     * Constructs a button with the specified material image icon.
     *
     * @param icon appearing on the button
     */
    public MButton(char icon) {
        this(" ");
        setMaterialIcon(icon);
    }

    /**
     * Constructs a button with the specified material image icon.
     *
     * @param icon     appearing on the button
     * @param iconSize the size of the icon in millimeters
     */
    public MButton(char icon, int iconSize) {
        this("");
        setMaterialIcon(icon, iconSize);
    }

    /**
     * Constructs a button with the specified text.
     *
     * @param text label appearing on the button
     */
    public MButton(String text) {
        super(text);
        style = new MStyle(this);
        initMaterialComponent();
    }

    /**
     * This Method used to initialize the material design of the component
     */
    @Override
    public void initMaterialComponent() {
        //============== apply Style of the Button =================
        style.alignCenter()
                .bgColor(MaterialColor.PRIMARY)
                .fgColor(MaterialColor.WHITE)
                .padding(2).margin(2);
    }

    /**
     * Adds a listener to the button
     *
     * @param listener the action listener
     * @return this for chaining calls Eg.<br/>
     * <code>form.add(new MButton("text")<br/>.action(l->print("Clicked!"));</code>
     */
    public MButton action(ActionListener<ActionEvent> listener) {
        addActionListener(listener);
        return this;
    }


    /**
     * The Style helper of the Button
     *
     * @return style helper instance
     */
    @Override
    public MStyle style() {
        return style;
    }

    /**
     * This method is shorthand for {@link FontImage#setMaterialIcon(Label, char)}
     *
     * @param icon one of the constants from {@link FontImage}
     */
    @Override
    public void setMaterialIcon(char icon) {
        setMaterialIcon(icon, -1);
    }

    /**
     * This method is shorthand for {@link FontImage#setMaterialIcon(Label l, char icon, float size)}
     *
     * @param icon one of the constants from {@link FontImage}
     * @param size the size of the icon in millimeters
     */
    @Override
    public void setMaterialIcon(char icon, float size) {
        FontImage.setMaterialIcon(this, icon, size);
    }

    /**
     * Create instance of MButton with info background
     *
     * @param text the text of the Button
     * @return instance of MButton with error background.Eg.<br/>
     * <code>form.add(MButton.info("error").action(l-> MToast.showError("Error")));</code>
     */
    public static MButton info(String text) {
        return createInstanceWithBg(text, MaterialColor.INFO);
    }

    /**
     * Create instance of MButton with error background
     *
     * @param text the text of the Button
     * @return instance of MButton with error background.Eg.<br/>
     * <code>form.add(MButton.error("error").action(l-> MToast.showError("Error")));</code>
     */
    public static MButton error(String text) {
        return createInstanceWithBg(text, MaterialColor.ERROR);
    }

    /**
     * Create instance of MButton with error background
     *
     * @param text the text of the Button
     * @return instance of MButton with error backgroundEg.<br/>
     * <code>form.add(MButton.success("success").action(l-> MToast.showSuccess("Success")));</code>
     */
    public static MButton success(String text) {
        return createInstanceWithBg(text, MaterialColor.SUCCESS);
    }


    /**
     * Create instance of MButton with warning background
     *
     * @param text the text of the Button
     * @return instance of MButton with warning background.Eg.<br/>
     * <code>form.add(MButton.warning("warning").action(l-> MToast.showWarning("Warning")));</code>
     */
    public static MButton warning(String text) {
        return createInstanceWithBg(text, MaterialColor.WARNING);
    }

    /**
     * Create instance of MButton with no background (transparency = 0)
     *
     * @param text      the text of the Button
     * @param color     the color of the text
     * @param underLine if true make the text of the button underline
     * @return instance of MButton with no background.Eg.<br/>
     * <code>form.add(MButton.textOnly("text only",MaterialColor.ERROR,false).action(l-> System.out.println("textOnly")));</code>
     */
    public static MButton textOnly(String text, int color, boolean underLine) {
        MButton button = new MButton(text);
        button.style().fgColor(color);
        button.style().bgTransparency(0);
        if (underLine) {
            button.style().underlineText();
        }
        return button;
    }

    /**
     * Create instance of MButton with no background (transparency = 0) and rounded border
     *
     * @param text  the text of the Button
     * @param color the color of the text
     * @return instance of MButton with no background.Eg.<br/>
     * <code>form.add(MButton.outline("text only",MaterialColor.ERROR).action(l-> System.out.println("outline")));</code>
     */
    public static MButton outline(String text, int color) {
        MButton button = textOnly(text, color, false);
        button.style.roundRectBorder(2, color, 0.7f, false).bgTransparency(0);
        return button;
    }

    /**
     * This method used as helper to create instance of the MButton with the given Background
     *
     * @param bg   the background color
     * @param text the text of the Button
     * @return instance of MButton with the given background
     */
    private static MButton createInstanceWithBg(String text, int bg) {
        MButton button = new MButton(text);
        button.style.bgColor(bg);
        button.style.fgColor(MaterialColor.WHITE);
        return button;
    }
}
