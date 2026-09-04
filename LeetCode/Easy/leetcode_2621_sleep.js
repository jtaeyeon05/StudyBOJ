/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    let t = Date.now()
    while (Date.now() - t < millis);
}
