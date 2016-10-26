require_relative 'abstract_factory'
require_relative 'xml_document'
require_relative 'xml_document_factory'

class XmlDocumentFactory < AbstractFactory
  def get_document
    XmlDocument.new
  end
end

require 'minitest/autorun'

class Tests < MiniTest::Unit::TestCase
  def test_get_document
    assert_equal 'XmlDocument', XmlDocumentFactory.new.get_document.class.to_s
  end
end