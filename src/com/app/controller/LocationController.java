package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;

@Controller
public class LocationController {
	
	@Autowired
	private ILocationService service;
	
	@RequestMapping("/reg")
	public String show(){
		
		return "LocationReg";
	}
	
	@RequestMapping(value="/insertloc",method=RequestMethod.POST)
		public String savLoc(@ModelAttribute("location")Location loc, ModelMap map){
		
		int locId=service.saveLocation(loc);
		String m ="Location Created:"+locId;
		map.addAttribute("message", m);
		return "LocationReg";
	}
	
	@RequestMapping("/viewAllLocs")
	public String getAllRows(ModelMap map){
		List<Location> locList = service.getAllLocs();
		map.addAttribute("locs", locList);
		return "LocationData";
	}
	
	@RequestMapping("/deleteLoc")
	public String deleteObj(@RequestParam("locId")int lid){
		service.deleteLocById(lid);
		return "redirect:viewAllLocs";
	}
}
