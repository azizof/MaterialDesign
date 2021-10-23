package de.azizothman.materialdesign.ui;

public interface MaterialComponent {

    /**
     * This Method used to initialize the material design of the component
     */
    public void initMaterialComponent();


    /**
     * The Style helper of the Component
     *
     * @return style helper instance
     */
    public MStyle style();
}
