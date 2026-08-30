const [n, k]: [number, number] = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split(" ")
    .map((x: string) => parseInt(x));

const queue: [number , number][] = [[n, 0]]; // position, time
const visited: Set<number> = new Set();

while (queue.length > 0) {
    const [position, time]: [number, number] = queue.shift()!!;

    if (visited.has(position)) continue;
    visited.add(position);

    if (position == k) {
        process.stdout.write(time.toString());
        break;
    }

    if (position < k && position <= 50_000 && !visited.has(position * 2)) queue.push([position * 2, time + 1]);
    if (position > 0 && !visited.has(position - 1)) queue.push([position - 1, time + 1]);
    if (position < k && !visited.has(position + 1)) queue.push([position + 1, time + 1]);
}
