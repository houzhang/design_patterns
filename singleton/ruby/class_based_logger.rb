class ClassBasedLogger


  def initialize
    puts 'initialize'
    @@log = File.open('log.txt', 'a')
  end

  def self.instance
    return @@instance
  end

  def log(msg)
    p @@log
    @@log.puts(msg)
  end

  private_class_method :new
end

require 'minitest/autorun'

class Tests < Minitest::Unit::TestCase
  # def test_new
  #   assert_raises NoMethodError do
  #     ClassBasedLogger.new
  #   end
  # end

  def test_log
    logger = ClassBasedLogger.instance
    logger.log('test')
  end
end