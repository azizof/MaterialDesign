package de.azizothman.materialdesign.ui;

import com.codename1.ui.CN;
import com.codename1.ui.Font;
import com.codename1.ui.FontImage;
import com.codename1.ui.Image;
import com.codename1.ui.plaf.Style;

/**
 *
 **************************************************
 **                                              **
 **          Material icons class                **
 **                                              **
 **************************************************
 *
 *  this class uses Line icon font to create brand image and default material font from
 * {@link FontImage} to create material icon.
 *
 *
 */
public class MaterialIcons {

    /**
     * white error icon
     */
    public static final Image ERROR = createWhiteIcon(FontImage.MATERIAL_ERROR);

    /**
     * white warning icon
     */
    public static final Image WARNING = createWhiteIcon(FontImage.MATERIAL_WARNING);

    /**
     * white success icon
     */
    public static final Image SUCCESS = createWhiteIcon(FontImage.MATERIAL_CHECK_CIRCLE);

    /**
     * white info icon
     */
    public static final Image INFO = createWhiteIcon(FontImage.MATERIAL_INFO);

    /**
     * default icon size if size not set or smaller than 0
     */
    private static final float defaultIconSize = 3.5f;

    private static Image createWhiteIcon(char icon) {
        return createFontImageIcon(icon, MaterialColor.WHITE);
    }

    /**
     * Create Image from given material icon
     *
     * @param icon  the material icon char from {@link FontImage}
     * @param color the color of the icon
     * @return the given icon as an image
     */
    public static Image createFontImageIcon(char icon, int color) {
        Style style = new Style();
        style.setFgColor(color);

        style.setBgTransparency(0);
        return FontImage.createMaterial(icon, style);
    }

    /**
     * Create Image from given icon.
     * !important don't use FontImage icons here.
     *
     * @param icon  the material icon char from {@link Brand}
     *              or {@link PayingMethods} or {@link Currency}
     * @param color the color of the icon
     * @return the given icon as an image
     */
    public static Image createIcon(char icon, int color) {
        return createIcon(icon, color, defaultIconSize);
    }

    /**
     * Create Image from given icon.
     * !important don't use FontImage icons here.
     *
     * @param icon  the material icon char from {@link Brand}
     *              or {@link PayingMethods} or {@link Currency}
     * @param color the color of the icon
     * @param size  the size of the icon
     * @return the given icon as an image
     */
    public static Image createIcon(char icon, int color, float size) {
        Style style = new Style();
        style.setFgColor(color);
        style.setBgTransparency(0);
        if (size <= 0) {
            size = defaultIconSize;
        }
        return FontImage.create("" + icon, style, getLineIconFont().derive(CN.convertToPixels(size), Font.STYLE_PLAIN));
    }

    /**
     * the line icons font that can be used to create font image instances.
     *
     * @return the font that can be used to create font image instances.
     */
    public static Font getLineIconFont() {
        if (Font.isTrueTypeFileSupported()) {
            return Font.createTrueTypeFont("LineIcons", "LineIcons.ttf")
                    .derive(CN.convertToPixels(3.5f), Font.STYLE_PLAIN);
        } else {
            return Font.getDefaultFont();
        }
    }

