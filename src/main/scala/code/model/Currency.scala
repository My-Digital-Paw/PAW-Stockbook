package code
package model

import net.liftweb._
import mapper._

class Currency extends LongKeyedMapper[Currency] with IdPK {
  def getSingleton = Currency
  object name extends MappedPoliteString(this, 50)
}

object Currency extends Currency with LongKeyedMetaMapper[Currency] with LongCRUDify[Currency]

