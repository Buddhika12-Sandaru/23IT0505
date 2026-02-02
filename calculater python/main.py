from getinput import input_numbers
from validate import validate_data
from average import find_average
from display import dis

a, b, c = input_numbers()
a, b, c = validate_data(a, b, c)
avg, a, b, c = find_average(a, b, c)
dis(a, b, c, avg)
