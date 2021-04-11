package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class SiteController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def home() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.homepage())
  }

  def interests() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.interests())
  }
}
