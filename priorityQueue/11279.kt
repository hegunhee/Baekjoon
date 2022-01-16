import heapq
import sys
length = int(input())
queue = []

for i in range(0,length):
    value = int(sys.stdin.readline())
    if value == 0:
        if len(queue) >= 1:
            print(heapq.heappop(queue)[1])
        else:
            print(0)
    else:
        heapq.heappush(queue,(-value,value))
