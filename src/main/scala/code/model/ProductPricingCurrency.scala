package code
package model

import net.liftweb._
import mapper._

class ProductPricingCurrency extends LongKeyedMapper[ProductPricingCurrency] with IdPK {
  def getSingleton = ProductPricingCurrency

  object name extends MappedPoliteString(this, 50)
  object currency extends MappedPoliteString(this, 50)
}

object ProductPricingCurrency extends ProductPricingCurrency with LongKeyedMetaMapper[ProductPricingCurrency] with LongCRUDify[ProductPricingCurrency]
