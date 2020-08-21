package com.muthucorp.merchant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muthucorp.merchant.service.MerchantItemsService;

@RestController
public class MerchantController {
	
    @Autowired
    MerchantItemsService service;
    
    @RequestMapping(value="/items", method = RequestMethod.GET)
    public List<String> getItems(){
       
    	return service.getItemsList();
    	
    }
    
	@RequestMapping(value="/health", method = RequestMethod.GET)
	public static String getHealth() {
		
	 System.out.println("Application health ok......");
	 return "ok";
	}

}
