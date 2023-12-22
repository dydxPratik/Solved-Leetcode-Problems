/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const returned_array = []
    for(let i = 0; i < arr.length; i++){
        let val = fn(arr[i] , i);
        if(val){
            returned_array.push(arr[i])
        }
    }

    return returned_array;
};