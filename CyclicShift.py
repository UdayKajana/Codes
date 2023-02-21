def getDecimal(l):
    l = list(reversed(l))
    mult = 1
    sum = 0
    for i in range(len(l)):
        sum = sum+(int(l[i])*mult)
        mult = mult*2
    return sum


T = int(input())
sums = list()
pos = list()
rel=list()
l = list()

while (T > 0):
    T = T-1
    n, k = map(int, input().split())
    s = input()
    s = s.replace(" ", "")
    for i in range(len(s)):
        sums.append(getDecimal(s[i:]+s[0:i+1]))
    mx=max(sums)
    print(sums)
    for i in range(len(sums)):
        if sums[i]==mx:
            pos.append(i)
    lap=0
    while(True):
        if k>count:
            count=