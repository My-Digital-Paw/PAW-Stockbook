package code
package model

import net.liftweb._
import mapper._

class DocumentNumber extends LongKeyedMapper[DocumentNumber] with IdPK {
  def getSingleton = DocumentNumber
  
  object salesOrderPrefix extends MappedPoliteString(this, 10)
  object salesOrderNextNumber extends MappedInt(this)
  object salesOrderSuffix extends MappedPoliteString(this, 10)
  
  object salesQuotePrefix extends MappedPoliteString(this, 10)
  object salesQuoteNextNumber extends MappedInt(this)
  object salesQuoteSuffix extends MappedPoliteString(this, 10)
  
  object purchaseOrderPrefix extends MappedPoliteString(this, 10)
  object purchaseOrderNextNumber extends MappedInt(this)
  object purchaseOrderSuffix extends MappedPoliteString(this, 10)
  
  object countSheetPrefix extends MappedPoliteString(this, 10)
  object countSheetNextNumber extends MappedInt(this)
  object countSheetSuffix extends MappedPoliteString(this, 10)
  
  object workOrderPrefix extends MappedPoliteString(this, 10)
  object workOrderNextNumber extends MappedInt(this)
  object workOrderSuffix extends MappedPoliteString(this, 10)
}

object DocumentNumber extends DocumentNumber with LongKeyedMetaMapper[DocumentNumber] with LongCRUDify[DocumentNumber]

