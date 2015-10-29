package models

import play.api.libs.json.Json

/**
 * Created by robsonfagundes
 */
case class Person(name: String, address: Address)

object Person {
  implicit val personFormat = Json.format[Person]
}