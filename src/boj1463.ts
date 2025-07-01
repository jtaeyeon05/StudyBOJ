const n: number = parseInt(
    require("fs")
        .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
        .toString()
        .trim()
);

const queue: [number , number][] = [[n, 0]];
const visited: Set<number> = new Set();

while (queue.length > 0) {
    const [now, time]: [number, number] = queue.shift()!!;

    if (visited.has(now)) continue;
    visited.add(now);

    if (now == 1) {
        process.stdout.write(time.toString());
        break;
    }

    if (now % 3 == 0 && !visited.has(now / 3)) queue.push([now / 3, time + 1]);
    if (now % 2 == 0 && !visited.has(now / 2)) queue.push([now / 2, time + 1]);
    if (!visited.has(now - 1)) queue.push([now - 1, time + 1]);
}
