// function palindrome(str)
// {
//     let rev = "";
//      for(let i=str.length-1;i>=0;i--)
//      {
//         rev += str[i];
//      }
//      if(rev == str)
//      {
//         return true;
//      }
//      else
//      {
//         return false;
//      }
// }
// console.log(palindrome("naman"))


// function factorial(num)
// {
//     let fact = 1;

//     for(let i=1;i<=num;i++)
//     {
//         fact = fact*i;
//     }
//     return fact;
// }
// console.log(factorial(5))

// function prime(n)
// {
//     if(n<=1) return false;

//     for(let i = 2;i*i<=n;i++)
//     {
//         if(n%i===0)
//         {
//             return false;
//         }
//     }
//     return true;
// }
// console.log(prime(3))
// console.log(prime(4))

// function fibo(n)
// {
//     let a = 0,b=1 ,c;
//     console.log(a);
//     console.log(b);

//     for(let i=2;i<=n;i++)
//     {
//        c = a+b;
//        a = b;
//        b = c;
//        console.log(c);
//     }
// }
// fibo(10);

// function anagram(num1,num2)
// {
//     const s1 = String(num1);
//     const s2 = String(num2);

//     if(s1.length !== s2.length) return false;

//     return s1.split('').sort().join('') === s2.split('').sort().join('');
// }

// console.log(anagram(1234,1432));
// console.log(anagram(1234,14325));

// function findLargestSmallestSecondLarget(arr) {
//   let largest = arr[0];
//   let smallest = arr[0];
//   let SecondLargest;
//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] > largest) {
//       largest = arr[i];
//     }
//     if (arr[i] < smallest) {
//       smallest = arr[i];
//     }
//   }
//   for (let i = 0; i < arr.length - 1; i++) {
//     for (let j = i + 1; j < arr.length; j++) {
//       if (arr[i] > arr[j]) {
//         let temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//       }
//     }
//   }
//   let secondLargest = arr[arr.length - 2];

//   return [largest, smallest, secondLargest];
// }
// console.log(findLargestSmallestSecondLarget([1, 4, 6, 2, 7, 9, 3]));

// function findSum(arr)
// {
//     let sum = 0;

//     for(let i=0;i<arr.length;i++)
//     {
//         sum += arr[i];
//     }
//     return sum;
// }
// console.log(findSum([2,5,5,2,2]))

// function revArr(arr)
// {
//     let start = 0;
//     let end = arr.length -1;

//     while(start<end)
//     {
//         let temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] =temp;

//         start++;
//         end--;
//     }
//     return arr;
// }
// console.log(revArr([1,2,5,6]))

function removeDup(arr) {
  let res = [];

  for (let num of arr) {
    if (!res.includes(num)) {
      res.push(num);
    }
  }
  return res;
}
console.log(removeDup([1, 3, 4, 5, 4, 6, 7, 8]));
