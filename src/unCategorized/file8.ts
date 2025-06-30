let seq: number = Number(
    require("fs")
        .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
        .toString()
        .trim()
)

if (seq <= 9) {
    console.log(seq)
} else {
    let digit = 2

    let now: number = 9
    while (digit < 11) {
        function getThat(sum: number, loop: number): number {
            if (loop === 0) return sum
            let innerResult: number = 0
            for (let i: number = 1; i <= sum; i++) {
                innerResult += getThat(i, loop - 1)
            }
            return innerResult
        }

        let that: number = getThat(11 - digit, digit - 1)
        if (now + that >= seq) {
            break
        } else {
            now += that
            digit += 1
        }
    }

    if (digit === 11) {
        console.log(-1)
    } else {
        let result: number[] = []
        for (let i: number = 0; i < digit; i++) result.push(digit - i - 1)
        let index: number = 1
        seq -= now

        while (index != seq) {
            let updatePoint: number = digit - 1
            for (let i: number = 0; i < digit - 1; i++) {
                if (result[digit - i - 2] == result[digit - i - 1] + 1) {
                    updatePoint = digit - i - 2
                } else {
                    break
                }
            }

            result[updatePoint] += 1
            for (let i: number = updatePoint + 1; i < digit; i++) {
                result[i] = digit - i - 1
            }

            index++
        }
        console.log(result.join(""))
    }
}