package code
package model

import net.liftweb._
import mapper._

class PurchaseOrder extends LongKeyedMapper[PurchaseOrder] with IdPK {
  def getSingleton = PurchaseOrder

  object orderNum extends MappedPoliteString(this, 10)
  object date extends MappedDate(this)
  object status extends MappedInt(this)
  
  object vendor extends MappedLongForeignKey(this, Vendor)
  object contact extends MappedPoliteString(this, 100)
  object phone extends MappedPoliteString(this, 20)
  object address extends MappedPoliteString(this, 200)
  
  object location extends MappedLongForeignKey(this, Location)
  
  object paymentMethod extends MappedLongForeignKey(this, PaymentMethod)
  object taxingScheme extends MappedLongForeignKey(this, TaxingScheme)
  object nonVendorCosts extends MappedDouble(this)
  object currency extends MappedLongForeignKey(this, Currency)
  
  object remarks extends MappedPoliteString(this, 300)
  
  object subTotal extends MappedDouble(this)
  object total extends MappedDouble(this)
  object paid extends MappedDouble(this)
  object balance extends MappedDouble(this)
}

object PurchaseOrder extends PurchaseOrder with LongKeyedMetaMapper[PurchaseOrder] with LongCRUDify[PurchaseOrder]

