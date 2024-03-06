/**
 @author: RedCrazyGhost
 @date: 2023/11/5

**/

package question

import "math"

func findMaximumXOR(nums []int) int {
	max := 0
	for i := 0; i < len(nums); i++ {
		for j := i; j < len(nums); j++ {
			max = int(math.Max(float64(max), float64(nums[i]^nums[j])))
		}
	}
	return max
}
