package code
package model

import net.liftweb._
import mapper._

class CustomerCardType extends LongKeyedMapper[CustomerCardType] with IdPK {
  def getSingleton = CustomerCardType

  object name extends MappedPoliteString(this, 50)
}

object CustomerCardType extends CustomerCardType with LongKeyedMetaMapper[CustomerCardType] with LongCRUDify[CustomerCardType]

