require_relative 'json_document_factory'
require_relative 'xml_document_factory'
require_relative 'json_document'
require_relative 'xml_document'

json_document = JsonDocumentFactory.new.get_document
puts json_document.print

xml_document = XmlDocumentFactory.new.get_document
puts xml_document.print

