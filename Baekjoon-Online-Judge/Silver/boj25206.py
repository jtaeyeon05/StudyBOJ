big, small = 0, 0
rank_map = {
    "A+": 4.5,
    "A0": 4.0,
    "B+": 3.5,
    "B0": 3.0,
    "C+": 2.5,
    "C0": 2.0,
    "D+": 1.5,
    "D0": 1.0,
    "F": 0.0,
}
for _ in range(20):
    _, size, rank = input().split()
    if rank != "P":
        rank_n = rank_map[rank]
        size_n = float(size)
        big += size_n * rank_n
        small += size_n
print(big / small)
