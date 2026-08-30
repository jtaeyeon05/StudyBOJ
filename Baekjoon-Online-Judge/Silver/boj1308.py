import datetime

a, b = list(map(int, input().split())), list(map(int, input().split()))
c, d = datetime.datetime(a[0], a[1], a[2]), datetime.datetime(b[0], b[1], b[2])

if d >= datetime.datetime(a[0] + 1000, a[1], a[2]):
    print("gg")
else:
    print("D-" + str((d - c).days))
