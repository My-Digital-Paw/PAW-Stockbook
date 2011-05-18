package code
package model

import net.liftweb._
import mapper._

class CompanyInfo extends LongKeyedMapper[CompanyInfo] with IdPK {
  def getSingleton = CompanyInfo
  
  object logo extends MappedPoliteString(this, 100) {
    override def displayName = "Logo"
  }
  object companyName extends MappedPoliteString(this, 100) {
    override def displayName = "Company Name"
  }
  object addressLine1 extends MappedPoliteString(this, 100) {
    override def displayName = "Address"
  }
  object addressLine2 extends MappedPoliteString(this, 100) {
    override def displayName = ""
  }
  object city extends MappedPoliteString(this, 100) {
    override def displayName = "City"
  }
  object stateProvince extends MappedPoliteString(this, 100) {
    override def displayName = "State/Province"
  }
  object country extends MappedCountry(this) {
    override def displayName = "Country"
  }
  object zipPostalCode extends MappedPostalCode(this, country) {
    override def displayName = "Zip/Postal Code"
  }
  object phone extends MappedPoliteString(this, 20) {
    override def displayName = "Phone"
  }
  object fax extends MappedPoliteString(this, 20) {
    override def displayName = "Fax"
  }
  object email extends MappedEmail(this, 100) {
    override def displayName = "Email"
  }
  object website extends MappedPoliteString(this, 100) {
    override def displayName = "Website"
  }
  object miscInfo extends MappedPoliteString(this, 100) {
    override def displayName = "Misc. Info"
  }
}

object CompanyInfo extends CompanyInfo with LongKeyedMetaMapper[CompanyInfo] with LongCRUDify[CompanyInfo] {
  override def fieldOrder =
    List(logo, companyName, addressLine1, addressLine2, city,
        stateProvince, country, zipPostalCode, phone, fax, email,
        website, miscInfo)
}

