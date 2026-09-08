function sumReq(r,unit,arr)
{
    if(arr== null) return -1 ;

    let required = r*unit;
    let sum = 0;

    for(let i = 0;i<arr.length;i++)
    {
        sum  += arr[i];


        if(sum>= required)
        {
            return i+1;
        }
    }

    return 0;
}

let r = 7;
let unit = 2;
let arr = [2,8,3,5,7,4,1,2]

console.log(sumReq(r,unit,arr))