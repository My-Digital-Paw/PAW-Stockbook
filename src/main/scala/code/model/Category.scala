package code
package model

import net.liftweb._
import mapper._

class Category extends LongKeyedMapper[Category] with IdPK {
  def getSingleton = Category
  object name extends MappedPoliteString(this, 50)
  object parent extends LongMappedMapper(this, Category) 
}

object Category extends Category with LongKeyedMetaMapper[Category] with LongCRUDify[Category]

