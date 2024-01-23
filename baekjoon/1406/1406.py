import sys


def main():
    S = list(sys.stdin.readline().rstrip())
    M = int(sys.stdin.readline().rstrip())
    cursor = len(S)

    for i in range(M):
        command = list(sys.stdin.readline().split())
        if command[0] == 'L':
            if not cursor == 0:
                cursor -= 1
        elif command[0] == 'D':
            if not cursor == len(S):
                cursor += 1
        elif command[0] == 'B':
            if not cursor == 0:
                S.pop(cursor-1)
                cursor -= 1
        else:
            ch = command[1]
            S.insert(cursor, ch)
            cursor += 1
    print(''.join(S))


if __name__ == "__main__":
    main()
