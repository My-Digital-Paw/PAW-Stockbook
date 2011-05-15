package code
package model

import net.liftweb._
import mapper._

class CurrencyConversion extends LongKeyedMapper[CurrencyConversion] with IdPK {
  def getSingleton = CurrencyConversion
  
  object currency extends MappedLongForeignKey(this, Currency)
  object exchangeRate extends MappedDecimal(this, 1.00)
}

object CurrencyConversion extends CurrencyConversion with LongKeyedMetaMapper[CurrencyConversion] with LongCRUDify[CurrencyConversion]

