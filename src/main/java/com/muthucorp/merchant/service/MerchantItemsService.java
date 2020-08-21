package com.muthucorp.merchant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MerchantItemsService {
	
	public List<String> getItemsList() {
		List<String> list=new ArrayList<String>();
		list.add("Sample");
		System.out.println("Success");
		return list;
	}
	

}
