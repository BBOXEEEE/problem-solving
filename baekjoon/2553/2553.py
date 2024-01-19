import sys
import math


def main():
    N = int(sys.stdin.readline())
    factorial = str(math.factorial(N))[::-1]

    for digit in factorial:
        if digit != '0':
            print(digit)
            break


if __name__ == "__main__":
    main()
