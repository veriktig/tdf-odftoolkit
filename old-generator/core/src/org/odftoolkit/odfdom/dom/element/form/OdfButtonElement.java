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

package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfId;
import org.odftoolkit.odfdom.dom.type.form.OdfButtonType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfAnyURI;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;
import org.odftoolkit.odfdom.dom.type.office.OdfTargetFrameNameType;
import org.odftoolkit.odfdom.dom.type.form.OdfImagePositionType;
import org.odftoolkit.odfdom.dom.type.form.OdfImageAlignType;
import javax.xml.datatype.Duration;
import org.odftoolkit.odfdom.dom.type.OdfDuration;


/**
 * ODF DOM Element implementation for element "<form:button>".
 */
public abstract class OdfButtonElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.FORM, "button" );

    public OdfButtonElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aId, String _aXmlid)
    {
        setId( _aId );
        setXmlid( _aXmlid );
    }

    /**
     * Get value of attribute "form:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ) );
    }

    /**
     * Set value of attribute "form:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ), _aName );
    }

    /**
     * Get value of attribute "form:control-implementation".
     */
    public String getControlImplementation()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ) );
    }

    /**
     * Set value of attribute "form:control-implementation".
     */
    public void setControlImplementation( String _aControlImplementation )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ), _aControlImplementation );
    }

    /**
     * Get value of attribute "form:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ) );
    }

    /**
     * Set value of attribute "form:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "id" ), _aId );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "xforms:bind".
     */
    public String getBind()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ) );
    }

    /**
     * Set value of attribute "xforms:bind".
     */
    public void setBind( String _aBind )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.XFORMS, "bind" ), _aBind );
    }

    /**
     * Get value of attribute "form:button-type".
     */
    public OdfButtonType getButtonType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "button-type" ) );
        return OdfButtonType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:button-type".
     */
    public void setButtonType( OdfButtonType _aButtonType )
    {                    
        String aStringVal = OdfButtonType.toString( _aButtonType );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "button-type" ), aStringVal );
    }

    /**
     * Get value of attribute "form:disabled".
     */
    public Boolean getDisabled()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:disabled".
     */
    public void setDisabled( Boolean _aDisabled )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisabled );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "disabled" ), aStringVal );
    }

    /**
     * Get value of attribute "form:label".
     */
    public String getLabel()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "label" ) );
    }

    /**
     * Set value of attribute "form:label".
     */
    public void setLabel( String _aLabel )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "label" ), _aLabel );
    }

    /**
     * Get value of attribute "form:image-data".
     */
    public String getImageData()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "image-data" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:image-data".
     */
    public void setImageData( String _aImageData )
    {                    
        String aStringVal = OdfAnyURI.toString( _aImageData );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "image-data" ), aStringVal );
    }

    /**
     * Get value of attribute "form:printable".
     */
    public Boolean getPrintable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:printable".
     */
    public void setPrintable( Boolean _aPrintable )
    {                    
        String aStringVal = OdfBoolean.toString( _aPrintable );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "printable" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-index".
     */
    public Integer getTabIndex()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-index".
     */
    public void setTabIndex( Integer _aTabIndex )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aTabIndex );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-index" ), aStringVal );
    }

    /**
     * Get value of attribute "form:tab-stop".
     */
    public Boolean getTabStop()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-stop".
     */
    public void setTabStop( Boolean _aTabStop )
    {                    
        String aStringVal = OdfBoolean.toString( _aTabStop );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-stop" ), aStringVal );
    }

    /**
     * Get value of attribute "office:target-frame".
     */
    public OdfTargetFrameNameType getTargetFrame()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame" ) );
        return OdfTargetFrameNameType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:target-frame".
     */
    public void setTargetFrame( OdfTargetFrameNameType _aTargetFrame )
    {                    
        String aStringVal = OdfTargetFrameNameType.toString( _aTargetFrame );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame" ), aStringVal );
    }

    /**
     * Get value of attribute "xlink:href".
     */
    public String getHref()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:href".
     */
    public void setHref( String _aHref )
    {                    
        String aStringVal = OdfAnyURI.toString( _aHref );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ), aStringVal );
    }

    /**
     * Get value of attribute "form:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ) );
    }

    /**
     * Set value of attribute "form:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "form:value".
     */
    public String getValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ) );
    }

    /**
     * Set value of attribute "form:value".
     */
    public void setValue( String _aValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "value" ), _aValue );
    }

    /**
     * Get value of attribute "form:image-position".
     */
    public OdfImagePositionType getImagePosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "image-position" ) );
        return OdfImagePositionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:image-position".
     */
    public void setImagePosition( OdfImagePositionType _aImagePosition )
    {                    
        String aStringVal = OdfImagePositionType.toString( _aImagePosition );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "image-position" ), aStringVal );
    }

    /**
     * Get value of attribute "form:image-align".
     */
    public OdfImageAlignType getImageAlign()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "image-align" ) );
        return OdfImageAlignType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:image-align".
     */
    public void setImageAlign( OdfImageAlignType _aImageAlign )
    {                    
        String aStringVal = OdfImageAlignType.toString( _aImageAlign );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "image-align" ), aStringVal );
    }

    /**
     * Get value of attribute "form:repeat".
     */
    public Boolean getRepeat()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "repeat" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:repeat".
     */
    public void setRepeat( Boolean _aRepeat )
    {                    
        String aStringVal = OdfBoolean.toString( _aRepeat );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "repeat" ), aStringVal );
    }

    /**
     * Get value of attribute "form:delay-for-repeat".
     */
    public Duration getDelayForRepeat()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "delay-for-repeat" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:delay-for-repeat".
     */
    public void setDelayForRepeat( Duration _aDelayForRepeat )
    {                    
        String aStringVal = OdfDuration.toString( _aDelayForRepeat );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "delay-for-repeat" ), aStringVal );
    }

    /**
     * Get value of attribute "form:default-button".
     */
    public Boolean getDefaultButton()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "default-button" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:default-button".
     */
    public void setDefaultButton( Boolean _aDefaultButton )
    {                    
        String aStringVal = OdfBoolean.toString( _aDefaultButton );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "default-button" ), aStringVal );
    }

    /**
     * Get value of attribute "form:toggle".
     */
    public Boolean getToggle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "toggle" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:toggle".
     */
    public void setToggle( Boolean _aToggle )
    {                    
        String aStringVal = OdfBoolean.toString( _aToggle );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "toggle" ), aStringVal );
    }

    /**
     * Get value of attribute "form:focus-on-click".
     */
    public Boolean getFocusOnClick()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "focus-on-click" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:focus-on-click".
     */
    public void setFocusOnClick( Boolean _aFocusOnClick )
    {                    
        String aStringVal = OdfBoolean.toString( _aFocusOnClick );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "focus-on-click" ), aStringVal );
    }

    /**
     * Get value of attribute "form:xforms-submission".
     */
    public String getXformsSubmission()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "xforms-submission" ) );
    }

    /**
     * Set value of attribute "form:xforms-submission".
     */
    public void setXformsSubmission( String _aXformsSubmission )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "xforms-submission" ), _aXformsSubmission );
    }

}