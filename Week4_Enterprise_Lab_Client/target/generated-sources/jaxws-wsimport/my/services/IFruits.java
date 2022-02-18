
package my.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import my.interfaces.Fruits;
import my.interfaces.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IFruits", targetNamespace = "http://interfaces.my/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IFruits {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(name = "Login", targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://interfaces.my/", className = "my.interfaces.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://interfaces.my/", className = "my.interfaces.LoginResponse")
    @Action(input = "http://interfaces.my/IFruits/LoginRequest", output = "http://interfaces.my/IFruits/LoginResponse")
    public Boolean login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<my.interfaces.Fruits>
     */
    @WebMethod
    @WebResult(name = "fruitsList", targetNamespace = "")
    @RequestWrapper(localName = "getAllFruits", targetNamespace = "http://interfaces.my/", className = "my.interfaces.GetAllFruits")
    @ResponseWrapper(localName = "getAllFruitsResponse", targetNamespace = "http://interfaces.my/", className = "my.interfaces.GetAllFruitsResponse")
    @Action(input = "http://interfaces.my/IFruits/getAllFruitsRequest", output = "http://interfaces.my/IFruits/getAllFruitsResponse")
    public List<Fruits> getAllFruits();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<my.interfaces.Fruits>
     */
    @WebMethod
    @WebResult(name = "fruitsListByChar", targetNamespace = "")
    @RequestWrapper(localName = "getAllFruitsByChar", targetNamespace = "http://interfaces.my/", className = "my.interfaces.GetAllFruitsByChar")
    @ResponseWrapper(localName = "getAllFruitsByCharResponse", targetNamespace = "http://interfaces.my/", className = "my.interfaces.GetAllFruitsByCharResponse")
    @Action(input = "http://interfaces.my/IFruits/getAllFruitsByCharRequest", output = "http://interfaces.my/IFruits/getAllFruitsByCharResponse")
    public List<Fruits> getAllFruitsByChar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
