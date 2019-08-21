package com.javarevolutions.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javarevolutions.model.ModelData;

@RestController
@RequestMapping(path ="/rest/dataJR")
public class RestData {

	@GetMapping(path = "/obtenerDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name = "msg") String message) {
		ModelData response = new ModelData();
		if(message.equals("JR")) {	
			response.setCode(200);
			response.setMensaje("Message success...");
			response.setStatus(true);
		} else {
			response.setCode(402);
			response.setMensaje("Message failed..." + message);
			response.setStatus(false);
		}
		return response;
	}
}
