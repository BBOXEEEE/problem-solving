import sys


def main():
    S = sys.stdin.readline().rstrip()

    result = []
    reverse = []
    tag = False

    for word in S:
        if word == '<':
            if reverse:
                result.extend(reversed(reverse))
                reverse.clear()

            result.append(word)
            tag = True

        elif word == '>':
            result.append(word)
            tag = False

        elif word == ' ':
            result.extend(reversed(reverse))
            result.append(word)
            reverse.clear()

        else:
            if tag: result.append(word)
            else: reverse.append(word)
    else:
        if reverse: result.extend(reversed(reverse))

    print(''.join(result))


if __name__ == "__main__":
    main()
