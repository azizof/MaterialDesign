package de.azizothman.materialdesign.ui;

import com.codename1.components.SpanLabel;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.FlowLayout;

public class MDialog extends Dialog implements MaterialComponent {

    /**
     * the style helper
     */
    private final MStyle style;

    /**
     * the style helper for title
     */
    private MStyle titleStyle;

    /**
     * the style helper
     */
    private MStyle bodyStyle;

    /**
     * set all components to be rtl
     */
    private boolean rtl;

    /**
     * the title of the dialog
     */
    private Label title;

    /**
     * the body of the dialog
     */
    private SpanLabel body;

    /**
     * the confirm button
     */
    private MButton confirmButton;

    /**
     * the cancel button
     */
    private MButton cancelButton;

    /**
     * Default constructor with no title
     */
    public MDialog() {
        super(new BorderLayout());
        rtl = false;
        style = new MStyle(this.getContentPane());
        style.bgColor(MaterialColor.WHITE).fgColor(MaterialColor.BLACK).padding(1).roundRectBorder();

    }

    /**
     * set the title of the dialog
     *
     * @param title the title of the dialog
     * @return this confirmDialog for chaining calls
     */
    public MDialog title(String title) {
        this.title = new Label(title);
        titleStyle = new MStyle(this.title).padding(1).margin(1).fontBold();
        return this;
    }

    /**
     * set the body of the dialog
     *
     * @param body the body of the dialog
     * @return this confirmDialog for chaining calls
     */
    public MDialog body(String body) {
        this.body = new SpanLabel(body);
        bodyStyle = new MStyle(this.body.getTextComponent()).padding(1).margin(1);
        return this;
    }

    /**
     * set the body of the dialog and its icon
     *
     * @param body the body of the dialog
     * @param icon the material icon of the body from {@link FontImage}
     * @return this confirmDialog for chaining calls
     */
    public MDialog body(String body, char icon) {
        this.body = new SpanLabel(body);
        this.body.setMaterialIcon(icon);
        bodyStyle = new MStyle(this.body.getTextComponent()).padding(1).margin(1);
        return this;
    }

    /**
     * set the text of confirm Button of the dialog
     *
     * @param confirm the text of the confirm button
     * @return this confirmDialog for chaining calls
     */
    public MDialog confirmButton(String confirm) {
        return confirmButton(confirm, null);
    }

    /**
     * set the text and material icon  of confirm Button of the dialog
     *
     * @param confirm the text of the confirm button
     * @param icon    the material icon of the confirm button from {@link FontImage}
     * @return this confirmDialog for chaining calls
     */
    public MDialog confirmButton(String confirm, char icon) {
        this.confirmButton = new MButton(confirm);
        this.confirmButton.setMaterialIcon(icon);
        confirmButton.style().roundRectBorder();
        this.confirmButton.action((actionEvent) -> {
            this.dispose();
        });
        return this;
    }

    /**
     * set the text and icon of confirm Button of the dialog
     *
     * @param confirm the text of the confirm button
     * @param icon    the icon of the confirm button
     * @return this confirmDialog for chaining calls
     */
    public MDialog confirmButton(String confirm, Image icon) {
        this.confirmButton = new MButton(confirm);
        confirmButton.style().roundRectBorder();
        if (icon != null) {
            this.confirmButton.setIcon(icon);
        }
        this.confirmButton.action((actionEvent) -> {
            this.dispose();

        });
        return this;
    }


    /**
     * set the text of cancel Button of the dialog
     *
     * @param cancel the text of the cancel button
     * @return this confirmDialog for chaining calls
     */
    public MDialog cancelButton(String cancel) {
        return cancelButton(cancel, null);
    }

    /**
     * set the text and material icon of cancel Button of the dialog
     *
     * @param cancel the text of the cancel button
     * @param icon   the material icon of the cancel button from {@link FontImage}
     * @return this confirmDialog for chaining calls
     */
    public MDialog cancelButton(String cancel, char icon) {
        this.cancelButton = new MButton(cancel);
        cancelButton.style().roundRectBorder().bgTransparency(0).fgColor(MaterialColor.PRIMARY).marginTop(2);
        this.cancelButton.setMaterialIcon(icon);
        this.cancelButton.action((actionEvent) -> {
            this.dispose();

        });
        return this;
    }

    /**
     * set the text and icon of cancel Button of the dialog
     *
     * @param cancel the text of the cancel button
     * @param icon   the icon of the cancel button
     * @return this confirmDialog for chaining calls
     */
    public MDialog cancelButton(String cancel, Image icon) {
        this.cancelButton = new MButton(cancel);
        cancelButton.style().roundRectBorder().bgTransparency(0).fgColor(MaterialColor.PRIMARY).marginTop(2);

        if (icon != null) {
            this.cancelButton.setIcon(icon);
        }
        this.cancelButton.action((actionEvent) -> {
            this.dispose();

        });
        return this;
    }

