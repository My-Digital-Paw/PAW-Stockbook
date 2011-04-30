package code
package snippet

import net.liftweb._
import http._

object Product extends LiftScreen {
  val itemNameCode = field("Item Name/Code", "")
  val category = field("Category", "")
  val description = textarea("Description", "")
  val picture = field("Picture", "")
  val price = field("Price", 0)
  val quantity = field("Quantity", 0)
  
  def finish() {
    S.notice("Item Name / Code: " + itemNameCode)
    S.notice("Category: " + category)
    S.notice("Description: " + description)
    S.notice("Picture: " + picture)
    S.notice("Price: " + price)
    S.notice("Quantity: " + quantity)
  }
}
