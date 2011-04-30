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
    val remark = textArea("Remark", "")
  }

  def finish() {
    S.notice("Name: " + name)
    S.notice("Balance: " + balance)
    S.notice("Business Address: " + businessAddress)
    S.notice("Contact Name: " + contactName)
    S.notice("Contact Phone: " + contactPhone)
    S.notice("Contact Fax: " + contactFax)
    S.notice("Contact Email: " + contactEmail)
    S.notice("Contact Website: " + contactWebsite)
    S.notice("Payment Term: " + paymentTerm)
    S.notice("Taxing Scheme: " + taxingScheme)
    S.notice("Carrier: " + carrier)
  }
}
