def main():
    n = int(input())
    sequence = 1
    stack = []
    operation = []

    for i in range(n):
        num = int(input())
        while sequence <= num:
            stack.append(sequence)
            operation.append('+')
            sequence += 1

        if stack[-1] == num:
            stack.pop()
            operation.append('-')
        else:
            print("NO")
            break
    else:
        for op in operation:
            print(op)


if __name__ == "__main__":
    main()
