package main

import "math"

func maxDistance(arrays [][]int) int {

	curr := arrays[0]
	n := len(curr)
	minVal := curr[0]
	maxVal := curr[n-1]
	maxAns := 0

	for i := 1; i < len(arrays); i++ {
		curr = arrays[i]
		n = len(curr)

		maxAns = int(math.Max(
			float64(maxAns),
			math.Max(
				math.Abs(float64(curr[n-1]-minVal)),
				math.Abs(float64(maxVal-curr[0])),
			),
		))

		minVal = int(math.Min(float64(minVal), float64(curr[0])))
		maxVal = int(math.Max(float64(maxVal), float64(curr[n-1])))
	}

	return maxAns

}
