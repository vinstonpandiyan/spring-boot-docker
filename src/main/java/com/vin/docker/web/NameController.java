package com.vin.docker.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vin.docker.service.NameService;

/**
 *
 * @author Vinston Pandiyan
 * @since Jun 3, 2017
 */
@RestController
public class NameController {
	
	@Autowired
    private NameService nameService;

    @RequestMapping("/")
    @ResponseBody
    public String helloMessage() {
        return this.nameService.getHelloMessage();
    }

}
