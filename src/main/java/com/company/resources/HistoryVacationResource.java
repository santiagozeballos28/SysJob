package com.company.resources;

import com.company.logic.HistoryVacationLogic;
import com.company.model.HistoryVacation;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author santiago.mamani
 */
@Path("/historyVacation")
@Produces("application/json")
@Consumes("application/json")
public class HistoryVacationResource {

    private HistoryVacationLogic historyVacationLogic = new HistoryVacationLogic();

    @GET
    @Path("/{id}")
    public List<HistoryVacation> get(@PathParam("id") int idEmployee) {
        return historyVacationLogic.getAllHistory(idEmployee);
    }

    @GET
    @Path("/one/{id}")
    public HistoryVacation getOne(@PathParam("id") int idEmployee) {
        return historyVacationLogic.getOne(idEmployee);
    }
}
