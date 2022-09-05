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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableCellRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:source-cell-range}.
 *
 */
public class TableSourceCellRangeElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "source-cell-range");

	/**
	 * Create the instance of <code>TableSourceCellRangeElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableSourceCellRangeElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:source-cell-range}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCellRangeAddressAttribute</code> , See {@odf.attribute table:cell-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCellRangeAddressAttribute() {
		TableCellRangeAddressAttribute attr = (TableCellRangeAddressAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "cell-range-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCellRangeAddressAttribute</code> , See {@odf.attribute table:cell-range-address}
	 *
	 * @param tableCellRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableCellRangeAddressAttribute(String tableCellRangeAddressValue) {
		TableCellRangeAddressAttribute attr = new TableCellRangeAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableCellRangeAddressValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableNameAttribute() {
		TableNameAttribute attr = (TableNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @param tableNameValue   The type is <code>String</code>
	 */
	public void setTableNameAttribute(String tableNameValue) {
		TableNameAttribute attr = new TableNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableNameValue);
	}

	/**
	 * Create child element {@odf.element table:filter}.
	 *
	 * @return the element {@odf.element table:filter}
	 */
	public TableFilterElement newTableFilterElement() {
		TableFilterElement tableFilter = ((OdfFileDom) this.ownerDocument).newOdfElement(TableFilterElement.class);
		this.appendChild(tableFilter);
		return tableFilter;
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