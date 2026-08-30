const trace_list = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n")
    .slice(1)

const dance: string[] = ["ChongChong"]
for (let trace of trace_list) {
    const [p1, p2]: string[] = trace.split(" ")
    if (dance.includes(p1) && !dance.includes(p2)) dance.push(p2)
    if (!dance.includes(p1) && dance.includes(p2)) dance.push(p1)
}
console.log(dance.length)
