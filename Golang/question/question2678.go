/**
 @author: RedCrazyGhost
 @date: 2023/10/23

**/

package question

import "strconv"

func CountSeniors(details []string) int {
	var oldManNum int
	for _, detail := range details {
		age := detail[11:13]
		i, _ := strconv.Atoi(age)
		if i > 60 {
			oldManNum++
		}
	}
	return oldManNum
}
