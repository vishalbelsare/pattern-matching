/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** Tags are defined by the application layer as a taxonomy of user and application concepts,
	 independent of the data sources. This allows application semantics to be re-used with new
	 data, with a minimum of new software design and development. Data layer entity types, link
	 types and properties should be mapped into the list of tags. The application layer must be
	 able to search by native field name or by tag interchangeably, and properties returned must
	 contain both native field names as well as tags.
	 
	 The list of tags may change as application features evolve, though that will require
	 collaboration with the data layer providers. Evolving the tag list should not change the
	 Data Access or Search APIs.

	 This is the current list of tags for Properties: */
@org.apache.avro.specific.AvroGenerated
public enum FL_PropertyTag { 
  ID, TYPE, LABEL, STAT, TEXT, LINKED_DATA, IMAGE, GEO, DATE, AMOUNT, CREDIT, DEBIT, COUNT, SERIES, CONSTRUCTED, RAW  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"FL_PropertyTag\",\"namespace\":\"influent.idl\",\"doc\":\"Tags are defined by the application layer as a taxonomy of user and application concepts,\\r\\n\\t independent of the data sources. This allows application semantics to be re-used with new\\r\\n\\t data, with a minimum of new software design and development. Data layer entity types, link\\r\\n\\t types and properties should be mapped into the list of tags. The application layer must be\\r\\n\\t able to search by native field name or by tag interchangeably, and properties returned must\\r\\n\\t contain both native field names as well as tags.\\r\\n\\t \\r\\n\\t The list of tags may change as application features evolve, though that will require\\r\\n\\t collaboration with the data layer providers. Evolving the tag list should not change the\\r\\n\\t Data Access or Search APIs.\\r\\n\\r\\n\\t This is the current list of tags for Properties:\",\"symbols\":[\"ID\",\"TYPE\",\"LABEL\",\"STAT\",\"TEXT\",\"LINKED_DATA\",\"IMAGE\",\"GEO\",\"DATE\",\"AMOUNT\",\"CREDIT\",\"DEBIT\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}