package org.apache.commons.mail;

import java.util.Map;
import static org.junit.Assert.assertNull;

public class EmailConcrete extends Email {
    
	@Override
	public Email setMsg(String msg) throws EmailException{
		//TODO Auto-generated method sub
		return null;
	}
	
	/**
	* @return header
	*/
	public Map<String, String> getHeaders()
	{
	
		return this.headers;
	}
	
	public String getContentType()
	{
		return this.contentType;
	}
	
}
