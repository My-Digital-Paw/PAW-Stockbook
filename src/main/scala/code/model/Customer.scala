package code
package model

import net.liftweb._
import mapper._

class Customer extends LongKeyedMapper[Customer] with IdPK {
  def getSingleton = Customer
  
  // basic
  object name extends MappedPoliteString(this, 50)
  object balance extends MappedDouble(this)
  
  // address stored in customer address
  
  // contact
  object person extends MappedPoliteString(this, 100)
  object phone extends MappedPoliteString(this, 20)
  object fax extends MappedPoliteString(this, 20)
  object email extends MappedPoliteString(this, 100)
  object website extends MappedPoliteString(this, 100)
  
  // purchasing info
  object pricingCurrency extends MappedLongForeignKey(this, ProductPricingCurrency)
  object discount extends MappedInt(this)
  object paymentTerms extends MappedLongForeignKey(this, CustomerPaymentTerm)
  object taxingScheme extends MappedLongForeignKey(this, TaxingScheme)
  object taxExemptNum extends MappedPoliteString(this, 50)
  
  // remarks
  object remarks extends MappedPoliteString(this, 300)
  
  // preferences
  object carrier extends MappedPoliteString(this, 50)
  
  // credit card
  object cardType extends MappedLongForeignKey(this, CustomerCardType)
  object cardNumber extends MappedPoliteString(this, 20)
  object expirationDate extends MappedDate(this)
  object cardSecurityCode extends MappedPoliteString(this, 20)
}

object Customer extends Customer with LongKeyedMetaMapper[Customer] with LongCRUDify[Customer]

