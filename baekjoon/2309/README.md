## BOJ #2309

### 문제링크
[https://www.acmicpc.net/problem/2309](https://www.acmicpc.net/problem/2309)

### 풀이
- BruteFroce, 난쟁이 키의 합을 구하고 2명의 키를 뺐을 때 100이 되면 종료
- python `itertools`의 `combinations` 라이브러리를 이용해 9개 중 7개의 조합을 뽑고, 합이 100이 되는지 비교
