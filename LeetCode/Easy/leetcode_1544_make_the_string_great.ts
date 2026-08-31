function makeGood(s: string): string {
    let goodString = s;
    while (!isGoodString(goodString)) {
        let stack = [];
        for (let i = 0; i < goodString.length - 1; i++) {
            if (isGoodPair(goodString[i], goodString[i + 1])) {
                stack.push(goodString[i]);
                if (i == goodString.length - 2) {
                    stack.push(goodString[i + 1]);
                }
            } else {
                i += 1;
                if (i == goodString.length - 2) {
                    stack.push(goodString[i + 1]);
                }
            }
        }
        goodString = stack.join("");
    }
    return goodString;
};

function isGoodString(s: string) {
    for (let i = 0; i < s.length - 1; i++) {
        if (!isGoodPair(s[i], s[i + 1])) return false;
    }
    return true;
};

function isGoodPair(a: string, b: string): boolean {
    return !(a !== b && a.toLowerCase() == b.toLowerCase());
};
