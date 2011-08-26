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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.db.OdfDataType;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;
import org.odftoolkit.odfdom.dom.type.db.OdfIsNullableType;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.office.OdfValueType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.odftoolkit.odfdom.dom.type.OdfDate;
import javax.xml.datatype.Duration;
import org.odftoolkit.odfdom.dom.type.OdfDuration;


/**
 * ODF DOM Element implementation for element "<db:column-definition>".
 */
public abstract class OdfColumnDefinitionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DB, "column-definition" );

    public OdfColumnDefinitionElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName)
    {
        setName( _aName );
    }

    /**
     * Get value of attribute "db:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ) );
    }

    /**
     * Set value of attribute "db:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "name" ), _aName );
    }

    /**
     * Get value of attribute "db:data-type".
     */
    public OdfDataType getDataType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "data-type" ) );
        return OdfDataType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:data-type".
     */
    public void setDataType( OdfDataType _aDataType )
    {                    
        String aStringVal = OdfDataType.toString( _aDataType );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "data-type" ), aStringVal );
    }

    /**
     * Get value of attribute "db:type-name".
     */
    public String getTypeName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DB, "type-name" ) );
    }

    /**
     * Set value of attribute "db:type-name".
     */
    public void setTypeName( String _aTypeName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "type-name" ), _aTypeName );
    }

    /**
     * Get value of attribute "db:precision".
     */
    public Integer getPrecision()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "precision" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:precision".
     */
    public void setPrecision( Integer _aPrecision )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aPrecision );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "precision" ), aStringVal );
    }

    /**
     * Get value of attribute "db:scale".
     */
    public Integer getScale()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "scale" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:scale".
     */
    public void setScale( Integer _aScale )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aScale );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "scale" ), aStringVal );
    }

    /**
     * Get value of attribute "db:is-nullable".
     */
    public OdfIsNullableType getIsNullable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "is-nullable" ) );
        return OdfIsNullableType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:is-nullable".
     */
    public void setIsNullable( OdfIsNullableType _aIsNullable )
    {                    
        String aStringVal = OdfIsNullableType.toString( _aIsNullable );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "is-nullable" ), aStringVal );
    }

    /**
     * Get value of attribute "db:is-empty-allowed".
     */
    public Boolean getIsEmptyAllowed()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "is-empty-allowed" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:is-empty-allowed".
     */
    public void setIsEmptyAllowed( Boolean _aIsEmptyAllowed )
    {                    
        String aStringVal = OdfBoolean.toString( _aIsEmptyAllowed );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "is-empty-allowed" ), aStringVal );
    }

    /**
     * Get value of attribute "db:is-autoincrement".
     */
    public Boolean getIsAutoincrement()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DB, "is-autoincrement" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "db:is-autoincrement".
     */
    public void setIsAutoincrement( Boolean _aIsAutoincrement )
    {                    
        String aStringVal = OdfBoolean.toString( _aIsAutoincrement );
        setOdfAttribute( OdfName.get( OdfNamespace.DB, "is-autoincrement" ), aStringVal );
    }

    /**
     * Get value of attribute "office:value-type".
     */
    public OdfValueType getValueType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value-type" ) );
        return OdfValueType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:value-type".
     */
    public void setValueType( OdfValueType _aValueType )
    {                    
        String aStringVal = OdfValueType.toString( _aValueType );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value-type" ), aStringVal );
    }

    /**
     * Get value of attribute "office:value".
     */
    public Double getValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:value".
     */
    public void setValue( Double _aValue )
    {                    
        String aStringVal = Double.toString( _aValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:currency".
     */
    public String getCurrency()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "currency" ) );
    }

    /**
     * Set value of attribute "office:currency".
     */
    public void setCurrency( String _aCurrency )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "currency" ), _aCurrency );
    }

    /**
     * Get value of attribute "office:date-value".
     */
    public XMLGregorianCalendar getDateValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "date-value" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:date-value".
     */
    public void setDateValue( XMLGregorianCalendar _aDateValue )
    {                    
        String aStringVal = OdfDate.toString( _aDateValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "date-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:time-value".
     */
    public Duration getTimeValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "time-value" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:time-value".
     */
    public void setTimeValue( Duration _aTimeValue )
    {                    
        String aStringVal = OdfDuration.toString( _aTimeValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "time-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:boolean-value".
     */
    public Boolean getBooleanValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "boolean-value" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:boolean-value".
     */
    public void setBooleanValue( Boolean _aBooleanValue )
    {                    
        String aStringVal = OdfBoolean.toString( _aBooleanValue );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "boolean-value" ), aStringVal );
    }

    /**
     * Get value of attribute "office:string-value".
     */
    public String getStringValue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "string-value" ) );
    }

    /**
     * Set value of attribute "office:string-value".
     */
    public void setStringValue( String _aStringValue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "string-value" ), _aStringValue );
    }

}