package models

import sorm._

/**
 * Created by robsonfagundes on 04/08/2015.
 */
object DB extends Instance(
  //entities = Set(Entity[Person](), Entity[Address]()),
  entities = Set(Entity[Person]()),
  url = "jdbc:h2:mem:test"
)