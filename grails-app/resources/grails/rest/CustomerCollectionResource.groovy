package grails.rest

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.POST
import javax.ws.rs.core.Response

@Path('/api/customer')
@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class CustomerCollectionResource {

    def customerResourceService
    
    @POST
    Response create(Customer dto) {
        created customerResourceService.create(dto)
    }

    @GET
    Response readAll() {
        ok customerResourceService.readAll()
    }
    
    @Path('/{id}')
    CustomerResource getResource(@PathParam('id') Long id) {
        new CustomerResource(customerResourceService: customerResourceService, id:id)
    }
        
}
