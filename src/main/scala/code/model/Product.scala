package code
package model

import net.liftweb._
import mapper._

class Product extends LongKeyedMapper[Product] with IdPK {
  def getSingleton = Product
  object category extends MappedLongForeignKey(this, Category)
  object brand extends MappedLongForeignKey(this, Brand)
  object model extends MappedPoliteString(this, 20)
  object name extends MappedPoliteString(this, 100)
  object description extends MappedTextarea(this, 1000)
  object quantity extends MappedInt(this)
}

object Product extends Product with LongKeyedMetaMapper[Product] with LongCRUDify[Product]

