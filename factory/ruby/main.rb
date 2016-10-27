require_relative 'document_factory'
require_relative 'json_document'
require_relative 'xml_document'

xml_document = DocumentFactory.new.get_document('XML')
puts xml_document.print

json_document = DocumentFactory.new.get_document('JSON')
puts json_document.print



