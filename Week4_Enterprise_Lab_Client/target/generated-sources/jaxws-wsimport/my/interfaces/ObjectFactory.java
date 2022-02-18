
package my.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginResponse_QNAME = new QName("http://interfaces.my/", "LoginResponse");
    private final static QName _GetAllFruits_QNAME = new QName("http://interfaces.my/", "getAllFruits");
    private final static QName _GetAllFruitsByChar_QNAME = new QName("http://interfaces.my/", "getAllFruitsByChar");
    private final static QName _GetAllFruitsResponse_QNAME = new QName("http://interfaces.my/", "getAllFruitsResponse");
    private final static QName _Login_QNAME = new QName("http://interfaces.my/", "Login");
    private final static QName _GetAllFruitsByCharResponse_QNAME = new QName("http://interfaces.my/", "getAllFruitsByCharResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllFruitsByChar }
     * 
     */
    public GetAllFruitsByChar createGetAllFruitsByChar() {
        return new GetAllFruitsByChar();
    }

    /**
     * Create an instance of {@link GetAllFruits }
     * 
     */
    public GetAllFruits createGetAllFruits() {
        return new GetAllFruits();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetAllFruitsResponse }
     * 
     */
    public GetAllFruitsResponse createGetAllFruitsResponse() {
        return new GetAllFruitsResponse();
    }

    /**
     * Create an instance of {@link GetAllFruitsByCharResponse }
     * 
     */
    public GetAllFruitsByCharResponse createGetAllFruitsByCharResponse() {
        return new GetAllFruitsByCharResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Fruits }
     * 
     */
    public Fruits createFruits() {
        return new Fruits();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFruits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllFruits")
    public JAXBElement<GetAllFruits> createGetAllFruits(GetAllFruits value) {
        return new JAXBElement<GetAllFruits>(_GetAllFruits_QNAME, GetAllFruits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFruitsByChar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllFruitsByChar")
    public JAXBElement<GetAllFruitsByChar> createGetAllFruitsByChar(GetAllFruitsByChar value) {
        return new JAXBElement<GetAllFruitsByChar>(_GetAllFruitsByChar_QNAME, GetAllFruitsByChar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFruitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllFruitsResponse")
    public JAXBElement<GetAllFruitsResponse> createGetAllFruitsResponse(GetAllFruitsResponse value) {
        return new JAXBElement<GetAllFruitsResponse>(_GetAllFruitsResponse_QNAME, GetAllFruitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFruitsByCharResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllFruitsByCharResponse")
    public JAXBElement<GetAllFruitsByCharResponse> createGetAllFruitsByCharResponse(GetAllFruitsByCharResponse value) {
        return new JAXBElement<GetAllFruitsByCharResponse>(_GetAllFruitsByCharResponse_QNAME, GetAllFruitsByCharResponse.class, null, value);
    }

}
