package controllers

import com.google.inject.Inject
import play.mvc.{Controller, Http, Result}
import play.mvc.Results.{notFound, ok}
import utils.AXLClient

class RoutingController extends Controller {
  @Inject val client: AXLClient = null

  def route(url: String, method: String, request: Http.Request): Result = {
    (method, "/" + url) match {
      case ("get", "/") => ok("Hello World!")
      case ("get", "/phones") => new PhoneController(client).getPhones
      case _ => notFound
    }
  }
}
