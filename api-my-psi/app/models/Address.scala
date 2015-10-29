package models

import play.api.libs.json.Json

/**
 * Created by robsonfagundes
 */
case class Address(street: String, number: Int, city: String, state: String, zip: String)

object Address {
  implicit val addressFormat = Json.format[Address]
}
