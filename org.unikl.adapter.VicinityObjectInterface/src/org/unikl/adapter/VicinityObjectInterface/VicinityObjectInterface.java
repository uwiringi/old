package org.unikl.adapter.VicinityObjectInterface;

public interface VicinityObjectInterface {
	public VicinityObjectInterface getInstance();
	public String getProperty(String oid, String propertyName);
	public boolean setProperty(String oid, String propertyName, String value);
}