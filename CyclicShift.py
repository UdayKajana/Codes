def getDecimal(temp):
    p=0
    for i in range(len(temp)):
        p=p+pow(2, i)
    print(reversed(temp),p)
    print("")

def solve(s):
    l = list()
    place = 0
    for i in range(len(s)-1,-1,-1):
        sum = 0
        temp = s[i+1:]
        temp = temp+s[0:i+1]
        getDecimal(temp)

T = int(input())
while (T > 0):
    l = list()
    T = T-1
    n, k = map(int, input().split())
    s = input()
    s=s.replace(" ","")
    solve(s)
