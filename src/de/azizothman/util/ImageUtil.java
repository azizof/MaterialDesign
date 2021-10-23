package de.azizothman.util;

import com.codename1.ui.Graphics;
import com.codename1.ui.Image;

public class ImageUtil {

    /**
     * Convert the given image to round.
     *
     * @param image the image will be converted to round
     * @return rounded image
     */
    public static Image roundImage(Image image) {
        int width = image.getWidth();
        if (image.getHeight() != width) {
            if (image.getWidth() < image.getHeight()) {
                image = image.subImage(0, image.getHeight() / 2 - width / 2, width, width, false);
            } else {
                Image n = Image.createImage(width, width);
                n.getGraphics().drawImage(image, 0, width / 2 - image.getHeight() / 2);
                image = n;
            }
        }
        Image roundMask = Image.createImage(width, width, 0xff000000);
        Graphics gr = roundMask.getGraphics();
        gr.setColor(0xffffff);
        gr.fillArc(0, 0, width, width, 0, 360);
        Object mask = roundMask.createMask();
        return image.applyMask(mask);
    }
}
