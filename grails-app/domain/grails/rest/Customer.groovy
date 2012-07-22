package grails.rest

import javax.xml.bind.annotation.*

@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.FIELD)
class Customer {

	@XmlElement
	String firstName
	@XmlElement
	String lastName

    static constraints = {
    	//firstName blank: false
    	//lastName blank: false
    }
}
