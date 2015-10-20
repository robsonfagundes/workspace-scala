package models

import sorm._

/**
 * Created by robsonfagundes
 */
object DB extends Instance(

  entities = Set()
    + Entity[Person]()
    + Entity[Address](unique = Set() + Seq("name")),

  url = "jdbc:h2:mem:test"

)