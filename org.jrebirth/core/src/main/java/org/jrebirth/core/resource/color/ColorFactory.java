package org.jrebirth.core.resource.color;

import javafx.scene.paint.Color;

import org.jrebirth.core.resource.factory.AbstractResourceFactory;

/**
 * The class <strong>FontManager</strong>.
 * 
 * Class used to manage font with weak reference.
 * 
 * @author Sébastien Bordes
 * 
 * @version $Revision$ $Author$
 * @since $Date$
 */
public final class ColorFactory extends AbstractResourceFactory<ColorEnum, ColorParams, Color> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected Color buildResource(final ColorParams cp) {
        Color color = null;

        if (cp instanceof WebColor) {
            color = buildWebColor((WebColor) cp);
        } else if (cp instanceof RGB01Color) {
            color = buildRGB01Color((RGB01Color) cp);
        } else if (cp instanceof RGB255Color) {
            color = buildRGB255Color((RGB255Color) cp);
        } else if (cp instanceof HSBColor) {
            color = buildHSBColor((HSBColor) cp);
        } else if (cp instanceof GrayColor) {
            color = buildGrayColor((GrayColor) cp);
        }
        return color;
    }

    /**
     * Build a Web (hexa).
     * 
     * @param wColor the web color enum
     * 
     * @return the javafx color
     */
    private Color buildWebColor(final WebColor wColor) {
        Color color = null;
        if (wColor.opacity() == null) {
            color = Color.web(wColor.hex());
        } else {
            color = Color.web(wColor.hex(), wColor.opacity());
        }
        return color;
    }

    /**
     * Build a RGB color (0.0-1.0).
     * 
     * @param rColor the rgb color enum
     * 
     * @return the javafx color
     */
    private Color buildRGB01Color(final RGB01Color rColor) {
        Color color = null;
        if (rColor.opacity() == null) {
            color = Color.color(rColor.red(), rColor.green(), rColor.blue());
        } else {
            color = Color.color(rColor.red(), rColor.green(), rColor.blue(), rColor.opacity());
        }
        return color;
    }

    /**
     * Build a RGB color (255).
     * 
     * @param rColor the rgb color enum
     * 
     * @return the javafx color
     */
    private Color buildRGB255Color(final RGB255Color rColor) {
        Color color = null;
        if (rColor.opacity() == null) {
            color = Color.rgb(rColor.red(), rColor.green(), rColor.blue());
        } else {
            color = Color.rgb(rColor.red(), rColor.green(), rColor.blue(), rColor.opacity());
        }
        return color;
    }

    /**
     * Build an HSB color.
     * 
     * @param hsbColor the hsb color enum
     * 
     * @return the javafx color
     */
    private Color buildHSBColor(final HSBColor hsbColor) {
        Color color = null;
        if (hsbColor.opacity() == null) {
            color = Color.hsb(hsbColor.hue(), hsbColor.saturation(), hsbColor.brightness());
        } else {
            color = Color.hsb(hsbColor.hue(), hsbColor.saturation(), hsbColor.brightness(), hsbColor.opacity());
        }
        return color;
    }

    /**
     * Build a Gray color.
     * 
     * @param gColor the gray color enum
     * 
     * @return the javafx color
     */
    private Color buildGrayColor(final GrayColor gColor) {
        Color color = null;
        if (gColor.opacity() == null) {
            color = Color.gray(gColor.gray());
        } else {
            color = Color.gray(gColor.gray(), gColor.opacity());
        }
        return color;
    }
}
