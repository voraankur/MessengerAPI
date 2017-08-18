package org.ankur.restexample.messenger.service;

import java.util.Map;

import org.ankur.restexample.messenger.database.DatabaseClass;

public class HeaderService {
	
	private Map<String, String> headers = DatabaseClass.getHeaders();

}
