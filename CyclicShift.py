def getDecimal(l):
    l = list(reversed(l))
    mult = 1
    sum = 0
    for i in range(len(l)):
        sum = sum+(int(l[i])*mult)
        mult = mult*2
    return sum


T = int(input())
while (T > 0):
    sums = list()
    pos = list()
    l = list()
    T = T-1
    n, k = map(int, input().split())
    s = input()
    s = s.replace(" ", "")
    sums.append(getDecimal(s))
    for i in range(len(s)):
        sums.append(getDecimal(s[i+1:]+s[0:i+1]))
    mx=max(sums)
    for i in range(len(sums)):
        if sums[i] == mx:
            if len(pos)==0:
                pos.append(i)
            else:
                pos.append(pos[-1]-i)
    print(pos)
    
