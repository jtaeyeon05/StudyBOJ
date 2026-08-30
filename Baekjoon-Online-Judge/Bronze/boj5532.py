from math import *

vac = int(input())
kor = int(input())
mat = int(input())
sok = int(input())
som = int(input())

kdy = ceil(kor / sok)
mdy = ceil(mat / som)

print(vac - (kdy if kdy > mdy else mdy))
