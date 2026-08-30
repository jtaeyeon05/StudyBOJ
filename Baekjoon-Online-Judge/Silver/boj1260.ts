const input = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");

const [_, m, v] = input.shift()?.split(" ").map((x: string) => parseInt(x));
const map: Record<number, number[]> = {};

for (let i = 0; i < m; i++) {
    let line = input.shift()!!.split(" ").map((x: string) => parseInt(x));
    if (line[0] in map) map[line[0]].push(line[1]);
    else map[line[0]] = [line[1]];
    if (line[1] in map) map[line[1]].push(line[0]);
    else map[line[1]] = [line[0]];
}

// DFS
const dfsVisited: Set<number> = new Set();
const stack: number[] = [v];

while (stack.length > 0) {
    let current: number = stack.pop()!!;

    if (dfsVisited.has(current)) continue;
    dfsVisited.add(current);

    process.stdout.write(`${current} `);

    if (current in map) {
        let target = map[current].filter((x) => !dfsVisited.has(x)).sort((a, b) => b - a);
        for (let i = 0; i < target.length; i++) stack.push(target[i]);
    }
}
process.stdout.write("\n");

// BFS
const bfsVisited: Set<number> = new Set();
const queue: number[] = [v];

while (queue.length > 0) {
    let current: number = queue.shift()!!;

    if (bfsVisited.has(current)) continue;
    bfsVisited.add(current);

    process.stdout.write(`${current} `);

    if (current in map) {
        let target = map[current].filter((x) => !bfsVisited.has(x)).sort((a, b) => a - b);
        for (let i = 0; i < target.length; i++) queue.push(target[i]);
    }
}
process.stdout.write("\n");
