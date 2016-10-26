class AbstractFactory
  def get_document
    raise NotImplementedError
  end
end

require 'minitest/autorun'

class Tests < MiniTest::Unit::TestCase
  def test_get_document
    assert_raises NotImplementedError do
      AbstractFactory.new.get_document
    end
  end
end