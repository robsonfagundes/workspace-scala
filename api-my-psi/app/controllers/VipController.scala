package controllers

import models.{Address, DB, Person}
import play.api._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

class VipController extends Controller {

  /**
   *
   * @return
   */
  def index = Action {
    Ok(views.html.index("Api-myPSI"))
  }

  /**
   * mapping form
   *
   */
  val personForm: Form[Person] = Form(
    mapping(
      "name" -> nonEmptyText,
      "address" -> mapping(
        "street" -> text,
        "number" -> number,
        "city" -> text,
        "state" -> text,
        "zip" -> text
      )(Address.apply)(Address.unapply)
    )(Person.apply)(Person.unapply)
  )

  /**
   * add new person
   * @return
   */
  def addPerson = Action { implicit request =>
    val (person) = personForm.bindFromRequest.get
    DB.save(person)
    Redirect(routes.VipController.index)
  }

  /**
   * get all persons
   * @return
   */
  def getPersons = Action {
    val persons = DB.query[Person].fetch()
    Ok(Json.toJson(persons))
  }

}
