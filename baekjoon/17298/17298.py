import sys
from collections import deque


def main():
    N = int(sys.stdin.readline())
    numbers = list(map(int, sys.stdin.readline().split()))

    NGE = [-1] * N
    stack = deque()

    for i in range(N):
        while stack and stack[-1][0] < numbers[i]:
            _, idx = stack.pop()
            NGE[idx] = numbers[i]

        stack.append([numbers[i], i])

    print(*NGE)


if __name__ == "__main__":
    main()
