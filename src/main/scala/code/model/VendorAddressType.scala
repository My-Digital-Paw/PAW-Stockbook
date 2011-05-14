package code
package model

import net.liftweb._
import mapper._

class VendorAddressType extends LongKeyedMapper[VendorAddressType] with IdPK {
  def getSingleton = VendorAddressType

  object name extends MappedPoliteString(this, 50)
}

object VendorAddressType extends VendorAddressType with LongKeyedMetaMapper[VendorAddressType] with LongCRUDify[VendorAddressType]

