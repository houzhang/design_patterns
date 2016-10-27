require_relative 'document'

class XmlDocument < Document
  def print
    'I am xml document'
  end
end

require 'minitest/autorun'

class Tests < MiniTest::Unit::TestCase
  def test_print
    assert_equal 'I am xml document', XmlDocument.new.print
  end
end