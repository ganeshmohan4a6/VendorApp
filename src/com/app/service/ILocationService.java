package com.app.service;

import java.util.List;

import com.app.model.Location;

public interface ILocationService {
	public int saveLocation(Location loc);
	public List<Location> getAllLocs();
	public void deleteLocById(int locId);
	public Location getLocById(int locId);
	public void updateLocation(Location loc);
}
