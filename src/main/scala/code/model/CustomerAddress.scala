package code
package model

import net.liftweb._
import mapper._

class CustomerAddress extends LongKeyedMapper[CustomerAddress] with IdPK {
  def getSingleton = CustomerAddress

  object customerId extends MappedLongForeignKey(this, Customer)
  object addressName extends MappedPoliteString(this, 50)
  object street extends MappedPoliteString(this, 100)
  object city extends MappedPoliteString(this, 50)
  object stateProvince extends MappedPoliteString(this, 50)
  object country extends MappedPoliteString(this, 50)
  object zipPostalCode extends MappedPoliteString(this, 10)
  object remark extends MappedPoliteString(this, 200)
  object customerAddressType extends MappedLongForeignKey(this, CustomerAddressType)
}

object CustomerAddress extends CustomerAddress with LongKeyedMetaMapper[CustomerAddress] with LongCRUDify[CustomerAddress]

