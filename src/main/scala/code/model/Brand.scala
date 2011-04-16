package code
package model

import net.liftweb._
import mapper._

class Brand extends LongKeyedMapper[Brand] with IdPK {
  def getSingleton = Brand
  object name extends MappedPoliteString(this, 50)
}

object Brand extends Brand with LongKeyedMetaMapper[Brand] with LongCRUDify[Brand]

