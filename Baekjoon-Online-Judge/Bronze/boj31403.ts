let u = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");
let u2 = u.map((it: string) => parseInt(it));
process.stdout.write((u2[0] + u2[1] - u2[2]).toString() + "\n");
process.stdout.write((parseInt(u[0] + u[1]) - u2[2]).toString());
