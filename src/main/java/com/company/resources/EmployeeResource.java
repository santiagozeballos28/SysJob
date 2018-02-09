package com.company.resources;

import com.company.logic.EmployeeLogic;
import com.company.model.Employee;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author santiago.mamani
 */
@Path("/employee")
@Produces("application/json")
@Consumes("application/json")
public class EmployeeResource {

    private EmployeeLogic contactoLogic = new EmployeeLogic();

    @POST
    public String insertMovie(Employee employee) {
        return contactoLogic.insert(employee);
    }

    @GET
    @Path("/{id}")
    public Employee get(@PathParam("id") int idEmployee) {
        System.out.println("ESTOY GET");
        return contactoLogic.get(idEmployee);
    }
}
