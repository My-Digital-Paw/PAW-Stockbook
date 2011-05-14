package code
package model

import net.liftweb._
import mapper._

class CustomerPaymentTerm extends LongKeyedMapper[CustomerPaymentTerm] with IdPK {
  def getSingleton = CustomerPaymentTerm

  object name extends MappedPoliteString(this, 50)
  object daysDue extends MappedInt(this)
}

object CustomerPaymentTerm extends CustomerPaymentTerm with LongKeyedMetaMapper[CustomerPaymentTerm] with LongCRUDify[CustomerPaymentTerm]

