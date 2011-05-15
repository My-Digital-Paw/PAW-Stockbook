package code
package model

import net.liftweb._
import mapper._

class UnitTypeLength extends LongKeyedMapper[UnitTypeLength] with IdPK {
  def getSingleton = UnitTypeLength
  object name extends MappedPoliteString(this, 50)
}

object UnitTypeLength extends UnitTypeLength with LongKeyedMetaMapper[UnitTypeLength] with LongCRUDify[UnitTypeLength]

