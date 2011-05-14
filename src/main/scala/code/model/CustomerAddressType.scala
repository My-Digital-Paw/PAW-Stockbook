package code
package model

import net.liftweb._
import mapper._

class CustomerAddressType extends LongKeyedMapper[CustomerAddressType] with IdPK {
  def getSingleton = CustomerAddressType

  object name extends MappedPoliteString(this, 50)
}

object CustomerAddressType extends CustomerAddressType with LongKeyedMetaMapper[CustomerAddressType] with LongCRUDify[CustomerAddressType]

