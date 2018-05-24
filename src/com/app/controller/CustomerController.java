package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Customer;
import com.app.service.ICustomerService;
import com.app.util.CoDecUtil;
import com.app.util.CodeUtil;

@Controller
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CoDecUtil coDecUtil;
	
	@RequestMapping("/regcust")
	public String shoeReg(){
		return "CustomerReg";
	}
	
	@RequestMapping(value="/insertcust",method=RequestMethod.POST)
	public String saveCust(@ModelAttribute("customer")Customer cust,ModelMap map){
		
		//generate pwd and tkn
		String pwd = codeUtil.genPwd();
		String tkn = codeUtil.genToken();
		
		//encode details
		String encTkn = coDecUtil.doEncode(tkn);
		String encPwd = coDecUtil.doEncode(pwd);
		
		//set encode details to customer object
		cust.setAccTock(encTkn);
		cust.setPassword(encPwd);
		
		//save customer
		int custId = service.saveCustomer(cust);
		
		//email
		//TODO:email coding
		
		//sent msg to UI
		String msg = "Cutomer Registered With Id:" +custId;
		map.addAttribute("message", msg);
		
		return "CustomerReg";
	}
}
