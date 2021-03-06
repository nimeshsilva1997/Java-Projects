
package ws.soap.client;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InterestCalculatorWSService", targetNamespace = "http://server.soap.ws/", wsdlLocation = "http://localhost:2525/InterestCalculatorWS?wsdl")
public class InterestCalculatorWSService
    extends Service
{

    private final static URL INTERESTCALCULATORWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException INTERESTCALCULATORWSSERVICE_EXCEPTION;
    private final static QName INTERESTCALCULATORWSSERVICE_QNAME = new QName("http://server.soap.ws/", "InterestCalculatorWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2525/InterestCalculatorWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INTERESTCALCULATORWSSERVICE_WSDL_LOCATION = url;
        INTERESTCALCULATORWSSERVICE_EXCEPTION = e;
    }

    public InterestCalculatorWSService() {
        super(__getWsdlLocation(), INTERESTCALCULATORWSSERVICE_QNAME);
    }

    public InterestCalculatorWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INTERESTCALCULATORWSSERVICE_QNAME, features);
    }

    public InterestCalculatorWSService(URL wsdlLocation) {
        super(wsdlLocation, INTERESTCALCULATORWSSERVICE_QNAME);
    }

    public InterestCalculatorWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INTERESTCALCULATORWSSERVICE_QNAME, features);
    }

    public InterestCalculatorWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InterestCalculatorWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InterestCalculatorWS
     */
    @WebEndpoint(name = "InterestCalculatorWSPort")
    public InterestCalculatorWS getInterestCalculatorWSPort() {
        return super.getPort(new QName("http://server.soap.ws/", "InterestCalculatorWSPort"), InterestCalculatorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InterestCalculatorWS
     */
    @WebEndpoint(name = "InterestCalculatorWSPort")
    public InterestCalculatorWS getInterestCalculatorWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.soap.ws/", "InterestCalculatorWSPort"), InterestCalculatorWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INTERESTCALCULATORWSSERVICE_EXCEPTION!= null) {
            throw INTERESTCALCULATORWSSERVICE_EXCEPTION;
        }
        return INTERESTCALCULATORWSSERVICE_WSDL_LOCATION;
    }

}
