require_relative 'document'

class JsonDocument < Document
  def print
    'I am json document'
  end
end

require 'minitest/autorun'

class Tests < Minitest::Unit::TestCase
  def test_print
    assert_equal 'I am json document', JsonDocument.new.print
  end
end