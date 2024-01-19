class Solution(object):
    def longestCommonPrefix(self, strs) -> str:
        if not strs: return ""
        if len(strs) == 1: return strs[0]

        strs = sorted(strs)
        result = ""

        for i in range(len(strs[0])):
            if strs[0][i] == strs[-1][i]:
                result += strs[0][i]
            else:
                break

        return result


if __name__ == "__main__":
    solution = Solution()
    print(solution.longestCommonPrefix(["dog", "racecar", "car"]))

