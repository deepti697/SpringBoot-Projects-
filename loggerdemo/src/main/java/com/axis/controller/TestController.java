package com.axis.controller;

	import org.apache.commons.logging.Log;
	import org.apache.commons.logging.LogFactory;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class TestController {

	    private static Log logger = LogFactory.getLog(TestController.class);
	    
	    
	    @GetMapping("/get")
	    public String greet() {
	        logger.error("this is error info");
	        logger.warn("this id warning info");
	        logger.info("this is info");
	        return "hello";
	    }
}
