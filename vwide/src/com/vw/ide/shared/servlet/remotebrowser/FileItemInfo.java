package com.vw.ide.shared.servlet.remotebrowser;

import java.io.Serializable;

/**
 * Simple class which is used to pass inforemation about file
 * @author Oleg
 *
 */
@SuppressWarnings("serial")
public class FileItemInfo implements Serializable {
	private String name;
	private String path;
	private boolean isDir;
	private byte[] checkSumOnOpen;
	private byte[] checkSumOnClose;
	private boolean isEdited;
	
	
	public FileItemInfo() {
		super();
	}

	public FileItemInfo(String name, String path, boolean isDir) {
		super();
		this.name = name;
		this.path = path;
		this.isDir = isDir;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public boolean isDir() {
		return isDir;
	}
	
	public void setDir(boolean isDir) {
		this.isDir = isDir;
	}
	
	public byte[] getCheckSumOnOpen() {
		return checkSumOnOpen;
	}
	
	public void setCheckSumOnOpen(byte[] checkSumOnOpen) {
		this.checkSumOnOpen = checkSumOnOpen;
	}	

	public byte[] getCheckSumOnClose() {
		return checkSumOnClose;
	}
	
	public void setCheckSumOnClose(byte[] checkSumOnClose) {
		this.checkSumOnClose = checkSumOnClose;
	}	

	public boolean isEdited() {
		return isEdited;
	}
	
	public void setEdited(boolean isEdited) {
		this.isEdited = isEdited;
	}
	

	@Override
	public String toString() {
		return "FileItemInfo [name=" + name + ", path=" + path + ", isDir="
				+ isDir + "]";
	}
}
