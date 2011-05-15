package code
package model

import net.liftweb._
import mapper._

class ProductType extends LongKeyedMapper[ProductType] with IdPK {
  def getSingleton = ProductType

  object name extends MappedPoliteString(this, 50)
}

object ProductType extends ProductType with LongKeyedMetaMapper[ProductType] with LongCRUDify[ProductType]
