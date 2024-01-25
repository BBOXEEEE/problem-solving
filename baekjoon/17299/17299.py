import sys
from collections import deque, Counter


def main():
    N = int(sys.stdin.readline())
    numbers = list(map(int, sys.stdin.readline().split()))

    NGF = [-1] * N
    frequency = Counter(numbers)
    stack = deque()

    for i in range(N):
        while stack and stack[-1][0] < frequency[numbers[i]]:
            _, idx = stack.pop()
            NGF[idx] = numbers[i]

        stack.append([frequency[numbers[i]], i])

    print(*NGF)


if __name__ == "__main__":
    main()
