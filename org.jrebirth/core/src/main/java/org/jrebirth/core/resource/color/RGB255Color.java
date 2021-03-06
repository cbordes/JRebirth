package org.jrebirth.core.resource.color;

/**
 * The interface <strong>RGB255Color</strong>.
 * 
 * @author Sébastien Bordes
 * 
 */
public final class RGB255Color extends AbstractBaseColor {

    /** The green value 0-255. */
    private final int red;

    /** The green value 0-255. */
    private final int green;

    /** The blue value 0-255. */
    private final int blue;

    /**
     * Default Constructor.
     * 
     * @param red
     * @param green
     * @param blue
     */
    public RGB255Color(final int red, final int green, final int blue) {
        super();
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Default Constructor.
     * 
     * @param red
     * @param green
     * @param blue
     */
    public RGB255Color(final int red, final int green, final int blue, final double opacity) {
        super(opacity);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * @return Returns the red.
     */
    public int red() {
        return this.red;
    }

    /**
     * @return Returns the green.
     */
    public int green() {
        return this.green;
    }

    /**
     * @return Returns the blue.
     */
    public int blue() {
        return this.blue;
    }

}
