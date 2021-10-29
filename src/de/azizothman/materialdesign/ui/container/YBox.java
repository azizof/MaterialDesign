package de.azizothman.materialdesign.ui.container;

import com.codename1.ui.Container;
import com.codename1.ui.layouts.BoxLayout;
import de.azizothman.materialdesign.ui.MStyle;
import de.azizothman.materialdesign.ui.MaterialComponent;

public class YBox extends Container implements MaterialComponent {


    /**
     * the style helper
     */
    private final MStyle style;

    /**
     * Constructs a new Container, with a {@link BoxLayout} in Y direction.
     */
    public YBox() {
        super(BoxLayout.y());
        style = MStyle.to(this);
    }

    /**
     * make this container be able to scroll on the Y axis
     *
     * @return this component for chaining calls
     */
    public YBox scrollableY() {
        setScrollableY(true);
        return this;
    }

    /**
     * set the alignment of this YBox to center
     *
     * @return this component for chaining calls
     */
    public YBox positionCenter() {
        setLayout(BoxLayout.yCenter());
        return this;
    }

    /**
     * set the alignment of this container to bottom
     *
     * @return this component for chaining calls
     */
    public YBox positionBottom() {
        setLayout(BoxLayout.yBottom());
        return this;
    }


    /**
     * hide the scroll bar while scrolling the container
     *
     * @return this component for chaining calls
     */
    public YBox hideScrollBar() {
        setScrollVisible(false);
        return this;
    }

    /**
     * This Method used to initialize the material design of the component
     */
    @Override
    public void initMaterialComponent() {

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
