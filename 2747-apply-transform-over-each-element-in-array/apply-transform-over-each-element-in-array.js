/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let ind = 0;
    const returned_array = []
    for(let i = 0; i < arr.length; i++){
        returned_array[i] = fn(arr[i] , i);
    }
    return returned_array;
};