package controllers {

  import com.google.inject.Inject
  import io.github.casuallyblue.cucm._
  import play.libs.Json
  import play.mvc.{Controller, Result}
  import play.mvc.Results.ok
  import utils.AXLClient

  class PhoneController @Inject()(client: AXLClient) extends Controller {
    def getPhones: Result = {
      def req = new ListPhoneReq {
        this.setSearchCriteria(
          new ListPhoneReq.SearchCriteria {
            this.setName("%")
          })
      }

      val resp = client.client.listPhone(req).getReturn.getPhone

      ok(Json.toJson(resp))
    }
  }
}
