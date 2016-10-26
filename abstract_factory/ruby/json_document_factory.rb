require_relative 'abstract_factory'
require_relative 'json_document'

class JsonDocumentFactory < AbstractFactory
  def get_document
    JsonDocument.new
  end
end

require 'minitest/autorun'

class Tests < MiniTest::Unit::TestCase
  def test_get_document
    assert_equal 'JsonDocument', JsonDocumentFactory.new.get_document.class.to_s
  end
end