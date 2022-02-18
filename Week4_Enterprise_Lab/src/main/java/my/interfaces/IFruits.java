/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.interfaces;

import com.models.Fruits;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author khushpreetkaurgulati
 */
@WebService
public interface IFruits {
    @WebMethod
    @WebResult(name="fruitsList")
    public List<Fruits> getAllFruits();
    
      @WebMethod
      @WebResult(name="fruitsListByChar")
    public List<Fruits> getAllFruitsByChar(String c);
    
     @WebMethod
      @WebResult(name="Login")
    public Boolean Login(String username, String password);
   
}
