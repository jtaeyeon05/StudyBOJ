const [n, k]: number[] = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split(" ")
    .map(Number)

function factorial(num: number): number {
    if (num == 0 || num == 1) return 1
    return num * factorial(num - 1)
}

console.log(factorial(n) / (factorial(k) * factorial(n - k)))
