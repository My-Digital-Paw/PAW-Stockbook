package code
package model

import net.liftweb._
import mapper._

class PaymentTerm extends LongKeyedMapper[PaymentTerm] with IdPK {
  def getSingleton = PaymentTerm

  object name extends MappedPoliteString(this, 50)
  object daysDue extends MappedInt(this)
}

object PaymentTerm extends PaymentTerm with LongKeyedMetaMapper[PaymentTerm] with LongCRUDify[PaymentTerm]

