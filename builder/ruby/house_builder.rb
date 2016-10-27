require_relative 'house'

class HouseBuilder
  attr_accessor :house

  def initialize
    @house = House.new
  end

  def number_of_floors(floors)
    @house.number_of_floors = floors
  end

  def number_of_rooms(rooms)
    @house.number_of_rooms = rooms
  end

  def number_of_windows(windows)
    @house.number_of_windows = windows
  end

  def house
    @house
  end
end

require 'minitest/autorun'

class Tests < Minitest::Unit::TestCase
  def test_number_of_floors
    builder = HouseBuilder.new
    builder.number_of_floors(2)
    assert_equal 2, builder.house.number_of_floors
  end

  def test_number_of_rooms
    builder = HouseBuilder.new
    builder.number_of_rooms(3)
    assert_equal 3, builder.house.number_of_rooms
  end

  def test_number_of_floors
    builder = HouseBuilder.new
    builder.number_of_windows(4)
    assert_equal 4, builder.house.number_of_windows
  end
end