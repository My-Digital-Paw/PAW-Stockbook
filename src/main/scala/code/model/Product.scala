package code
package model

import net.liftweb._
import mapper._

class Product extends LongKeyedMapper[Product] with IdPK {
  def getSingleton = Product
  object itemNameCode extends MappedPoliteString(this, 30)
  object description extends MappedPoliteString(this, 500)
  object picture extends MappedPoliteString(this, 100)
  object quantity extends MappedInt(this)
}

object Product extends Product with LongKeyedMetaMapper[Product] with LongCRUDify[Product]

