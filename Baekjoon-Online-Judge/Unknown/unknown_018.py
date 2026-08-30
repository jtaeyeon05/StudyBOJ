n, m = map(int, input().split())
board = [list(input()) for _ in range(n)]
result = -1

for x in range(0, n - 7):
    for y in range(0, m - 7):
        repaint = 0
        for xx in range(0, 8):
            for yy in range(0, 8):
                if board[x + xx][y + yy] == "BW"[(xx + yy) % 2]:
                    repaint += 1
        repaint = min(repaint, 64 - repaint)
        if result == -1:
            result = repaint
        else:
            result = min(result, repaint)

print(result)