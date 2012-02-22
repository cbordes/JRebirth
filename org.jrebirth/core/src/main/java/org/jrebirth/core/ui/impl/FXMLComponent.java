package org.jrebirth.core.ui.impl;

import javafx.scene.Node;

/**
 * The class <strong>FXMLComponent</strong>.
 * 
 * @author Sébastien Bordes
 * 
 * @version $Revision$ $Author$
 * @since $Date$
 * 
 * @param <C> A class that extends FXMLController
 */
public class FXMLComponent<C extends AbstractFXMLController> {

    /** The FXML node. */
    private final Node node;

    /** The controller of the FXML component. */
    private final C controller;

    /**
     * Default Constructor.
     * 
     * @param node the loaded fxml node
     * @param controller the attached fxml controller
     */
    public FXMLComponent(final Node node, final C controller) {
        this.node = node;
        this.controller = controller;
    }

    /**
     * @return Returns the node.
     */
    public Node getNode() {
        return this.node;
    }

    /**
     * @return Returns the controller.
     */
    public C getController() {
        return this.controller;
    }

}