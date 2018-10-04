package test;

import javax.jws.*;

@WebService(serviceName = "TestWSService", portName = "TestWSPort", targetNamespace = "http://test-ws", endpointInterface = "test.TestWS")
public class TestWSImpl implements TestWS {

	@Override public String hello(String name) {
		return "Hello " + name + "!";
	}
}
