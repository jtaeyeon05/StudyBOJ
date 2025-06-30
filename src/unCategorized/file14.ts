let command_list = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n")
    .slice(1)

class Queue {
    private data: { [key: number]: number } = {}
    private first: number = 0
    private last: number = -1

    push(item: number): void {
        this.last += 1
        this.data[this.last] = item
    }

    pop(): number {
        if (this.first > this.last) return -1
        this.first += 1
        let temp: number = this.data[this.first - 1]
        delete this.data[this.first - 1]
        return temp
    }

    get size(): number {
        return this.last - this.first + 1
    }

    get empty(): number {
        return Number(this.size == 0)
    }

    get front(): number {
        if (this.first > this.last) return -1
        return this.data[this.first]
    }

    get back(): number {
        if (this.first > this.last) return -1
        return this.data[this.last]
    }
}

let queue: Queue = new Queue()
let result_list: number[] = []
for (let command of command_list) {
    if (command.startsWith("push")) {
        queue.push(Number(command.split(" ")[1]))
    } else {
        switch (command) {
            case "pop":
                result_list.push(queue.pop())
                break
            case "size":
                result_list.push(queue.size)
                break
            case "empty":
                result_list.push(queue.empty)
                break
            case "front":
                result_list.push(queue.front)
                break
            case "back":
                result_list.push(queue.back)
                break
        }
    }
}

process.stdout.write(result_list.join("\n"))
