import sys


def main():
    T = int(sys.stdin.readline())
    for i in range(T):
        data = sys.stdin.readline().rstrip()
        stack = []
        for j in data:
            if j == '(':
                stack.append(j)
            elif j == ')':
                if stack:
                    stack.pop()
                else:
                    print("NO")
                    break
        else:
            if not stack:
                print("YES")
            else:
                print("NO")


if __name__ == "__main__":
    main()