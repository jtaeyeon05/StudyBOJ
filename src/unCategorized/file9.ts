console.log(2 ** Number(
    require("fs")
        .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
        .toString()
        .trim()
))