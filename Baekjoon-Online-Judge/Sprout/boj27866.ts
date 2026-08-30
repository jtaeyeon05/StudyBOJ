let userInput: string[] = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");
process.stdout.write(userInput[0][parseInt(userInput[1]) - 1])