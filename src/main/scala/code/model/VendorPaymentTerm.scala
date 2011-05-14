package code
package model

import net.liftweb._
import mapper._

class VendorPaymentTerm extends LongKeyedMapper[VendorPaymentTerm] with IdPK {
  def getSingleton = VendorPaymentTerm

  object name extends MappedPoliteString(this, 50)
  object daysDue extends MappedInt(this)
}

object VendorPaymentTerm extends VendorPaymentTerm with LongKeyedMetaMapper[VendorPaymentTerm] with LongCRUDify[VendorPaymentTerm]

