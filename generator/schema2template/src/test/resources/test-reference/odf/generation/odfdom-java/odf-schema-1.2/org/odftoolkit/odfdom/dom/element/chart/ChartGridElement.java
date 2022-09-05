/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
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
package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element chart:grid}.
 *
 */
public class ChartGridElement extends OdfStylableElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.CHART, "grid");

	/**
	 * Create the instance of <code>ChartGridElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ChartGridElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.newName(OdfDocumentNamespace.CHART, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element chart:grid}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartClassAttribute</code> , See {@odf.attribute chart:class}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartClassAttribute() {
		ChartClassAttribute attr = (ChartClassAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "class");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return ChartClassAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartClassAttribute</code> , See {@odf.attribute chart:class}
	 *
	 * @param chartClassValue   The type is <code>String</code>
	 */
	public void setChartClassAttribute(String chartClassValue) {
		ChartClassAttribute attr = new ChartClassAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(chartClassValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartStyleNameAttribute() {
		ChartStyleNameAttribute attr = (ChartStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @param chartStyleNameValue   The type is <code>String</code>
	 */
	public void setChartStyleNameAttribute(String chartStyleNameValue) {
		ChartStyleNameAttribute attr = new ChartStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(chartStyleNameValue);
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}