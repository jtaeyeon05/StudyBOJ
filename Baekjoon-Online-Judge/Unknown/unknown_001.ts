const input: string[] = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n")

const m: number = Number(input[0].split(" ")[1])
const whoKnowsList: number[] = input[1].split(" ").slice(1).map(Number)

let result: number = 0

for (let i: number = 0; i < m; i ++) {
    const target: number[] = input[i + 2].split(" ").slice(1).map(Number)
    let flag: boolean = false
    for (let whoKnows of whoKnowsList) {
        if (target.includes(whoKnows)) {
            flag = true
        }
    }
    if (flag) {
        for (let item of target) {
            if (!whoKnowsList.includes(item)) {
                whoKnowsList.push(item)
                i = -1
            }
        }
    }
}

for (let i: number = 0; i < m; i ++) {
    const target: number[] = input[i + 2].split(" ").slice(1).map(Number)
    let flag: boolean = false
    for (let whoKnows of whoKnowsList) {
        if (target.includes(whoKnows)) {
            flag = true
        }
    }
    if (!flag) result += 1
}

console.log(result)
