package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService {
	@Autowired
	private ILocationDao dao;
	
	@Override
	public int saveLocation(Location loc) {
		return dao.saveLocation(loc);
	}
	
	@Override
	public List<Location> getAllLocs() {
		return dao.getAllLocs();
	}
	
	@Override
	public void deleteLocById(int locId) {
		dao.deleteLocById(locId);
	}
	@Override
	public Location getLocById(int locId) {
		return dao.getLocById(locId);
	}
	
	@Override
	public void updateLocation(Location loc) {
		dao.updateLocation(loc);
	}
}
