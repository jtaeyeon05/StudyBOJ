const wordmap = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
let [numberB, b] = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split(" ")
b = Number(b)

let number10: number = 0
for (let i: number = 0; i < numberB.length; i++)
    number10 += wordmap.indexOf(numberB[i]) * b ** (numberB.length - i - 1)
console.log(number10)
