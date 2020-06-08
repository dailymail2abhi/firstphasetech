package com.tech.firstphase.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.tech.firstphase.config.Students;
import com.tech.firstphase.repository.CassandraRepository;

@Path("/students")
public class StudentResource {
	
	@Autowired
	CassandraRepository cassandra;
	
	/**
	 * This method will fetch Student information based on id passed in parameter
	 * @param id - 
	 * @return - Student Data
	 */
	@GET
	@Path("/{id}")
    @Produces("application/json")
    public Response  getAllUsers(@PathParam("id") int id) {
       
		Students student = cassandra.fetchDataFromCassandra(id);
		
        return Response.ok(student).build();
    }

}
