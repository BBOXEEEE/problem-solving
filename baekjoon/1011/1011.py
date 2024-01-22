import sys
import math


def solve(x, y) -> int:
    n = 1
    distance = y - x
    pos = 1

    while pos < distance:
        n += 1
        pos += math.trunc(n/2)
    if pos > distance:
        n -= 1
    return n


def main():
    T = int(sys.stdin.readline())

    for i in range(T):
        x, y = map(int, sys.stdin.readline().split())
        print(solve(x, y))


if __name__ == "__main__":
    main()
