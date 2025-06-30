const chat_list = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n")
    .slice(1)

let time: number = 0
let people_list: Set<string> = new Set<string>()

for (let chat of chat_list) {
    if (chat === "ENTER") {
        time += people_list.size
        people_list.clear()
    } else {
        people_list.add(chat)
    }
}
time += people_list.size

console.log(time)
