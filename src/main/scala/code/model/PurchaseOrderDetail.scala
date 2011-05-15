package code
package model

import net.liftweb._
import mapper._

class PurchaseOrderDetail extends LongKeyedMapper[PurchaseOrderDetail] with IdPK {
  def getSingleton = PurchaseOrderDetail
  
  object purchaseOrder extends MappedLongForeignKey(this, PurchaseOrder)
  object item extends MappedLongForeignKey(this, Product)
  object description extends MappedPoliteString(this, 100)
  object vendorProductCode extends MappedPoliteString(this, 30)
  object quantity extends MappedInt(this)
  object uoM extends MappedPoliteString(this, 10)
  object unitPrice extends MappedDouble(this)
  object discount extends MappedDouble(this)
  object subTotal extends MappedDouble(this)
}

object PurchaseOrderDetail extends PurchaseOrderDetail with LongKeyedMetaMapper[PurchaseOrderDetail] with LongCRUDify[PurchaseOrderDetail]

