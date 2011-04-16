package code
package model

import net.liftweb._
import mapper._

class Inventory extends LongKeyedMapper[Inventory] with IdPK {
  def getSingleton = Inventory
  object model extends MappedPoliteString(this, 20)
  object name extends MappedPoliteString(this, 100)
  object description extends MappedTextarea(this, 1000)
  object quantity extends MappedInt(this)
}

object Inventory extends Inventory with LongKeyedMetaMapper[Inventory] with LongCRUDify[Inventory]

