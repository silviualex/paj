package com.main;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.example.MyStatelessEjbRemote;

public class Main {

	public static void main(String[] args) throws NamingException {

		InitialContext context = new InitialContext();
		MyStatelessEjbRemote ejb = (MyStatelessEjbRemote) context
				.lookup("java:global/ApplicationEar/ApplicationEjb/MyStatelessEjb!com.example.MyStatelessEjbRemote");
		ejb.insert("Bianca");
		

	}

}
