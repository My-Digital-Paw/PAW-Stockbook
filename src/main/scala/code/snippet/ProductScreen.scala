package code
package snippet

import net.liftweb._
import http._
import util._
import Helpers._
import scala.collection.mutable.HashMap
import code.model._

object ProductScreen extends LiftScreen {
  val itemNameCode = field("Item Name/Code", "")
  val category = select("Category", "", List())
  val productType = select("Type", "Stockable", List("Stockable", "Non-Stockable", "Service"))
  val description = textarea("Description", "")
  
  val picture = field("Picture", "")
  
  val price = field("Normal Price", 0.00)
  
  val costingMethod = select("Costing Method", "Moving Average Cost", List("Moving Average Cost", "Standard", "Manual"))
  
  val quantityOnHand = field("Quantity on Hand", 0)
  
  def finish() {
    S.notice("Thank you!")
  }
}
