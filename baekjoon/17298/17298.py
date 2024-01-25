import sys


def find(target, numbers):
    for num in numbers:
        if num > target:
            return num
    else:
        return -1


def main():
    N = int(sys.stdin.readline())
    numbers = list(map(int, sys.stdin.readline().split()))
    NGE = []

    for idx, target in enumerate(numbers):
        NGE.append(find(target, numbers[idx+1:]))

    print(*NGE)


if __name__ == "__main__":
    main()
