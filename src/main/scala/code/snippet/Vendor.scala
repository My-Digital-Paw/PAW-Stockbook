package code
package snippet

import net.liftweb._
import http._
import wizard._
import util._

object Vendor extends Wizard {
  val screen1 = new Screen {
    val name = field("Name", "")
    val balance = field("Balance", 0)
  }

  val screen2 = new Screen {
    val businessAddress = textarea("Business Address", "")
  }

  val screen3 = new Screen {
    val contactName = field("Name", "")
    val contactPhone = field("Phone", "")
    val contactFax = field("Fax", "")
    val contactEmail = field("Email", "")
    val contactWebsite = field("Website", "")
  }

  val screen4 = new Screen {
    val paymentTerm = field("Payment Term", "")
    val taxingScheme = field("Taxing Scheme", "")
    val carrier = field("Carrier", "")
  }

  val screen5 = new Screen {
    val remark = textarea("Remark", "")
  }

  def finish() {
    S.notice("Name: " + screen1.name)
    S.notice("Balance: " + screen1.balance)
    S.notice("Business Address: " + screen2.businessAddress)
    S.notice("Contact Name: " + screen3.contactName)
    S.notice("Contact Phone: " + screen3.contactPhone)
    S.notice("Contact Fax: " + screen3.contactFax)
    S.notice("Contact Email: " + screen3.contactEmail)
    S.notice("Contact Website: " + screen3.contactWebsite)
    S.notice("Payment Term: " + screen4.paymentTerm)
    S.notice("Taxing Scheme: " + screen4.taxingScheme)
    S.notice("Carrier: " + screen4.carrier)
    S.notice("Remark: " + screen5.remark)
  }
}
