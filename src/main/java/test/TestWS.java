package test;

import javax.jws.*;

@WebService(targetNamespace = "http://test-ws", name = "TestWS")
public interface TestWS {

	@WebMethod
	String hello(
		@WebParam(name = "name") String name
	);
}
