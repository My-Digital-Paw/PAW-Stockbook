package code
package snippet

import net.liftweb._
import http._
import wizard._
import util._

object Product extends Wizard {
  val screen1 = new Screen {
    val itemNameCode = field("Item Name / Code", "")
    val category = select("Category", "", List())
    val productType = select("Type", "Stockable", List("Stockable Product", "Non-Stockable Product", "Service"))
    val description = textarea("Description", "")
  }

  val screen2 = new Screen {
    val picture = field("Picture", "")
  }

  val screen3 = new Screen {
    val price = field("Price", 0)
  }

  val screen4 = new Screen {
    val costingMethod = select("Costing Method", "Moving Average Cost", List("Moving Average Cost", "Standard", "Manual"))
  }

  val screen5 = new Screen {
    val location = field("Location", "")
    val sublocation = field("Sublocation", "")
    val quantity = field("Quantity", 0)
    val quantityOnHand = field("Quantity on Hand", 0)
  }

  val screen6 = new Screen {
    val barcode = field("Barcode", "")
    val reorderPoint = field("Reorder Point", 0)
    val reorderQuantity = field("Reorder Quantity", 0)
    val defaultLocation = field("Default Location", 0)
    val lastVendor = select("Last Vendor", "A", List("A", "B", "C"))
  }

  val screen7 = new Screen {
    val standardUoM = field("Standard UoM", "")
    val salesUoM = field("Sales UoM", "")
    val purchasingUoM = field("Purchasing UoM", "")
  }

  val screen8 = new Screen {
    val length = field("Length", 0)
    val width = field("Width", 0)
    val height = field("Height", 0)
    val weight = field("Weight", 0)
  }

  val screen9 = new Screen {
    val remarks = textarea("Remarks", "")
  }

  val screen10 = new Screen {
    val customInfo = field("Custom Info", "")
  }

  val screen11 = new Screen {
    val componentItem = field("Component Item", "")
    val description = textarea("Description", "")
    val quantity = field("Quantity", 0)
    val cost = field("Cost", 0)
  }

  val screen12 = new Screen {
    val movementHistory = field("Movement History", "")
  }

  val screen13 = new Screen {
    val orderHistory = field("Order History", "")
  }

  val screen14 = new Screen {
    val status = select("Status", "Active", List("Active", "Inactive"))
  }

  def finish() {
    S.notice("Finished")    
  }
}
