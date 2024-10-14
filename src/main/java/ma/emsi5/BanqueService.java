package ma.emsi5;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;

@WebService(serviceName = "BanqueService")

public class BanqueService {

@WebMethod(operationName = "ConversionEuroToDh")
    public double Conversion (@WebParam(name="montant") double mt) {
        return mt * 11;
    }
    @WebMethod(operationName = "getCompte")
    public Compte  getCompte (@WebParam(name="code") int code)
    {
        return new Compte(code, 50444, new Date());
    }
}
