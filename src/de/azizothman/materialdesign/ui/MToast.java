package de.azizothman.materialdesign.ui;

import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.UITimer;

import static de.azizothman.materialdesign.ui.MaterialColor.*;


public class MToast extends Label implements MaterialComponent {


    /**
     * The style helper
     */
    private final MStyle style;

    /**
     * how long to display the toast in millisecond
     */
    private final int timeout;

    /**
     * constructor create toast from given text and hide after timeout in millisecond
     *
     * @param text    the text of the toast
     * @param timeout how long to display the toast in millisecond
     */
    public MToast(String text, int timeout) {
        this(text, null, timeout, false);
    }

    /**
     * constructor create toast from given text and icon. hide after timeout in millisecond
     *
     * @param text    the text of the toast
     * @param icon    the icon of the toast
     * @param timeout how long to display the toast in millisecond
     * @param rtl     set right to left
     */
    public MToast(String text, Image icon, int timeout, boolean rtl) {
        super(text);
        if (icon != null) {
            setIcon(icon);
        }
        this.setRTL(rtl);
        this.timeout = timeout;
        style = new MStyle(this);
        initMaterialComponent();
    }


    /**
     * This Method used to initialize the material design of the component
     */
    @Override
    public void initMaterialComponent() {
        //============== apply Style of the toast =================
        style.bgColor(BLACK).fgColor(WHITE).padding(2).margin(4,2).alignLeft().roundRectBorder()
            .bgTransparency(220);
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
     * Show the toast
     */
    public void show() {
        //================ Get the current fom =======================
        Form form = CN.getCurrentForm();
        if (form instanceof Dialog) {
            ((Dialog) form).dispose();
            form = CN.getCurrentForm();
        }
        //====== the layered Container =========================
        Container layeredPane = form.getLayeredPane();
        layeredPane.setLayout(new BorderLayout());
        Container toastContainer = new Container(BoxLayout.yBottom());
        this.setVisible(false);
        toastContainer.add(this);
        layeredPane.add(BorderLayout.CENTER, toastContainer);
        layeredPane.revalidate();
        UITimer.timer(100, false, () -> {
            this.setVisible(true);
            toastContainer.animateLayoutFade(500, 0);
        });

        UITimer.timer(timeout, false, () -> {
            this.setVisible(false);
            toastContainer.revalidate();
        });
    }

    /**
     * Show normal toast with the given text in white and black background
     *
     * @param text the text of the toast
     */
    public static void showToast(String text) {
        MToast toast = new MToast(text, null, 3000, false);
        toast.show();
    }

    /**
     * Show info toast with the given text
     *
     * @param text the text of the toast
     */
    public static void showInfo(String text) {
        MToast toast = new MToast(text, MaterialIcons.INFO, 3000, false);
        toast.style.bgColor(INFO);
        toast.show();
    }

    /**
     * Show warning toast with the given text
     *
     * @param text the text of the toast
     */
    public static void showWarning(String text) {
        MToast toast = new MToast(text, MaterialIcons.WARNING, 3000, false);
        toast.style.bgColor(WARNING);
        toast.show();
    }

    /**
     * Show success toast with the given text
     *
     * @param text the text of the toast
     */
    public static void showSuccess(String text) {
        MToast toast = new MToast(text, MaterialIcons.SUCCESS, 3000, false);
        toast.style.bgColor(SUCCESS);
        toast.show();
    }

    /**
     * Show success toast with the given text
     *
     * @param text the text of the toast
     */
    public static void showError(String text) {
        MToast toast = new MToast(text, MaterialIcons.ERROR, 3000, false);
        toast.style.bgColor(ERROR);
        toast.show();
    }
}
