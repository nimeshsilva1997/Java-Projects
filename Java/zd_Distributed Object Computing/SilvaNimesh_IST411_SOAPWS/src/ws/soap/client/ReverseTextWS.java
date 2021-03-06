
package ws.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReverseTextWS", targetNamespace = "http://server.soap.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReverseTextWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reverseText", targetNamespace = "http://server.soap.ws/", className = "ws.soap.client.ReverseText")
    @ResponseWrapper(localName = "reverseTextResponse", targetNamespace = "http://server.soap.ws/", className = "ws.soap.client.ReverseTextResponse")
    @Action(input = "http://server.soap.ws/ReverseTextWS/reverseTextRequest", output = "http://server.soap.ws/ReverseTextWS/reverseTextResponse")
    public String reverseText(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
