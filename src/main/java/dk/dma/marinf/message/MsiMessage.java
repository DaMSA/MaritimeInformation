/* Copyright (c) 2012 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.dma.marinf.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;


/**
 * Maritime Safety Information Message
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class MsiMessage extends MaritimeInformationMessage {
	
	@XmlAttribute(required = true)
	private MsiMessageType type;
	private NavtexMessage navtexMessage;
	
	public MsiMessage() {
		super();
	}

	public MsiMessageType getType() {
		return type;
	}

	public void setType(MsiMessageType type) {
		this.type = type;
	}

	public NavtexMessage getNavtexMessage() {
		return navtexMessage;
	}

	public void setNavtexMessage(NavtexMessage navtexMessage) {
		this.navtexMessage = navtexMessage;
	}
	
}
