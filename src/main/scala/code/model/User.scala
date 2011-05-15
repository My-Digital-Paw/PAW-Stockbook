package code
package model

import net.liftweb._
import mapper._
import util._
import common._

/**
 * The singleton that has methods for accessing the database
 */
object User extends User with MetaMegaProtoUser[User] {
  override def dbTableName = "users" // define the DB table name
  override def screenWrap = Full(<lift:surround with="default" at="content">
			       <lift:bind /></lift:surround>)
  // define the order fields will appear in forms and output
  override def fieldOrder = List(id, firstName, lastName, email,
  locale, timezone, password)

  // comment this line out to require email validations
  override def skipEmailValidation = true
}

/**
 * An O-R mapped "User" class that includes first name, last name, password and we add a "Personal Essay" to it
 */
class User extends MegaProtoUser[User] {
  def getSingleton = User // what's the "meta" server
  
  object administrator extends MappedBoolean(this)
  object active extends MappedBoolean(this)
  
  // access right
  object salesOrderView extends MappedBoolean(this)
  object salesOrderEdit extends MappedBoolean(this)
  object customersView extends MappedBoolean(this)
  object customersEdit extends MappedBoolean(this)
  
  object purchaseOrderView extends MappedBoolean(this)
  object purchaseOrderEdit extends MappedBoolean(this)
  object vendorsView extends MappedBoolean(this)
  object vendorsEdit extends MappedBoolean(this)
  
  object workOrderView extends MappedBoolean(this)
  object workOrderEdit extends MappedBoolean(this)
  
  object reorderStockEdit extends MappedBoolean(this)
  object countSheetView extends MappedBoolean(this)
  object countSheetEdit extends MappedBoolean(this)
  object transferStockEdit extends MappedBoolean(this)
  object adjustStockEdit extends MappedBoolean(this)
  object currentStockView extends MappedBoolean(this)
  object historyView extends MappedBoolean(this)
  object productsView extends MappedBoolean(this)
  object productsEdit extends MappedBoolean(this)
  object costInfoView extends MappedBoolean(this)
  object costInfoEdit extends MappedBoolean(this)
  object productCategoryView extends MappedBoolean(this)
  object productCategoryEdit extends MappedBoolean(this)
  
  object reportsView extends MappedBoolean(this)
  
  object companyView extends MappedBoolean(this)
  object companyEdit extends MappedBoolean(this)
  object customizationView extends MappedBoolean(this)
  object customizationEdit extends MappedBoolean(this)
  
  object importEdit extends MappedBoolean(this)
  object exportEdit extends MappedBoolean(this)
  object backupEdit extends MappedBoolean(this)
  object restoreResetEdit extends MappedBoolean(this)
}

