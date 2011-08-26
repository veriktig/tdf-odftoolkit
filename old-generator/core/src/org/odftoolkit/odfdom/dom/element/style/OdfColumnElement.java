/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;


/**
 * ODF DOM Element implementation for element "<style:column>".
 */
public abstract class OdfColumnElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "column" );

    public OdfColumnElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aRelWidth)
    {
        setRelWidth( _aRelWidth );
    }

    /**
     * Get value of attribute "style:rel-width".
     */
    public String getRelWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rel-width" ) );
    }

    /**
     * Set value of attribute "style:rel-width".
     */
    public void setRelWidth( String _aRelWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "rel-width" ), _aRelWidth );
    }

    /**
     * Get value of attribute "fo:start-indent".
     */
    public String getStartIndent()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FO, "start-indent" ) );
    }

    /**
     * Set value of attribute "fo:start-indent".
     */
    public void setStartIndent( String _aStartIndent )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FO, "start-indent" ), _aStartIndent );
    }

    /**
     * Get value of attribute "fo:end-indent".
     */
    public String getEndIndent()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FO, "end-indent" ) );
    }

    /**
     * Set value of attribute "fo:end-indent".
     */
    public void setEndIndent( String _aEndIndent )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FO, "end-indent" ), _aEndIndent );
    }

    /**
     * Get value of attribute "fo:space-before".
     */
    public String getSpaceBefore()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FO, "space-before" ) );
    }

    /**
     * Set value of attribute "fo:space-before".
     */
    public void setSpaceBefore( String _aSpaceBefore )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FO, "space-before" ), _aSpaceBefore );
    }

    /**
     * Get value of attribute "fo:space-after".
     */
    public String getSpaceAfter()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FO, "space-after" ) );
    }

    /**
     * Set value of attribute "fo:space-after".
     */
    public void setSpaceAfter( String _aSpaceAfter )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FO, "space-after" ), _aSpaceAfter );
    }

}