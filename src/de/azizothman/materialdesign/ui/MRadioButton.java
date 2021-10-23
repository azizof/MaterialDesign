package de.azizothman.materialdesign.ui;

import com.codename1.ui.CN;
import com.codename1.ui.FontImage;
import com.codename1.ui.Image;
import com.codename1.ui.RadioButton;
import com.codename1.ui.plaf.DefaultLookAndFeel;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;

public class MRadioButton extends RadioButton implements MaterialComponent {

    static {
        if (CN.getPlatformName().equals("ios")) {
            setRadioButtonCheckIcon(MaterialIcons.createFontImageIcon(FontImage.MATERIAL_DONE, MaterialColor.PRIMARY),
                    Image.createImage(1, 1));
        } else {
            setRadioButtonSelectColor(MaterialColor.PRIMARY);
        }
    }

    private MStyle style;


    /**
     * Creates an empty radio button
     */
    public MRadioButton() {
        this("");
    }

    /**
     * Constructs a radio with the given text
     *
     * @param text to display next to the button
     */
    public MRadioButton(String text) {
        this(text, null);
    }


    /**
     * Constructs a radio with the given icon
     *
     * @param icon icon to show next to the button
     */
    public MRadioButton(Image icon) {
        this("", icon);
    }

    /**
     * Constructs a radio with the given text and icon
     *
     * @param text to display next to the button
     * @param icon icon to show next to the button
     */
    public MRadioButton(String text, Image icon) {
        super(text, icon);
        style = new MStyle(this);
        initMaterialComponent();
    }

    /**
     * This Method used to initialize the material design of the component
     */
    @Override
    public void initMaterialComponent() {
        Style labelStyle = UIManager.getInstance().getComponentStyle("Label");

        style.margin(1).padding(1).fgColor(labelStyle.getFgColor()).bgColor(labelStyle.getBgColor())
                    .bgTransparency(labelStyle.getBgTransparency());

    }

    /**
     * The Style helper of the Component
     *
     * @return style helper instance
     */
    @Override
    public MStyle style() {
        return style;
    }

    /**
     * set the value of the radio button to be selected
     *
     * @return this for chaining calls
     */
    public MRadioButton select() {
        setSelected(true);
        return this;
    }


    /**
     * set the image of all radio buttons box while selected and unselected
     *
     * @param select     the icon of all radio buttons box while selected
     * @param unselected the icon of all radio buttons box while not selected
     */
    public static void setRadioButtonCheckIcon(Image select, Image unselected) {
        ((DefaultLookAndFeel) UIManager.getInstance().getLookAndFeel()).setRadioButtonImages(select, unselected);
        ((DefaultLookAndFeel) UIManager.getInstance().getLookAndFeel()).setRadioButtonFocusImages(select, unselected, select, unselected);
    }

    /**
     * set the color of all radio buttons box while selected
     *
     * @param color the color of all radio buttons box while selected
     */
    public static void setRadioButtonSelectColor(int color) {
        //============= Radio Button Icons =============================
        Image unselect = MaterialIcons.createFontImageIcon(FontImage.MATERIAL_RADIO_BUTTON_UNCHECKED, 0x2a2a2a);
        Image select = MaterialIcons.createFontImageIcon(FontImage.MATERIAL_RADIO_BUTTON_CHECKED, color);
        ((DefaultLookAndFeel) UIManager.getInstance().getLookAndFeel()).setRadioButtonImages(select, unselect);
        ((DefaultLookAndFeel) UIManager.getInstance().getLookAndFeel()).setRadioButtonFocusImages(select, unselect, select, unselect);
    }


}
