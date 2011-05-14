package code
package model

import net.liftweb._
import mapper._

class ProductInventory extends LongKeyedMapper[ProductInventory] with IdPK {
  def getSingleton = ProductInventory

  object product extends MappedLongForeignKey(this, Product)
  object location extends MappedLongForeignKey(this, Location)
  object quantity extends MappedInt(this)
}

object ProductInventory extends ProductInventory with LongKeyedMetaMapper[ProductInventory] with LongCRUDify[ProductInventory]
