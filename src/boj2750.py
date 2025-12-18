def merge_sort(target, left, right):
    if left < right:
        mid = (left + right) // 2
        merge_sort(target, left, mid)
        merge_sort(target, mid + 1, right)
        merge(target, left, mid, right)

def merge(target, left, middle, right):
    sorted_list = [None] * len(target)
    i = left
    j = middle + 1
    k = left
    while i <= middle and j <= right:
        if target[i] < target[j]:
            sorted_list[k] = target[i]
            i, k = i + 1, k + 1
        else:
            sorted_list[k] = target[j]
            j, k = j + 1, k + 1
    if i > middle:
        sorted_list[k : right + 1] = target[j : right + 1]
    else:
        sorted_list[k : right + 1] = target[i : middle + 1]
    target[left : right + 1] = sorted_list[left : right + 1]


num_list = [int(input()) for i in range(int(input()))]
merge_sort(num_list, 0, len(num_list) - 1)
for num in num_list: print(num)
