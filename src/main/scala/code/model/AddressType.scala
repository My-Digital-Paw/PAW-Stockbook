package code
package model

import net.liftweb._
import mapper._

class AddressType extends LongKeyedMapper[AddressType] with IdPK {
  def getSingleton = AddressType

  object name extends MappedPoliteString(this, 50)
}

object AddressType extends AddressType with LongKeyedMetaMapper[AddressType] with LongCRUDify[AddressType]

