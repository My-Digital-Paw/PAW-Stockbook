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
  object country extends MappedCountry(this)
  object zipPostalCode extends MappedPostalCode(this, country)
  object remark extends MappedPoliteString(this, 200)
  object addressType extends MappedLongForeignKey(this, AddressType)
}

object CustomerAddress extends CustomerAddress with LongKeyedMetaMapper[CustomerAddress] with LongCRUDify[CustomerAddress]

