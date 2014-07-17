package com.github.kamegu.first;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("webapi")
public class WebapiConfig extends ResourceConfig {
	public WebapiConfig() {
		packages(this.getClass().getPackage().getName());
//		packages("com.github.kamegu.first");
	}
}
