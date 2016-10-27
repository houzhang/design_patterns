require_relative 'house'
require_relative 'house_builder'

# build 10 house with builer
builder = HouseBuilder.new
builder.number_of_floors(2)
builder.number_of_rooms(4)
builder.number_of_windows(10)

house_array = []
10.times { house_array << builder.house.clone }
house_array.each { |house| p house}