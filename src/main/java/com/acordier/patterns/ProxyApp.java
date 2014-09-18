package com.acordier.patterns;

public class ProxyApp {
	public static void main(String[]args){
		Folder folder = new FolderProxyImpl("admin", "admin");
		folder.list();
		folder = new FolderProxyImpl("admin","1234");
		folder.list();
	}
}
