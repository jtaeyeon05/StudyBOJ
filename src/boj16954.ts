const input = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n")
    .map((line: string) => line.split(""));

function makeIt(time: number, y: number, x: number) { return 100 * time + 10 * y + x; }

const visited: Set<number> = new Set();
const queue: number[] = [70]; // Time/Y/X

let result = "0";
while (queue.length > 0) {
    const current: number = queue.shift()!!;
    const [time, y, x] = [Math.floor(current / 100), Math.floor(current % 100 / 10), current % 10];

    if (visited.has(current)) continue;
    visited.add(current);

    if (y < time || input[y - time][x] == ".") { // 살았는지 검사
        if (x == 7 && y == 0) {
            result = "1";
            break;
        }
        if (y - 1 > -1 && x - 1 > -1 && (y - 1 < time || input[y - 1 - time][x - 1] == ".") && !visited.has(makeIt(time + 1, y - 1, x - 1))) // 왼위
            queue.push(makeIt(time + 1, y - 1, x - 1));
        if (y - 1 > -1 && (y - 1 < time || input[y - 1 - time][x] == ".") && !visited.has(makeIt(time + 1, y - 1, x))) // 위
            queue.push(makeIt(time + 1, y - 1, x));
        if (y - 1 > -1 && x + 1 < 8 && (y - 1 < time || input[y - 1 - time][x + 1] == ".") && x + 1 < 8 && !visited.has(makeIt(time + 1, y - 1, x + 1))) // 오위
            queue.push(makeIt(time + 1, y - 1, x + 1));

        if (x - 1 > -1 && (y < time || input[y - time][x - 1] == ".") && !visited.has(makeIt(time + 1, y, x - 1))) // 왼
            queue.push(makeIt(time + 1, y, x - 1));
        if (!visited.has(makeIt(time + 1, y, x))) // 그대로
            queue.push(makeIt(time + 1, y, x));
        if (x + 1 < 8  && (y < time || input[y - time][x + 1] == ".") && !visited.has(makeIt(time + 1, y, x + 1))) // 오
            queue.push(makeIt(time + 1, y, x + 1));

        if (y + 1 < 8 && x - 1 > -1 && (y + 1 < time || input[y + 1 - time][x - 1] == ".") && !visited.has(makeIt(time + 1, y + 1, x - 1))) // 왼아
            queue.push(makeIt(time + 1, y + 1, x - 1));
        if (y + 1 < 8 && (y + 1 < time || input[y + 1 - time][x] == ".") && !visited.has(makeIt(time + 1, y + 1, x))) // 아
            queue.push(makeIt(time + 1, y + 1, x));
        if (y + 1 < 8 && x + 1 < 8 && (y + 1 < time || input[y + 1 - time][x + 1] == ".") && x + 1 < 8 && !visited.has(makeIt(time + 1, y + 1, x + 1))) // 오아
            queue.push(makeIt(time + 1, y + 1, x + 1));
        // 아래로
    }
}
process.stdout.write(result);
