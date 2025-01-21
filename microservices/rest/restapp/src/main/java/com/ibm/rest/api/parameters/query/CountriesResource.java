package com.ibm.rest.api.parameters.query;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("countries")
public class CountriesResource {

    @GET
    public String filter(@QueryParam("state") @DefaultValue("TN") String state, @QueryParam("pin") @DefaultValue("000000000") String pin) {
        return "Filter By" + state + pin;
    }
}
