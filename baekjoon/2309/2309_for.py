def main():
    dwarfs = [int(input()) for _ in range(9)]

    dwarfs.sort()
    sum_ = sum(dwarfs)

    for i in range(9):
        for j in range(i+1, 9):
            if sum_ - dwarfs[i] - dwarfs[j] == 100:
                for k in range(9):
                    if k == i or k == j:
                        continue
                    print(dwarfs[k])
                exit()


if __name__ == "__main__":
    main()
