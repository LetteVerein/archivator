//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.09 at 02:45:01 PM CET 
//


package de.archivator.altdaten.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.archivator.de/altdaten}Tabelle_x0020_Archiv"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tabelleX0020Archiv"
})
@XmlRootElement(name = "dataroot")
public class Dataroot {

    @XmlElement(name = "Tabelle_x0020_Archiv")
    protected List<TabelleX0020Archiv> tabelleX0020Archiv;

    /**
     * Gets the value of the tabelleX0020Archiv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabelleX0020Archiv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabelleX0020Archiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabelleX0020Archiv }
     * 
     * 
     */
    public List<TabelleX0020Archiv> getTabelleX0020Archiv() {
        if (tabelleX0020Archiv == null) {
            tabelleX0020Archiv = new ArrayList<TabelleX0020Archiv>();
        }
        return this.tabelleX0020Archiv;
    }

}
