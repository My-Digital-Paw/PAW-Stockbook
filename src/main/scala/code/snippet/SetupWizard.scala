package code
package snippet

import net.liftweb._
import http._
import util._
import Helpers._
import wizard._
import scala.collection.mutable.HashMap
import code.model._

object SetupWizard extends Wizard {
  val screen1 = new Screen {
    override def screenTop =
      <div>
        <h2>Setup Wizard - Welcome!</h2>
        <p>Welcome! Thank you for using PAW-Stockbook.</p>
        <p>This short wizard helps you set up Stockbook, but you can always change your options through Settings later on.</p>
        <p>You can also experiment with our sample data to get familiar with the software first.</p>
      </div>
  }
  
  val screen2 = new Screen {
    val logo = field("Logo", "")
    val companyName = field("Company Name", "")
    val addressLine1 = field("Address", "")
    val addressLine2 = field("", "")
    val city = field("City", "")
    val stateProvince = field("State/Province", "")
    val country = field("Country", "")
    val zipPostalCode = field("Zip/Postal Code", "")
    val currency = field("Currency", "")
    val phone = field("Phone", "")
    val fax = field("Fax", "")
    val email = field("Email", "")
    val websiteAddress = field("Website Address", "")
    val miscInfo = field("Misc. Info", "")
    
    override def screenTop =
      <div>
        <h2>Setup Wizard - Company Info</h2>
        <p>Your company information will be shown on printed documents like Invoices and Reports.</p>
      </div>
  }
  
  val screen3 = new Screen {
    val description = radio("", "Yes, I charge two separate taxes", List("No, do not show tax", "Yes, I charge only one tax", "Yes, I charge two separate taxes"))
    
    override def screenTop =
      <div>
        <h2>Setup Wizard - Sales Tax</h2>
        <p>Does your company ever add one or more sales taxes on invoices?</p>
        <p>
          For example:
          <ul>
            <li>UK: No, all taxes are included in prices.</li>
            <li>USA: Yes, I only charge one combined tax to my customers.</li>
            <li>Canada: Yes, I need to charge two separated taxes to my customers.</li>
          </ul>
        </p>
      </div>
  }
  
  val screen4 = new Screen {
    override def screenTop =
      <div>
        <h2>Setup Wizard - Finished!</h2>
        <p>Thank you for taking the time to setup Stockbook. If you need help at any time, you can check out Stockbook's Help Center.</p>
      </div>
  }
  
  def finish() {
    S.notice("Thank you.")
  }
}
