const input = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");

const [a, b] = input.shift()?.split(" ").map((x: string) => parseInt(x));

const visited: Set<number> = new Set();
const queue: [number, number][] = [[a, 1]];

let result = -1;
while (queue.length > 0) {
    let current: [number, number] = queue.shift()!!;

    if (visited.has(current[0])) continue;
    visited.add(current[0]);

    if (current[0] == b) {
        result = current[1];
        break;
    }

    if (!visited.has(current[0] * 2) && current[0] * 2 <= b) queue.push([current[0] * 2, current[1] + 1]);
    if (!visited.has(current[0] * 10 + 1) && current[0] * 10 + 1 <= b) queue.push([current[0] * 10 + 1, current[1] + 1]);
}
process.stdout.write(result.toString());