    /**
     * Adds a listener to the confirm button
     *
     * @param listener the action listener
     * @return this confirmDialog for chaining calls
     */
    public MDialog onConfirm(ActionListener<ActionEvent> listener) {
        if (this.confirmButton != null) {
            this.confirmButton.addActionListener(listener);
        }
        return this;
    }

    /**
     * Adds a listener to the cancel button
     *
     * @param listener the action listener
     * @return this confirmDialog for chaining calls
     */
    public MDialog onCancel(ActionListener<ActionEvent> listener) {
        if (this.cancelButton != null) {
            this.cancelButton.addActionListener(listener);
        }
        return this;
    }

    /**
     * set the color of the confirm button. if confirm button not defined this method
     * will not run
     *
     * @param textColor color of the text
     * @param bgColor   background color
     * @return this confirmDialog for chaining calls
     */
    public MDialog confirmButtonColors(int textColor, int bgColor) {
        if (confirmButton != null) {
            confirmButton.style().bgColor(bgColor).fgColor(textColor);
        }
        return this;
    }

    /**
     * set the color of the cancel button. if cancel button not defined this method
     * will not run
     *
     * @param textColor color of the text
     * @return this confirmDialog for chaining calls
     */
    public MDialog cancelButtonColors(int textColor) {
        if (cancelButton != null) {
            cancelButton.style().fgColor(textColor);
        }
        return this;
    }

    /**
     * dispose the dialog if user clicked outside the dialog
     *
     * @return this MDialog for chaining calls
     */
    public MDialog closeOnOutsideClick() {
        this.setDisposeWhenPointerOutOfBounds(true);
        return this;
    }


    /**
     * set the dialog to be RTL
     *
     * @return this confirmDialog for chaining calls
     */
    public MDialog RTL() {
        this.rtl = true;
        return this;
    }

    /**
     * This Method used to initialize the material design of the component
     */
    @Override
    public void initMaterialComponent() {
        //============== set all rtl =========================
        toRTL(title);
        toRTL(body);
        toRTL(confirmButton);
        toRTL(cancelButton);

        // ============ add Component to the dialog =========
        if (title != null) {
            MButton close = new MButton().action(l -> dispose());
            close.style().bgTransparency(0).fgColor(style.getFgColor());
            close.setMaterialIcon(FontImage.MATERIAL_CLOSE);
            Container titleContainer = new Container(new BorderLayout());
            titleStyle.fgColor(style.getFgColor());
            if (rtl) {
                titleContainer.add(BorderLayout.WEST, close);
                titleContainer.add(BorderLayout.EAST, title);

            } else {
                titleContainer.add(BorderLayout.EAST, close);
                titleContainer.add(BorderLayout.WEST, title);

            }
            add(BorderLayout.NORTH, titleContainer);
        }
        if (body != null) {
            bodyStyle.fgColor(style.getFgColor());
            add(BorderLayout.CENTER, body);
        }

        FlowLayout buttonsLayout = new FlowLayout();
        if (!rtl) {
            buttonsLayout.setAlign(RIGHT);
        }
        Container buttonsContainer = new Container(buttonsLayout);
        if (!rtl) {
            if (cancelButton != null) {
                buttonsContainer.add(cancelButton);
            }
            if (confirmButton != null) {
                buttonsContainer.add(confirmButton);
            }
        } else {
            if (confirmButton != null) {
                buttonsContainer.add(confirmButton);
            }
            if (cancelButton != null) {
                buttonsContainer.add(cancelButton);
            }
        }

        new MStyle(buttonsContainer).marginTop(2);
        add(BorderLayout.SOUTH, buttonsContainer);
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
     * set the component rtl
     *
     * @param c the component
     */
    private void toRTL(Component c) {
        if (c != null && rtl) {
            if (c instanceof SpanLabel) {
                ((SpanLabel) c).setIconPosition(BorderLayout.EAST);
                ((SpanLabel) c).getTextAllStyles().setAlignment(RIGHT);
                return;
            }
            c.setRTL(true);
        }
    }


    /**
     * show the dialog
     */
    public void show() {
        initMaterialComponent();
        super.show();
    }

    /**
     * Create Confirm Dialog with the {@code MaterialColor.PRIMARY} color
     *
     * @return new MDialog instance with
     */
    public static MDialog createConfirm(String title, String body, String confirmButton, String cancelButton) {
        MDialog dialog = new MDialog();
        if (title != null) {
            dialog.title(title);
        }
        if (body != null) {
            dialog.body(body);
        }
        if (confirmButton != null) {
            dialog.confirmButton(confirmButton);
        }
        if (cancelButton != null) {
            dialog.cancelButton(cancelButton);
        }
        return dialog;
    }

    /**
     * Create danger Dialog with the {@code MaterialColor.ERROR} color for the buttons as default
     *
     * @return new MDialog instances
     */
    public static MDialog createDanger(String title, String body, String confirmButton, String cancelButton) {
        MDialog dialog = createConfirm(title, body, confirmButton, cancelButton);
        dialog.confirmButtonColors(MaterialColor.WHITE, MaterialColor.ERROR);
        dialog.cancelButtonColors(MaterialColor.ERROR);
        return dialog;
    }
}
