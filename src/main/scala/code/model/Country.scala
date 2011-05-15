package code
package model

import net.liftweb._
import mapper._

class Country extends LongKeyedMapper[Country] with IdPK {
  def getSingleton = Country
  
  object country extends MappedPoliteString(this, 50)
  object state extends MappedPoliteString(this, 50)
  object city extends MappedPoliteString(this, 50)
}

object Country extends Country with LongKeyedMetaMapper[Country] with LongCRUDify[Country]

