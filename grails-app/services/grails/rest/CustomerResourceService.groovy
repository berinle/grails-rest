package grails.rest

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class CustomerResourceService {
    
    def create(Customer dto) {
        dto.save()
    }

    def read(def id) {
        def obj = Customer.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Customer.class, id)
        }
        obj
    }
    
    def readAll() {
        Customer.findAll()
    }
    
    def update(Customer dto) {
        def obj = Customer.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Customer.class, dto.id)
        }
        obj.properties = dto.properties 
        obj
    }
    
    void delete(def id) {
        def obj = Customer.get(id)
        if (obj) { 
            obj.delete()
        }
    }
    
}

