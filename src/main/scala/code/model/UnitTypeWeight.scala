package code
package model

import net.liftweb._
import mapper._

class UnitTypeWeight extends LongKeyedMapper[UnitTypeWeight] with IdPK {
  def getSingleton = UnitTypeWeight
  object name extends MappedPoliteString(this, 50)
}

object UnitTypeWeight extends UnitTypeWeight with LongKeyedMetaMapper[UnitTypeWeight] with LongCRUDify[UnitTypeWeight]

