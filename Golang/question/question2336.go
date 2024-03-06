/**
 @author: RedCrazyGhost
 @date: 2023/11/29

2336. 无限集中的最小数字

133/135 case
**/

package question

import "sort"

type SmallestInfiniteSet struct {
	count int
	arr   []int
}

func Constructor() SmallestInfiniteSet {
	return SmallestInfiniteSet{count: 1, arr: make([]int, 0)}
}

func (this *SmallestInfiniteSet) PopSmallest() int {
	var i int
	if len(this.arr) == 0 {
		i = this.count
		this.count += 1
		return i
	}
	sort.Ints(this.arr)
	i = this.arr[0]
	this.arr = this.arr[1:]
	return i

}

func (this *SmallestInfiniteSet) AddBack(num int) {
	if num < this.count {
		this.arr = append(this.arr, num)
	}
}
