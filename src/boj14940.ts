const input = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");

const [n, m] = input.shift()?.split(" ").map((x: string) => parseInt(x));
const map: number[][] = input.map((x: string) => x.split(" ").map((x) => parseInt(x)));

const resultMap: number[][] = [];
let startPosition: [number, number] = [0, 0];
for (let i = 0; i < n; i++) {
    let row: number[] = []
    for (let j = 0; j < m; j++) {
        if (map[i][j] === 0) {
            row.push(0);
        } else if (map[i][j] === 1) {
            row.push(-1);
        } else if (map[i][j] === 2) {
            startPosition = [i, j];
            row.push(-1);
        }
    }
    resultMap.push(row);
}

function makeIt(y: number, x: number) { return y * 10_000 + x; }
let queue: [number, number][] = [[makeIt(startPosition[0], startPosition[1]), 0]];

while (queue.length > 0) {
    let current: [number, number] = queue.shift()!!;
    let [cY, cX]: [number, number] = [Math.floor(current[0] / 10_000), current[0] % 10_000];

    if (resultMap[cY][cX] != -1) continue;
    resultMap[cY][cX] = current[1];

    if (cY - 1 > -1 && resultMap[cY - 1][cX] == -1)
        queue.push([makeIt(cY - 1, cX), current[1] + 1]) // 위 추가
    if (cY + 1 < n && resultMap[cY + 1][cX] == -1)
        queue.push([makeIt(cY + 1, cX), current[1] + 1]) // 아래 추가
    if (cX - 1 > -1 && resultMap[cY][cX - 1] == -1)
        queue.push([makeIt(cY, cX - 1), current[1] + 1]) // 왼쪽 추가
    if (cX + 1 < m && resultMap[cY][cX + 1] == -1)
        queue.push([makeIt(cY, cX + 1), current[1] + 1]) // 오른쪽 추가
}

process.stdout.write(resultMap.map((x) => x.join(" ")).join("\n"));
