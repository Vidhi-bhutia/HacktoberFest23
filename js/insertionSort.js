function insertionSort(arr) {
  let n = arr.length;
  for (let i = 1; i < n; i++) {
    let key = arr[i];
    let j = i - 1;
    while (j >= 0 && arr[j] > key) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = key;
  }
}

// Example of usage:
let arr = [64, 34, 25, 12, 22, 11, 90];
insertionSort(arr);
console.log("Array sorted with Insertion Sort:", arr);
