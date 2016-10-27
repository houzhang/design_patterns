class House
  attr_accessor :number_of_floors, :number_of_rooms, :number_of_windows

  def initialize(number_of_floors=1, number_of_rooms=1, number_of_windows=0)
    @number_of_floors = number_of_floors
    @number_of_rooms = number_of_rooms
    @number_of_windows = number_of_windows
  end
end

require 'minitest/autorun'

class Tests < Minitest::Unit::TestCase
  def test_initialize
    house = House.new
    assert_equal 1, house.number_of_floors
    assert_equal 1, house.number_of_rooms
    assert_equal 0, house.number_of_windows
  end
end