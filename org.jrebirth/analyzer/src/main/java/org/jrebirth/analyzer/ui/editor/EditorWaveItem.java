package org.jrebirth.analyzer.ui.editor;

import org.jrebirth.core.link.WaveItem;

/**
 * The class <strong>EditorWaveItem</strong>.
 * 
 * @author Sébastien Bordes
 * 
 * @version $Revision$ $Author$
 * @since $Date$
 */
public enum EditorWaveItem implements WaveItem {

    /** The name of the events. */
    EVENTS() {

        @Override
        public Class<?> dataClass() {
            return null;
        }

    },

    /** An event unserialized. */
    EVENT() {

        @Override
        public Class<?> dataClass() {
            return null;
        }

    };

}
