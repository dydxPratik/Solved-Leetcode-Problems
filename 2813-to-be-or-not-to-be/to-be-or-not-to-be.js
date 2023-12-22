/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    const value = val;
    const res_obj = {
        toBe : (val) =>
         {
            if(val === value)
            {
                return true;                    
            }
            else {
                throw new Error("Not Equal")
            }
        },
        notToBe : (val) =>
        {
            if(val !== value){
                return true;
            }
            else{
                throw new Error("Equal")
            }
        }
    }
    return res_obj;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */