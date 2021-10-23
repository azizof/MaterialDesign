package de.azizothman.materialdesign.ui.container;

import com.codename1.ui.Container;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.Layout;
import de.azizothman.materialdesign.ui.MStyle;
import de.azizothman.materialdesign.ui.MaterialColor;
import de.azizothman.materialdesign.ui.MaterialComponent;

public class Card extends Container implements MaterialComponent {

    /**
     * the style helper
     */
    private final MStyle style;


    /**
     * Constructs a new Container, with a {@link BoxLayout} in Y direction.
     */
    public Card() {
        this(BoxLayout.yCenter());
    }

    /**
     * Constructs a new Container with a new layout manager.
     *
     * @param layout the specified layout manager
     */
    public Card(Layout layout) {
        super(layout);
        style = new MStyle(this);
        initMaterialComponent();
    }

    /**
     * This Method used to initialize the material design of the component
     */
    @Override
    public void initMaterialComponent() {
        style.roundRectBorder(0, 0x0, 1, true)
                .bgColor(MaterialColor.WHITE).padding(1).margin(0.2f, 1);
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
}
