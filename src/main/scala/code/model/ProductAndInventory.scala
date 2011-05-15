package code
package model

import net.liftweb._
import mapper._

class ProductAndInventory extends LongKeyedMapper[ProductAndInventory] with IdPK {
  def getSingleton = ProductAndInventory
  
  // products
  object showProductDescription extends MappedBoolean(this)
  object showUnitsofMeasurements extends MappedBoolean(this)
  object unitTypeLength extends MappedLongForeignKey(this, UnitTypeLength)
  object unitTypeWeight extends MappedLongForeignKey(this, UnitTypeWeight)
  
  // inventory
  object defaultLocation extends MappedLongForeignKey(this, Location)
  object warnAboutNegativeInventory extends MappedBoolean(this)
  object showSublocation extends MappedBoolean(this)
}

object ProductAndInventory extends ProductAndInventory with LongKeyedMetaMapper[ProductAndInventory] with LongCRUDify[ProductAndInventory]

