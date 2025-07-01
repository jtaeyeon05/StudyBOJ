const input = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");

const [n, m] = input.shift()?.split(" ").map((x: string) => parseInt(x));
const map: number[][] = input.map((x: string) => x.split("").map((x) => parseInt(x)));

let visited: Set<number> = new Set();
let queue: [number, number][] = [[0, 1]];

function makeIt(y: number, x: number) { return y * 1000 + x; }
while (queue.length > 0) {
    let current: [number, number] = queue.shift()!!;
    let [cY, cX]: number[] = [Math.floor(current[0] / 1000), current[0] % 1000];

    if (visited.has(current[0])) continue;
    visited.add(current[0]);

    if (cY == n - 1 && cX == m - 1) {
        process.stdout.write(current[1].toString());
        break;
    }

    if (cY - 1 > -1 && map[cY - 1][cX] == 1 && !visited.has(makeIt(cY - 1, cX)))
        queue.push([makeIt(cY - 1, cX), current[1] + 1]) // 위 추가
    if (cY + 1 < n && map[cY + 1][cX] == 1 && !visited.has(makeIt(cY + 1, cX)))
        queue.push([makeIt(cY + 1, cX), current[1] + 1]) // 아래 추가
    if (cX - 1 > -1 && map[cY][cX - 1] == 1 && !visited.has(makeIt(cY, cX - 1)))
        queue.push([makeIt(cY, cX - 1), current[1] + 1]) // 왼쪽 추가
    if (cX + 1 < m && map[cY][cX + 1] == 1 && !visited.has(makeIt(cY, cX + 1)))
        queue.push([makeIt(cY, cX + 1), current[1] + 1]) // 오른쪽 추가
}
