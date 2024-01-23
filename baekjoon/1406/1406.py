import sys


def main():
    S = list(sys.stdin.readline().rstrip())
    stack = []
    M = int(sys.stdin.readline().rstrip())

    for _ in range(M):
        command = list(sys.stdin.readline().split())

        if command[0] == 'L':
            if S:
                stack.append(S.pop())

        elif command[0] == 'D':
            if stack:
                S.append(stack.pop())

        elif command[0] == 'B':
            if S:
                S.pop()

        else:
            S.append(command[1])
    S.extend(reversed(stack))
    print(''.join(S))


if __name__ == "__main__":
    main()
