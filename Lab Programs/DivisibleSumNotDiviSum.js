function diviSum(n, m) {
  let divSum = 0;
  let nonDivSum = 0;

  for (let i = 0; i <= m; i++) {
    if (i % n == 0) {
      divSum = divSum + i;
    } else {
      nonDivSum = nonDivSum + i;
    }
  }

  return nonDivSum - divSum;
}

console.log(diviSum(4, 4));
