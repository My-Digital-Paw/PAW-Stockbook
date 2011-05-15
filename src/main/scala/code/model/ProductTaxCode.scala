package code
package model

import net.liftweb._
import mapper._

class ProductTaxCode extends LongKeyedMapper[ProductTaxCode] with IdPK {
  def getSingleton = ProductTaxCode
  
  object name extends MappedPoliteString(this, 50)
  object code extends MappedPoliteString(this, 30)
  object primaryTaxApplicable extends MappedBoolean(this)
  object secondaryTaxApplicable extends MappedBoolean(this)
}

object ProductTaxCode extends ProductTaxCode with LongKeyedMetaMapper[ProductTaxCode] with LongCRUDify[ProductTaxCode]

