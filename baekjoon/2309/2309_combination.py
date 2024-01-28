import itertools


def main():
    dwarfs = [int(input()) for _ in range(9)]

    for i in itertools.combinations(dwarfs, 7):
        if sum(i) == 100:
            for dwarf in sorted(i):
                print(dwarf)
            break


if __name__ == "__main__":
    main()
