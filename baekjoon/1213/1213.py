import sys
from collections import Counter


def convert_palindrome(name, counter):
    odd_count = 0
    mid = ''
    for i in counter:
        if counter[i] % 2 != 0:
            odd_count += 1
            mid = i
            name.remove(i)
        if odd_count > 1:
            return "I'm Sorry Hansoo"

    half_palindrome = ''
    for i in range(0, len(name), 2):
        half_palindrome += name[i]

    return half_palindrome + mid + half_palindrome[::-1]


def main():
    name = list(sys.stdin.readline().rstrip())
    name.sort()
    counter = Counter(name)
    print(convert_palindrome(name, counter))


if __name__ == "__main__":
    main()
