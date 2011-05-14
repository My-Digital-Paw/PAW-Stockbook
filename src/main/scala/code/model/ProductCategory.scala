package code
package model

import net.liftweb._
import mapper._

class ProductCategory extends LongKeyedMapper[ProductCategory] with IdPK {
  def getSingleton = ProductCategory

  object name extends MappedPoliteString(this, 50)
  object parent extends MappedLongForeignKey(this, ProductCategory) 
}

object ProductCategory extends ProductCategory with LongKeyedMetaMapper[ProductCategory] with LongCRUDify[ProductCategory]
