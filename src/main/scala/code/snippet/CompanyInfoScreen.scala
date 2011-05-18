package code
package snippet

import net.liftweb._
import http._
import util._
import Helpers._
import scala.collection.mutable.HashMap
import code.model._

object CompanyInfoScreen extends LiftScreen {
  object companyInfo extends ScreenVar(CompanyInfo.find(asLong(1L)) openOr CompanyInfo.create)
  
  addFields(() => companyInfo.is)
  
  def finish() {
    companyInfo.is.save
    S.notice("Saved in the database.")
  }
}
