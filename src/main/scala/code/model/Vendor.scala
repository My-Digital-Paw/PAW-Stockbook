package code
package model

import net.liftweb._
import mapper._

class Vendor extends LongKeyedMapper[Vendor] with IdPK {
  def getSingleton = Vendor
  
  object name extends MappedPoliteString(this, 100)
  object address extends MappedPoliteString(this, 200)
  object person extends MappedPoliteString(this, 100)
  object phone extends MappedPoliteString(this, 20)
  object fax extends MappedPoliteString(this, 20)
  object email extends MappedPoliteString(this, 100)
  object website extends MappedPoliteString(this, 100)
  object remark extends MappedPoliteString(this, 500)
}

object Vendor extends Vendor with LongKeyedMetaMapper[Vendor] {
  override def dbTableName = "vendors"
  override def fieldOrder = List(name, address, person, phone, fax, email, website, remark)
}
