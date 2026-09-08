function absoluteDiff(arr, num, diff) {
  let count = 0;

  for (let i = 0; i < arr.length; i++) {
    if (Math.abs(arr[i] - num) <= diff) {
      count++;
    }
  }
  return count > 0 ? count : -1;
}

let arr = [12, 3, 14, 56, 77, 13];
let num = 13;
let diff = 2;

console.log(absoluteDiff(arr, num, diff));
