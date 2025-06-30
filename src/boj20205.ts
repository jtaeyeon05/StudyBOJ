let userInput: string[] = require("fs")
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split("\n");

let [n, k] = userInput.shift()!!.split(" ").map((it) => parseInt(it));
let image: number[][] = userInput.map((it) => it.split(" ").map((it) => parseInt(it)));

for (let i = 0; i < n; i++) { // row select
    for (let i_ = 0; i_ < k; i_++) { // row repeat
        for (let j = 0; j < n; j++) { // col select
            for (let j_ = 0; j_ < k; j_++) { // col repeat
                process.stdout.write(`${image[i][j]} `);
            }
        }
        process.stdout.write("\n");
    }
}
