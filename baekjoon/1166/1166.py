import sys


def solve(N, L, W, H):
    start, end = 0, max(L, W, H)

    for i in range(10000):
        mid = (start + end) / 2

        if (L//mid) * (W//mid) * (H//mid) >= N:
            start = mid
        else:
            end = mid

    return end


def main():
    N, L, W, H = map(int, sys.stdin.readline().split())
    answer = solve(N, L, W, H)
    print("%.10f" % answer)


if __name__ == "__main__":
    main()
