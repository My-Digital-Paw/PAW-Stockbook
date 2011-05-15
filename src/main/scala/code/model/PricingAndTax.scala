package code
package model

import net.liftweb._
import mapper._

class PricingAndTax extends LongKeyedMapper[PricingAndTax] with IdPK {
  def getSingleton = PricingAndTax
  
  // pricing
  object currency extends MappedLongForeignKey(this, Currency)
  object defaultPricingCurrency extends MappedLongForeignKey(this, PricingCurrency)
  object useCurrentCost extends MappedBoolean(this)
  
  // tax
  object showTaxes extends MappedBoolean(this)
  object defaultTaxingScheme extends MappedLongForeignKey(this, TaxingScheme)
  object defaultProductTaxCode extends MappedLongForeignKey(this, ProductTaxCode)
  object showProductTax extends MappedBoolean(this)
  object showSecondaryTax extends MappedBoolean(this)
}

object PricingAndTax extends PricingAndTax with LongKeyedMetaMapper[PricingAndTax] with LongCRUDify[PricingAndTax]

