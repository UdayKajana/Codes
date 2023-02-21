for _ in range(int(input())):
    sums = list()
    l = list()
    n, k = map(int, input().split())
    s = input()
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
        