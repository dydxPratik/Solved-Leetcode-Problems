/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    const revArr = functions.reverse();
    return function(x) {
         let acc=x;
        for(let i = 0; i < revArr.length; i++) {
            acc = revArr[i](acc);
        }

        return acc;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */