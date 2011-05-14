package code
package model

import net.liftweb._
import mapper._

class VendorAddress extends LongKeyedMapper[VendorAddress] with IdPK {
  def getSingleton = VendorAddress

  object vendorId extends MappedLongForeignKey(this, Vendor)
  object addressName extends MappedPoliteString(this, 50)
  object street extends MappedPoliteString(this, 100)
  object city extends MappedPoliteString(this, 50)
  object stateProvince extends MappedPoliteString(this, 50)
  object country extends MappedPoliteString(this, 50)
  object zipPostalCode extends MappedPoliteString(this, 10)
  object remark extends MappedPoliteString(this, 200)
  object vendorAddressType extends MappedLongForeignKey(this, VendorAddressType)
}

object VendorAddress extends VendorAddress with LongKeyedMetaMapper[VendorAddress] with LongCRUDify[VendorAddress]

