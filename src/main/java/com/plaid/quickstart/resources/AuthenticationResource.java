package com.plaid.quickstart.resources;


import com.plaid.client.PlaidClient;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class AuthenticationResource {

    private PlaidClient plaidClient;

    public AuthenticationResource(PlaidClient plaidClient){
        this.plaidClient = plaidClient;
    }

    @GET
    public Response login(@QueryParam("login") String login, @QueryParam("password") String password){

        System.out.println("print::::::::"+login);
        System.out.println("password:::"+password);
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.append("success", "success");
        }
        catch (Exception e){
            e. printStackTrace();
        }
        return Response.status(200).entity(jsonObject.toString()).build();
    }
}
