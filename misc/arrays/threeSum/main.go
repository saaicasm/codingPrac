package main

import (
	"fmt"
	"sort"
)

func twoSum(arr []int, target, a int, res *[][]int) {
	l, r := 0, len(arr)-1

	for l < r {
		if arr[l]+arr[r] < target {
			l++
		} else if arr[l]+arr[r] > target {
			r--
		} else {
			*res = append(*res, []int{a, arr[l], arr[r]})
			l++
		}
	}
}

func main() {
	array := []int{12, 3, 1, 2, -6, 5, -8, 6}
	targetSum := 0
	var res [][]int

	// Sort the array
	sort.Ints(array)

	for i := 0; i < len(array)-1; i++ {
		a := array[i]
		target := targetSum - a
		arr := array[i+1:]
		twoSum(arr, target, a, &res)
	}

	fmt.Println(res)
}
