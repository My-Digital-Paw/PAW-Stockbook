package code
package snippet

import net.liftweb._
import http._
import util._
import Helpers._
import scala.collection.mutable.HashMap
import code.model._

object CategoryScreen extends LiftScreen {
  object category extends ScreenVar(Category.find(asLong(S.param("id")) openOr 0L) openOr Category.create)
  object parents extends ScreenVar[HashMap[Long, String]](new HashMap[Long, String])

  val name = field("Name", category.get.name.is)
  val parent = select("Parent", category.get.parent.is, parents.get.keys.toList)({t: Long => parents.get.getOrElse(t, "")})

  override def localSetup() {
    Category.findAll.foreach(ctg => parents.get.put(ctg.id, ctg.name.is))
  }

  def finish() {
    category.get.name(name).parent(parent)
    if (category.save) S.notice("Category saved.")
    else S.error("Error while saving...")
  }
}
