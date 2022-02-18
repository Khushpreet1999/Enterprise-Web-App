
package my.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllFruitsByCharResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllFruitsByCharResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fruitsListByChar" type="{http://interfaces.my/}fruits" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllFruitsByCharResponse", propOrder = {
    "fruitsListByChar"
})
public class GetAllFruitsByCharResponse {

    protected List<Fruits> fruitsListByChar;

    /**
     * Gets the value of the fruitsListByChar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fruitsListByChar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFruitsListByChar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fruits }
     * 
     * 
     */
    public List<Fruits> getFruitsListByChar() {
        if (fruitsListByChar == null) {
            fruitsListByChar = new ArrayList<Fruits>();
        }
        return this.fruitsListByChar;
    }

}
