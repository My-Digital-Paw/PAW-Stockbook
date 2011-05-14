package code
package model

import net.liftweb._
import mapper._

class PaymentMethod extends LongKeyedMapper[PaymentMethod] with IdPK {
  def getSingleton = PaymentMethod

  object name extends MappedPoliteString(this, 50)
}

object PaymentMethod extends PaymentMethod with LongKeyedMetaMapper[PaymentMethod] with LongCRUDify[PaymentMethod]

