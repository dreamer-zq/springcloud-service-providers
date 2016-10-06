package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
    private DiscoveryClient client;

	@RequestMapping(value="/hi",method = RequestMethod.GET)
	public String sayHi() {
		ServiceInstance instance = client.getLocalServiceInstance();
		logger.info("/hi, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
		return "Hello World";
	}
}
