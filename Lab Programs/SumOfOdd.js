function sumOfOdd(arr)
{
    let sum = 0;

    for(let i =0;i<arr.length;i++)
    {
        if(arr[i]%2 !==0)
        {
            sum = sum + arr[i];
        }

    }
    return sum;
}



console.log(sumOfOdd([1,4,6,7,10,12,11,5]));