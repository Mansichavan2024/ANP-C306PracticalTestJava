package com.mygame.service;

public class GameService {
	
	public String[] getCityNameService(){
		GameDao dao=new GameDao();
		String[] cityName=dao.getCityName();
		return cityName;
	}
}