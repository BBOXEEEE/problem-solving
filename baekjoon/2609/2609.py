import sys


def calculate_lcm(a, b, gcd) -> int:
    return a * b // gcd


def calculate_gcd(a, b) -> int:
    while b > 0:
        a, b = b, a % b
    return a


def main():
    A, B = map(int, sys.stdin.readline().split())
    gcd = calculate_gcd(A, B)
    lcm = calculate_lcm(A, B, gcd)
    print(gcd)
    print(lcm)


if __name__ == "__main__":
    main()
