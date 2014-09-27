package com.vw.ide.shared.servlet.security;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Implemented by Remote directory browser servlet
 * @author OMelnyk
 *
 */
@RemoteServiceRelativePath("security")
public interface RemoteSecurity extends RemoteService {
	/**
	 * Returns list of directories, for given user, from the parent 'dir'
	 * @param user
	 * @param dir
	 * @return
	 */
	public RequestLoginResult login(String userName, String password);
	
	
}