    public static class Brand {

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char ADOBE = '\uEA06';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char AIRBNB = '\uEA07';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char AMAZON_ORIGINAL = '\uEA05';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char AMAZON = '\uEA0A';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char ANDROID_ORIGINAL = '\uEA0E';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char ANDROID = '\uEA0F';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char ANGELLIST = '\uEA10';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char ANGULAR = '\uEA15';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char APP_STORE = '\uEA17';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char APPLE_MUSIC = '\uEA18';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char APPLE = '\uEA1A';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char ATLASSIAN = '\uEA28';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char AWS = '\uEA29';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char AZURE = '\uEA2A';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char BEHANCE_ORIGINAL = '\uEA30';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char BEHANCE = '\uEA31';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char BLOGGER = '\uEA36';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char BOOTSTRAP = '\uEA3E';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CHROME = '\uEA65';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CHROMECAST = '\uEA66';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CLOUDFLARE = '\uEA71';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CODEPEN = '\uEA75';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CONNECTDEVELOP = '\uEA7E';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CPANEL = '\uEA84';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CREATIVE_COMMONS = '\uEA85';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char CSS3 = '\uEA8A';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DEV = '\uEA91';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DIGITALOCEAN = '\uEA94';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DINERS_CLUB = '\uEA95';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DISCORD = '\uEA9B';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DISCOVER = '\uEA9C';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DOCKER = '\uEA9F';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DRIBBLE = '\uEAA3';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DROPBOX_ORIGINAL = '\uEAA5';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DROPBOX = '\uEAA6';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DRUPAL_ORIGINAL = '\uEAA7';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char DRUPAL = '\uEAA8';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char EDGE = '\uEAAA';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char ENVATO = '\uEAAD';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FACEBOOK_FILLED = '\uEAB5';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FACEBOOK_MESSENGER = '\uEAB6';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FACEBOOK_ORIGINAL = '\uEAB7';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FACEBOOK_OVAL = '\uEAB8';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FACEBOOK = '\uEAB9';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FIGMA = '\uEABA';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FIREFOX_ORIGINAL = '\uEABC';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FIREFOX = '\uEABD';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char FLICKER = '\uEAC3';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char GIT = '\uEAD0';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char GITHUB_ORIGINAL = '\uEAD1';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char GITHUB = '\uEAD2';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char GOOGLE_DRIVE = '\uEAD4';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char GOOGLE = '\uEAD7';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char HTML5 = '\uEAF0';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char IMDB = '\uEAF2';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char INSTAGRAM_FILLED = '\uEAF8';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char INSTAGRAM_ORIGINAL = '\uEAF9';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char INSTAGRAM = '\uEAFA';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char JAVA = '\uEB00';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char JAVASCRIPT = '\uEB01';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char JCB = '\uEB02';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char JOOMLA_ORIGINAL = '\uEB03';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char JOOMLA = '\uEB04';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char LARAVEL = '\uEB0C';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char LINE = '\uEB17';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char LINEICONS = '\uEB19';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char LINKEDIN_ORIGINAL = '\uEB1B';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char LINKEDIN = '\uEB1C';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char MAGENTO = '\uEB20';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char MAILCHIMP = '\uEB23';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char MARKDOWN = '\uEB26';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char MEDIUM = '\uEB29';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char MICROSOFT_EDGE = '\uEB2E';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char MICROSOFT = '\uEB2F';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char NODEJS = '\uEB3D';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char NODEJS_ALT = '\uEB3C';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char NPM = '\uEB3F';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char OPERA = '\uEB41';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PATRON = '\uEB49';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PAYPAL_ORIGINAL = '\uEB4B';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PAYPAL = '\uEB4C';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PHP = '\uEB51';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PINTEREST = '\uEB55';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PLAY_STORE = '\uEB58';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PLAYSTATION = '\uEB5A';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PRODUCTHUNT = '\uEB67';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char PYTHON = '\uEB6B';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char QUORA = '\uEB6D';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char REACT = '\uEB73';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char REDDIT = '\uEB71';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SHOPIFY = '\uEB91';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SKETCH = '\uEB97';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SKYPE = '\uEB99';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SNAPCHAT = '\uEBA0';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SOUNDCLOUD_ORIGINAL = '\uEBA4';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SOUNDCLOUD = '\uEBA5';
        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SPOTIFY_ORIGINAL = '\uEBAB';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SPOTIFY = '\uEBAC';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char STACKOVERFLOW = '\uEBB0';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char STEAM = '\uEBB8';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char STRIPE = '\uEBBC';
        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char SWIFT = '\uEBC2';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TELEGRAM_ORIGINAL = '\uEBCB';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TELEGRAM = '\uEBCC';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TIKTOK = '\uEBDA';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TRELLO = '\uEBE3';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TUMBLER = '\uEBE6';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TWITCH = '\uEBE7';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TWITTER_ORIGINAL = '\uEBE9';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char TWITTER = '\uEBEA';
        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char UBUNTU = '\uEBEB';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char VIMO = '\uEBF5';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char VK = '\uEBF8';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char WECHAT = '\uEC02';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char WHATSAPP = '\uEC04';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char WINDOWS = '\uEC07';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char WORDPRESS_FILLED = '\uEC08';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char WORDPRESS = '\uEC09';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char XBOX = '\uEC0D';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char YAHOO = '\uEC0E';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char YOUTUBE = '\uEC13';

    }

    public static class PayingMethods {
        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char AMAZON_PAY = '\uEA09';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char AMEX = '\uEA0C';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char APPLE_PAY = '\uEA19';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char GOOGLE_PAY = '\uEAD5';
        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char MASTERCARD = '\uEB28';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char VISA = '\uEBF7';

    }

    public static class Currency {
        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char BITCOIN = '\uEA34';

        /**
         * Line icons see https://lineicons.com/icons/ for full list
         */
        public static final char BTC = '\uEA45';
    }
}
