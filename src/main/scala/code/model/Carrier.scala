package code
package model

import net.liftweb._
import mapper._

class Carrier extends LongKeyedMapper[Carrier] with IdPK {
  def getSingleton = Carrier
  object name extends MappedPoliteString(this, 50)
}

object Carrier extends Carrier with LongKeyedMetaMapper[Carrier] with LongCRUDify[Carrier]

