package code
package model

import net.liftweb._
import mapper._
import scala.xml.Text

class Product extends LongKeyedMapper[Product] with IdPK {
  def getSingleton = Product

  // basic
  object itemNameCode extends MappedPoliteString(this, 30)
  object category extends MappedLongForeignKey(this, ProductCategory)
  object productType extends MappedLongForeignKey(this, ProductType)
  object description extends MappedPoliteString(this, 200)

  // picture
  object picture extends MappedPoliteString(this, 100)

  // sales info are stored in ProductSalesInfo

  // costing info
  object costingMethod extends MappedLongForeignKey(this, ProductCostingMethod)
  object cost extends MappedDouble(this)

  // inventory
  object quantityOnHand extends MappedInt(this)
  
  // storage info
  object barcode extends MappedPoliteString(this, 100)
  object reorderPoint extends MappedInt(this)
  object reorderQuantity extends MappedInt(this)
  object defaultLocation extends MappedLongForeignKey(this, Location)
  object lastVendor extends MappedLongForeignKey(this, Vendor)
  
  // unit of measure
  object standardUoM extends MappedLongForeignKey(this, Unit)
  object salesUoM extends MappedLongForeignKey(this, Unit)
  object salesUoMOrigin extends MappedInt(this)
  object salesUoMCopy extends MappedInt(this)
  object purchasingUoM extends MappedLongForeignKey(this, Unit)
  object purchasingUoMOrigin extends MappedInt(this)
  object purchasingUoMCopy extends MappedInt(this)
  
  // measurements
  object length extends MappedInt(this)
  object width extends MappedInt(this)
  object height extends MappedInt(this)
  object weight extends MappedInt(this)
  
  // remarks
  object remarks extends MappedPoliteString(this, 300)
}

object Product extends Product with LongKeyedMetaMapper[Product] with LongCRUDify[Product]

