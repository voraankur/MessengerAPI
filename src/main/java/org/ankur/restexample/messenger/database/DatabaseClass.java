package org.ankur.restexample.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.ankur.restexample.messenger.model.Message;
import org.ankur.restexample.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages =  new HashMap<>();
	private static Map<String, Profile> profiles =  new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
