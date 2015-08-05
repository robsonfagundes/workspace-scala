package models

import play.api.libs.json.Json

/**
 * Created by robsonfagundes on 04/08/2015.
 */
case class Person(name: String)
//case class Person(name: String, address : Address)
//case class Address (name : String, street : String, city : String, state : String, zip : String )

object Person {

  implicit val personFormat = Json.format[Person]
 // implicit val addressFormat = Json.format[Address]
}


