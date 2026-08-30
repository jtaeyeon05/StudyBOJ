import sys
sys.setrecursionlimit(10 ** 6)

def quick_sort(target, left, right):
    if left < right:
        pivot = partition(target, left, right)
        quick_sort(target, left, pivot)
        quick_sort(target, pivot + 1, right)

def partition(target, left, right):
    pivot = target[left]
    low = left + 1
    high = right
    while low <= high:
        while low <= right and target[low] < pivot: low += 1
        while high >= left and target[high] > pivot: high -= 1
        if low < high:
            target[low], target[high] = target[high], target[low]
    target[left], target[high] = target[high], target[left]
    return high


num_list = [int(input()) for i in range(int(input()))]
quick_sort(num_list, 0, len(num_list) - 1)
for num in num_list: print(num)
