/* Copyright (c) 2011 Danish Maritime Authority
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
package dk.dma.marinf.exchange;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import dk.dma.marinf.message.MaritimeInformationMessage;

/**
 * Class to hold a bundle of messages
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MaritimeInformationBundle {

	@XmlElement(required = true)
	private List<MaritimeInformationMessage> messages = new ArrayList<MaritimeInformationMessage>();
	@XmlElement(required = true)
	private Date created;
	@XmlElement(required = true)
	private MaritimeInformationProvider provider;

	public MaritimeInformationBundle() {
	}
	
	public List<MaritimeInformationMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<MaritimeInformationMessage> messages) {
		this.messages = messages;
	}

	public void addMessage(MaritimeInformationMessage message) {
		messages.add(message);
	}
	
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public MaritimeInformationProvider getProvider() {
		return provider;
	}
	
	public void setProvider(MaritimeInformationProvider provider) {
		this.provider = provider;
	}

}
