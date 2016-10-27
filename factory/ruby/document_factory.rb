require_relative 'xml_document'
require_relative 'json_document'

class DocumentFactory
  def get_document(type)
    case type
      when 'XML' then XmlDocument.new
      when 'JSON' then JsonDocument.new
      else
        raise 'must use XML or JSON'
    end
  end
end

require 'minitest/autorun'

class Tests < Minitest::Unit::TestCase
  def test_get_xml_document
    assert_equal 'XmlDocument', DocumentFactory.new.get_document('XML').class.to_s
  end

  def test_get_json_document
    assert_equal 'JsonDocument', DocumentFactory.new.get_document('JSON').class.to_s
  end

  def test_get_document_error
    assert_raises 'must use XML or JSON' do
      DocumentFactory.new.get_document('csv')
    end
  end
end