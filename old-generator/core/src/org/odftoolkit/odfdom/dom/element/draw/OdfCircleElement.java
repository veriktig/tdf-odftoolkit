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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.type.draw.OdfKindType;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.OdfId;


/**
 * ODF DOM Element implementation for element "<draw:circle>".
 */
public abstract class OdfCircleElement extends OdfShapeElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "circle" );

    public OdfCircleElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "svg:r".
     */
    public String getR()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "r" ) );
    }

    /**
     * Set value of attribute "svg:r".
     */
    public void setR( String _aR )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "r" ), _aR );
    }

    /**
     * Get value of attribute "svg:cx".
     */
    public String getCx()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "cx" ) );
    }

    /**
     * Set value of attribute "svg:cx".
     */
    public void setCx( String _aCx )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "cx" ), _aCx );
    }

    /**
     * Get value of attribute "svg:cy".
     */
    public String getCy()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "cy" ) );
    }

    /**
     * Set value of attribute "svg:cy".
     */
    public void setCy( String _aCy )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "cy" ), _aCy );
    }

    /**
     * Get value of attribute "draw:kind".
     */
    public OdfKindType getKind()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "kind" ) );
        return OdfKindType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:kind".
     */
    public void setKind( OdfKindType _aKind )
    {                    
        String aStringVal = OdfKindType.toString( _aKind );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "kind" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:start-angle".
     */
    public String getStartAngle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-angle" ) );
    }

    /**
     * Set value of attribute "draw:start-angle".
     */
    public void setStartAngle( String _aStartAngle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-angle" ), _aStartAngle );
    }

    /**
     * Get value of attribute "draw:end-angle".
     */
    public String getEndAngle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-angle" ) );
    }

    /**
     * Set value of attribute "draw:end-angle".
     */
    public void setEndAngle( String _aEndAngle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-angle" ), _aEndAngle );
    }

    /**
     * Get value of attribute "svg:x".
     */
    public String getX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ) );
    }

    /**
     * Set value of attribute "svg:x".
     */
    public void setX( String _aX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ), _aX );
    }

    /**
     * Get value of attribute "svg:y".
     */
    public String getY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ) );
    }

    /**
     * Set value of attribute "svg:y".
     */
    public void setY( String _aY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ), _aY );
    }

    /**
     * Get value of attribute "svg:width".
     */
    public String getWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ) );
    }

    /**
     * Set value of attribute "svg:width".
     */
    public void setWidth( String _aWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "width" ), _aWidth );
    }

    /**
     * Get value of attribute "svg:height".
     */
    public String getHeight()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ) );
    }

    /**
     * Set value of attribute "svg:height".
     */
    public void setHeight( String _aHeight )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "height" ), _aHeight );
    }

    /**
     * Get value of attribute "draw:layer".
     */
    public String getLayer()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ) );
    }

    /**
     * Set value of attribute "draw:layer".
     */
    public void setLayer( String _aLayer )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "layer" ), _aLayer );
    }

    /**
     * Get value of attribute "draw:transform".
     */
    public String getTransform()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ) );
    }

    /**
     * Set value of attribute "draw:transform".
     */
    public void setTransform( String _aTransform )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "transform" ), _aTransform );
    }

    /**
     * Get value of attribute "draw:text-style-name".
     */
    public String getTextStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:text-style-name".
     */
    public void setTextStyleName( String _aTextStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aTextStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "text-style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:caption-id".
     */
    public String getCaptionId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:caption-id".
     */
    public void setCaptionId( String _aCaptionId )
    {                    
        String aStringVal = OdfId.toString( _aCaptionId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "caption-id" ), aStringVal );
    }

}