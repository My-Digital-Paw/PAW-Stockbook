package code
package model

import net.liftweb._
import mapper._

class TaxingScheme extends LongKeyedMapper[TaxingScheme] with IdPK {
  def getSingleton = TaxingScheme
  object name extends MappedPoliteString(this, 50)
  object primaryTaxName extends MappedPoliteString(this, 50)
  object primaryTaxRate extends MappedDouble(this)
  object secondaryTaxName extends MappedPoliteString(this, 50)
  object secondaryTaxRate extends MappedDouble(this)
  object compoundSecondaryTaxOnPrimary extends MappedBoolean(this)
  object taxOnShipping extends MappedBoolean(this)
}

object TaxingScheme extends TaxingScheme with LongKeyedMetaMapper[TaxingScheme] with LongCRUDify[TaxingScheme]

