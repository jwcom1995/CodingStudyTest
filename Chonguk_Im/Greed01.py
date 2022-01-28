N,M,K = map(int,input().split())
li = list(map(int,input().split()))

li.sort()
li.reverse()
sum=0

first=li[0]
second=li[1]

for i in range(1,M+1):
    if(i % K ==0):
        sum += second
    else:
        sum += first

print(sum)
