package controllers

import com.github.casuallyblue.cucm.*
import play.libs.Json
import play.mvc.*
import javax.inject.Inject
import javax.xml.ws.BindingProvider

/**
 * Main Controller for CUCM Rest service
 */
class CUCMRestController @Inject constructor(service: AXLAPIService): Controller() {
    /**
     * AXL Client (generated by wsimport)
     */
    val client: AXLPort = service.axlPort

    /**
     * Set the username and password of the axl service
     */
    init {
        (client as BindingProvider).requestContext.let {
            it[BindingProvider.ENDPOINT_ADDRESS_PROPERTY] = "https://cdacucmpub.coramdeo.local:8443/axl/"
            it[BindingProvider.USERNAME_PROPERTY] = "cdaadmin"
            it[BindingProvider.PASSWORD_PROPERTY] = "cdaadmpw"
        }

    }

    /**
     * Get Json of all phones configured on the CUCM system
     */
    fun getPhones(): Result? {
        return ListPhoneReq()
            .let { req ->
                ListPhoneReq.SearchCriteria()
                    .let { sc ->
                        sc.name = "%"
                        sc
                    }.also { req.searchCriteria = it }
                client.listPhone(req)
                    .`return`.phone.let {
                        ok(Json.newObject().putPOJO("phones", Json.toJson(it)))
                    }
            }
    }

    /**
     * Test of kotlin view template
     */
    fun testView(): Result {
        return views.TestView.render()
    }
}