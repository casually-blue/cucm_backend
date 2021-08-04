
package org.coramdeoacademy.cucm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetInteractiveVoiceResponseRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInteractiveVoiceResponseRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.5}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="interactiveVoiceResponse" type="{http://www.cisco.com/AXL/API/11.5}RInteractiveVoiceResponse"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInteractiveVoiceResponseRes", propOrder = {
    "_return"
})
public class GetInteractiveVoiceResponseRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetInteractiveVoiceResponseRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetInteractiveVoiceResponseRes.Return }
     *     
     */
    public GetInteractiveVoiceResponseRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInteractiveVoiceResponseRes.Return }
     *     
     */
    public void setReturn(GetInteractiveVoiceResponseRes.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="interactiveVoiceResponse" type="{http://www.cisco.com/AXL/API/11.5}RInteractiveVoiceResponse"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "interactiveVoiceResponse"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RInteractiveVoiceResponse interactiveVoiceResponse;

        /**
         * Gets the value of the interactiveVoiceResponse property.
         * 
         * @return
         *     possible object is
         *     {@link RInteractiveVoiceResponse }
         *     
         */
        public RInteractiveVoiceResponse getInteractiveVoiceResponse() {
            return interactiveVoiceResponse;
        }

        /**
         * Sets the value of the interactiveVoiceResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link RInteractiveVoiceResponse }
         *     
         */
        public void setInteractiveVoiceResponse(RInteractiveVoiceResponse value) {
            this.interactiveVoiceResponse = value;
        }

    }

}