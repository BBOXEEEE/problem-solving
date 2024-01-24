import sys


def main():
    N, K = map(int, sys.stdin.readline().split())

    people = [i for i in range(1, N+1)]
    idx = 0
    result = []

    for _ in range(N):
        idx += K-1

        if idx >= len(people):
            idx %= len(people)

        result.append(people.pop(idx))

    print(str(result).replace('[', '<').replace(']', '>'))


if __name__ == "__main__":
    main()