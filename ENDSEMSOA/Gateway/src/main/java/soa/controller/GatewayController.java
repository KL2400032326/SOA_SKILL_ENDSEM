package soa.controller;

import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import soa.service.GatewayServer;

@Controller
public class GatewayController {
	GatewayServer GS;
	  public GatewayController(GatewayServer GS) {
	    this.GS = GS;
	  }
	  
	  @GetMapping("{serviceName}/{operation}")
	  public Object getService(@PathVariable
	      String serviceName, @PathVariable String operation)
	  {
	    return GS.invokeService(HttpMethod.GET, serviceName, operation, null);
	  }
	  
	  @PostMapping("{serviceName}/{operation}")
	  public Object getService(@PathVariable String serviceName, 
	               @PathVariable String operation,
	               @RequestBody Map<String, Object> data)
	  {
	    return GS.invokeService(HttpMethod.POST, serviceName, operation, data);
	  }
}
