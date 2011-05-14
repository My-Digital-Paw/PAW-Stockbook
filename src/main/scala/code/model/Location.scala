package code
package model

import net.liftweb._
import mapper._

class Location extends LongKeyedMapper[Location] with IdPK {
  def getSingleton = Location

  object name extends MappedPoliteString(this, 50)
}

object Location extends Location with LongKeyedMetaMapper[Location] with LongCRUDify[Location]
