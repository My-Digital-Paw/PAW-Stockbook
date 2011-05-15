package code
package model

import net.liftweb._
import mapper._

class CompanyInfo extends LongKeyedMapper[CompanyInfo] with IdPK {
  def getSingleton = CompanyInfo
  
  object logo extends MappedPoliteString(this, 100)
  object companyName extends MappedPoliteString(this, 100)
  object addressLine1 extends MappedPoliteString(this, 100)
  object addressLine2 extends MappedPoliteString(this, 100)
  object city extends MappedPoliteString(this, 100)
  object stateProvince extends MappedPoliteString(this, 100)
  object country extends MappedCountry(this)
  object zipPostalCode extends MappedPostalCode(this, country)
  object phone extends MappedPoliteString(this, 20)
  object fax extends MappedPoliteString(this, 20)
  object email extends MappedEmail(this, 100)
  object website extends MappedPoliteString(this, 100)
  object miscInfo extends MappedPoliteString(this, 100)
}

object CompanyInfo extends CompanyInfo with LongKeyedMetaMapper[CompanyInfo] with LongCRUDify[CompanyInfo]

