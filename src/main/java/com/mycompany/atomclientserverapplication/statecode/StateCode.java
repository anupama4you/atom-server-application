package com.mycompany.atomclientserverapplication.statecode;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StateCode {
	// command
	public final static int QUERY = 0;
	public final static int ADD = 1;
	public final static int REMOVE = 2;
	
	//Command state
	public final static int SUCCESS = 3;
	public final static int FAIL = 4;
	
	//Net Error state
	public final static int UNKNOWN_HOST = 403;
	public final static int COLLECTIONG_REFUSED = 403;
	public final static int IO_ERROR = 403;
	public final static int TIMEOUT = 400;
}
