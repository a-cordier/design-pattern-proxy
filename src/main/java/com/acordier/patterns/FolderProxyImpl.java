package com.acordier.patterns;

public class FolderProxyImpl implements Folder{
	
	private String username;
	private String password;
	private Folder folder;
	
	public FolderProxyImpl(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void list() {
		if("admin".equals(username) && "1234".equals(password)){
			folder = new FolderImpl();
			folder.list();
		}else {
			System.out.println("Forbidden operation !");
		}
	}	
}
