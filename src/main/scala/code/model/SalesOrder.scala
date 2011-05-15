package code
package model

import net.liftweb._
import mapper._

class SalesOrder extends LongKeyedMapper[SalesOrder] with IdPK {
  def getSingleton = SalesOrder

  object orderNum extends MappedPoliteString(this, 10)
  object date extends MappedDate(this)
  object status extends MappedInt(this)
  
  object customer extends MappedLongForeignKey(this, Customer)
  object contact extends MappedPoliteString(this, 100)
  object phone extends MappedPoliteString(this, 20)
  object address extends MappedPoliteString(this, 200)
  
  object salesRep extends MappedLongForeignKey(this, SalesRep)
  object location extends MappedLongForeignKey(this, Location)
  
  object paymentMethod extends MappedLongForeignKey(this, PaymentMethod)
  object taxingScheme extends MappedLongForeignKey(this, TaxingScheme)
  object pricingCurrency extends MappedLongForeignKey(this, PricingCurrency)
  
  object remarks extends MappedPoliteString(this, 300)
  
  object subTotal extends MappedDouble(this)
  object total extends MappedDouble(this)
  object paid extends MappedDouble(this)
  object balance extends MappedDouble(this)
}

object SalesOrder extends SalesOrder with LongKeyedMetaMapper[SalesOrder] with LongCRUDify[SalesOrder]

