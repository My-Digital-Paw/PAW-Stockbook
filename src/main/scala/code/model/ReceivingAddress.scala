package code
package model

import net.liftweb._
import mapper._

class ReceivingAddress extends LongKeyedMapper[ReceivingAddress] with IdPK {
  def getSingleton = ReceivingAddress

  object addressName extends MappedPoliteString(this, 50)
  object streetLine1 extends MappedPoliteString(this, 100)
  object streetLine2 extends MappedPoliteString(this, 100)
  object city extends MappedPoliteString(this, 50)
  object stateProvince extends MappedPoliteString(this, 50)
  object country extends MappedCountry(this)
  object zipPostalCode extends MappedPostalCode(this, country)
  object remark extends MappedPoliteString(this, 200)
  object addressType extends MappedLongForeignKey(this, AddressType)
}

object ReceivingAddress extends ReceivingAddress with LongKeyedMetaMapper[ReceivingAddress] with LongCRUDify[ReceivingAddress]

