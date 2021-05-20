package com.example;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface Calculator {
  @WebMethod
  @WebResult(name = "value")
  int add(@WebParam(name = "intA") int a, @WebParam(name = "intB") int b);

  @WebMethod
  @WebResult(name = "value")
  int subtract(@WebParam(name = "intA") int a, @WebParam(name = "intB") int b);

  @WebMethod
  @WebResult(name = "value")
  int multiply(@WebParam(name = "intA") int a, @WebParam(name = "intB") int b);

  @WebMethod
  @WebResult(name = "value")
  int divide(@WebParam(name = "intA") int a, @WebParam(name = "intB") int b);
}