package code
package model

import net.liftweb._
import mapper._

class VendorAddress extends LongKeyedMapper[VendorAddress] with IdPK {
  def getSingleton = VendorAddress

  object vendor extends MappedLongForeignKey(this, Vendor)
  object addressName extends MappedPoliteString(this, 50)
  object street extends MappedPoliteString(this, 100)
  object city extends MappedPoliteString(this, 50)
  object stateProvince extends MappedPoliteString(this, 50)
  object country extends MappedCountry(this)
  object zipPostalCode extends MappedPostalCode(this, country)
  object remark extends MappedPoliteString(this, 200)
  object addressType extends MappedLongForeignKey(this, AddressType)
}

object VendorAddress extends VendorAddress with LongKeyedMetaMapper[VendorAddress] with LongCRUDify[VendorAddress]

