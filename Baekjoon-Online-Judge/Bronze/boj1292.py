arr = [i for i in range(1, 46) for ii in range(i)]
inp = list(map(int, input().split()))
print(sum(arr[inp[0]-1:inp[1]]))
