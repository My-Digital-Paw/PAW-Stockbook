package code
package model

import net.liftweb._
import mapper._

class SalesRep extends LongKeyedMapper[SalesRep] with IdPK {
  def getSingleton = SalesRep
  
  object name extends MappedPoliteString(this, 50)
}

object SalesRep extends SalesRep with LongKeyedMetaMapper[SalesRep] with LongCRUDify[SalesRep]

