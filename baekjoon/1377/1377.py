import sys


def solve(N, check) -> int:
    count = 0
    for i in range(N):
        tmp = check[i][0] - i
        count = max(count, tmp)
    return count+1


def main():
    N = int(sys.stdin.readline())
    A = []
    for i in range(N):
        A.append([i, int(sys.stdin.readline())])
    check = sorted(A, key=lambda x: x[1])
    print(solve(N, check))


if __name__ == "__main__":
    main()
