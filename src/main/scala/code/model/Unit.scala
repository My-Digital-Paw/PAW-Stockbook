package code
package model

import net.liftweb._
import mapper._

class Unit extends LongKeyedMapper[Unit] with IdPK {
  def getSingleton = Unit
  
  object unitOfMeasure extends MappedPoliteString(this, 50)
}

object Unit extends Unit with LongKeyedMetaMapper[Unit] with LongCRUDify[Unit]

