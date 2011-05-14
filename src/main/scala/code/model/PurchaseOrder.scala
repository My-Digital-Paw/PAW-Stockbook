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
}

object PurchaseOrder extends PurchaseOrder with LongKeyedMetaMapper[PurchaseOrder] with LongCRUDify[PurchaseOrder]

