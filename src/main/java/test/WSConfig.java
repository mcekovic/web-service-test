package test;


import javax.xml.ws.*;

import org.apache.cxf.*;
import org.apache.cxf.jaxws.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

@Configuration
public class WSConfig {

	@Autowired private Bus bus;

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new TestWSImpl());
		endpoint.publish("/test-ws");
		return endpoint;
	}
}
