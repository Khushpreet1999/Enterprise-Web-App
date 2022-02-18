
package my.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllFruitsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllFruitsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fruitsList" type="{http://interfaces.my/}fruits" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllFruitsResponse", propOrder = {
    "fruitsList"
})
public class GetAllFruitsResponse {

    protected List<Fruits> fruitsList;

    /**
     * Gets the value of the fruitsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fruitsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFruitsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fruits }
     * 
     * 
     */
    public List<Fruits> getFruitsList() {
        if (fruitsList == null) {
            fruitsList = new ArrayList<Fruits>();
        }
        return this.fruitsList;
    }

}
