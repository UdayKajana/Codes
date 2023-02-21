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
l = list()

while (T > 0):
    T = T-1
    sums.clear()
    l.clear()
    n, k = map(int, input().split())
    s = input()
    s = s.replace(" ", "")
    for i in range(len(s)):
        sums.append(int(s[i:]+s[0:i+1],2))
    mx=max(sums)
    i=0
    rotations=0
    count=0
    while(True):
        if sums[i]==mx:
            count=count+1
        i=i+1
        if(i==len(sums)):
            i=0
        if(count==k):
            break
        rotations=rotations+1
    print(rotations)
        