/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    const promise_array = await Promise.all([promise1, promise2])
    return new Promise((resolve , reject) => {
        resolve(promise_array[0] + promise_array[1])
    })
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */