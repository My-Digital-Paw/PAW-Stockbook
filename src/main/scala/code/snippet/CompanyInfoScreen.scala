package code
package snippet

import net.liftweb._
import http._
import util._
import Helpers._
import scala.collection.mutable.HashMap
import code.model._

object CompanyInfoScreen extends LiftScreen {
  val logo = field("Logo", "")
  val companyName = field("Company Name", "")
  val addressLine1 = field("Address", "")
  val addressLine2 = field("", "")
  val city = select("City", "", List())
  val stateProvince = select("State/Province", "", List())
  val country = select("Country", "", List())
  val zipPostalCode = field("Zip/Postal Code", "")
  val phone = field("Phone", "")
  val fax = field("Fax", "")
  val email = field("Email", "")
  val website = field("Website", "")
  val miscInfo = field("Misc. Info", "")
  
  def finish() {
    S.notice("Saved.")
  }
}
