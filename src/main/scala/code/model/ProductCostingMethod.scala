package code
package model

import net.liftweb._
import mapper._

class ProductCostingMethod extends LongKeyedMapper[ProductCostingMethod] with IdPK {
  def getSingleton = ProductCostingMethod

  object name extends MappedPoliteString(this, 50)
}

object ProductCostingMethod extends ProductCostingMethod with LongKeyedMetaMapper[ProductCostingMethod] with LongCRUDify[ProductCostingMethod]
