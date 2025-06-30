const target: number = Number(
    require("fs")
        .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
        .toString()
        .trim()
    )
const list: number[] = [64]

while (target != 64) {
    let last: number = list[list.length - 1]
    let sumExceptLast = -last
    list.forEach((item) => sumExceptLast += item)
    if (sumExceptLast + last / 2 == target) break
    else if (sumExceptLast + last / 2 < target) {
        list.pop()
        list.push(last / 2)
        list.push(last / 2)
    } else {
        list.pop()
        list.push(last / 2)
    }
}

console.log(list.length)
