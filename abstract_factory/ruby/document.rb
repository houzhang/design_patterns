class Document
  def print
    raise NotImplementedError
  end
end

require 'minitest/autorun'

class Tests < MiniTest::Unit::TestCase
  def test_print
    assert_raises NotImplementedError do
      Document.new.print
    end
  end
end