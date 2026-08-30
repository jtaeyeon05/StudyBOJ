let userInput: string[] = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("");
let reverseThree: number[] = [0, 7, 4, 1, 8, 5, 2, 9, 6, 3]

let sum: number = 0
let target: number = 0
for (let i = 0; i < 13; i++) {
    if (userInput[i] !== "*") {
        sum += parseInt(userInput[i]) * (i % 2 == 0 ? 1 : 3);
    } else {
        target = i
    }
}

if (sum % 10 == 0) {
    process.stdout.write("0");
} else {
    if (target % 2 == 0) process.stdout.write((10 - sum % 10).toString());
    else process.stdout.write(reverseThree[10 - sum % 10].toString());
}
