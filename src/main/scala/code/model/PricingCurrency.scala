package code
package model

import net.liftweb._
import mapper._

class PricingCurrency extends LongKeyedMapper[PricingCurrency] with IdPK {
  def getSingleton = PricingCurrency

  object name extends MappedPoliteString(this, 50)
  object currency extends MappedPoliteString(this, 50)
}

object PricingCurrency extends PricingCurrency with LongKeyedMetaMapper[PricingCurrency] with LongCRUDify[PricingCurrency]
