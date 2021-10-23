package de.azizothman.materialdesign.ui;


import com.codename1.ui.CN;
import com.codename1.ui.CheckBox;
import com.codename1.ui.FontImage;
import com.codename1.ui.Image;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.plaf.DefaultLookAndFeel;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;


public class MCheckBox extends CheckBox implements MaterialComponent {

    static {
        if (CN.getPlatformName().equals("ios")) {
            setCheckBoxesDesign(MaterialColor.PRIMARY, true);
        } else {
            setCheckBoxesDesign(MaterialColor.PRIMARY, false);
        }
    }

    /**
     * the Style helper
     */
    private MStyle style;

    /**
     * Constructs a CheckBox with an empty string for its text.
     */
    public MCheckBox() {
        this("");
    }

    /**
     * Constructs a checkbox with the given icon
     *
     * @param icon icon to display next to the checkbox
     */
    public MCheckBox(Image icon) {
        this("", icon);
    }

    /**
     * Constructs a checkbox with the given text
     *
     * @param text to display next to the checkbox
     */
    public MCheckBox(String text) {
        this(text, null);
    }

    /**
     * Constructs a CheckBox with the specified text.
     *
     * @param text label appearing on the button
     */
    public MCheckBox(String text, Image icon) {
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
     * set the value of the check box to be selected
     *
     * @return same MCheckBox instance for chaining
     */
    public MCheckBox select() {
        setSelected(true);
        return this;
    }

    /**
     * Adds a listener to be notified when the the check box selected value changes
     *
     * @param l Listener to be notified when selected value changes.
     * @return same MCheckBox instance for chaining calls eg.
     * <pre><code>form.add(new MCheckBox("Hello")<br/>.dataChangeListener(l->System.out.println("selected value changed")))</code></pre>
     */
    public MCheckBox dataChangeListener(ActionListener<ActionEvent> l) {
        addChangeListener(l);
        return this;
    }


    /**
     * set the color of all check boxes box while selected
     *
     * @param color the color of all check boxes box while selected
     */
    public static void setCheckBoxesDesign(int color, boolean round) {
        //============= Check box Icons =============================
        Image unChecked;
        Image checked;
        if (round) {
            unChecked = MaterialIcons.createFontImageIcon(FontImage.MATERIAL_RADIO_BUTTON_UNCHECKED, 0x2a2a2a);
            checked = MaterialIcons.createFontImageIcon(FontImage.MATERIAL_CHECK_CIRCLE, color);
        } else {
            unChecked = MaterialIcons.createFontImageIcon(FontImage.MATERIAL_CHECK_BOX_OUTLINE_BLANK, 0x2a2a2a);
            checked = MaterialIcons.createFontImageIcon(FontImage.MATERIAL_CHECK_BOX, color);
        }
        ((DefaultLookAndFeel) UIManager.getInstance().getLookAndFeel()).setCheckBoxImages(checked, unChecked);
        ((DefaultLookAndFeel) UIManager.getInstance().getLookAndFeel()).setCheckBoxFocusImages(checked, unChecked, checked, unChecked);
    }
}
