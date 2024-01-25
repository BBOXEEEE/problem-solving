import sys


def main():
    batch = sys.stdin.readline().rstrip()
    stack = []
    result = 0

    for i in range(len(batch)):
        if batch[i] == '(':
            stack.append(batch[i])

        else:
            if batch[i-1] == '(':
                stack.pop()
                result += len(stack)

            else:
                stack.pop()
                result += 1

    print(result)


if __name__ == "__main__":
    main()
