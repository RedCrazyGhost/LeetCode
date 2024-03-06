/**
 @author: RedCrazyGhost
 @date: 2023/11/16

**/

package question

import "math"

func LongestAlternatingSubarray(nums []int, threshold int) int {
	var max int
	for i := 0; i < len(nums); i++ {
		if nums[i]%2 == 0 && nums[i] <= threshold {
			rangeNum := 1
			for j := i; j < len(nums)-1 && nums[j]%2 != nums[j+1]%2 && nums[j+1] <= threshold; j++ {
				rangeNum += 1
			}
			max = int(math.Max(float64(max), float64(rangeNum)))
		}
	}
	return max
}
