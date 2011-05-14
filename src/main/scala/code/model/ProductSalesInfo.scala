package code
package model

import net.liftweb._
import mapper._

class ProductSalesInfo extends LongKeyedMapper[ProductSalesInfo] with IdPK {
  def getSingleton = ProductSalesInfo

  object productId extends MappedLongForeignKey(this, Product)
  object productPricingCurrencyId extends MappedLongForeignKey(this, ProductPricingCurrency)
  object price extends MappedDouble(this)
}

object ProductSalesInfo extends ProductSalesInfo with LongKeyedMetaMapper[ProductSalesInfo] with LongCRUDify[ProductSalesInfo]
