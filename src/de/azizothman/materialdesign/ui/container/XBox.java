package de.azizothman.materialdesign.ui.container;

import com.codename1.ui.Container;
import com.codename1.ui.layouts.BoxLayout;
import de.azizothman.materialdesign.ui.MStyle;
import de.azizothman.materialdesign.ui.MaterialComponent;

public class XBox extends Container implements MaterialComponent {

    /**
     * the style helper
     */
    private final MStyle style;


    /**
     * Constructs a new Container, with a {@link BoxLayout} in X direction.
     */
    public XBox() {
        super(BoxLayout.x());
        style = new MStyle(this);
    }

    /**
     * make this container be able to scroll on the X axis
     *
     * @return this component for chaining calls
     */
    public XBox scrollableX() {
        setScrollableX(true);
        return this;
    }

    /**
     * set the alignment of this XBox to center
     *
     * @return this component for chaining calls
     */
    public XBox positionCenter() {
        setLayout(BoxLayout.xCenter());
        return this;
    }

    /**
     * set the alignment of this XBox to right
     *
     * @return this component for chaining calls
     */
    public XBox positionRight() {
        setLayout(BoxLayout.xRight());
        return this;
    }


    /**
     * hide the scroll bar while scrolling the container
     *
     * @return this component for chaining calls
     */
    public XBox hideScrollBar() {
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
