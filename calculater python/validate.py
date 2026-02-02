import sys

def validate_data(a, b, c):
    valid = all(1 <= x <= 100 for x in (a, b, c))
    if not valid:
        print("Validation Failed! Correct the input...")
        sys.exit()
    else:
        return a, b, c
