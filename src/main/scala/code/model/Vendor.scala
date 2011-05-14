package code
package model

import net.liftweb._
import mapper._

class Vendor extends LongKeyedMapper[Vendor] with IdPK {
  def getSingleton = Vendor
  
  // basic information
  object name extends MappedPoliteString(this, 100)
  object balance extends MappedInt(this)
  
  // business address is stored in another model

  // contact information
  object person extends MappedPoliteString(this, 100)
  object phone extends MappedPoliteString(this, 20)
  object fax extends MappedPoliteString(this, 20)
  object email extends MappedPoliteString(this, 100)
  object website extends MappedPoliteString(this, 100)

  // purchasing information
  object paymentTerms extends MappedLongForeignKey(this, VendorPaymentTerm)
  object taxingScheme extends MappedLongForeignKey(this, TaxingScheme)
  object carrier extends MappedPoliteString(this, 50)
  object currency extends MappedPoliteString(this, 50)

  // remarks
  object remark extends MappedPoliteString(this, 500)
}

object Vendor extends Vendor with LongKeyedMetaMapper[Vendor]
