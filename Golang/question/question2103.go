/**
 @author: RedCrazyGhost
 @date: 2023/11/2

**/

package question

func CountPoints(rings string) int {
	var lists [10]int
	for i := 0; i < len(rings); i += 2 {
		switch rings[i] {
		case 'R':
			lists[rings[i+1]-'0'] |= 1
			break
		case 'G':
			lists[rings[i+1]-'0'] |= 2
			break
		case 'B':
			lists[rings[i+1]-'0'] |= 4
			break
		default:
			break
		}
	}
	num := 0
	for _, value := range lists {
		if value == 7 {
			num += 1
		}
	}
	return num
}
