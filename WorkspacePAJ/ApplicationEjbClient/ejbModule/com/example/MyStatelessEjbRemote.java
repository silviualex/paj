package com.example;

import javax.ejb.Remote;

@Remote
public interface MyStatelessEjbRemote {
	
	void insert(String name);
}
