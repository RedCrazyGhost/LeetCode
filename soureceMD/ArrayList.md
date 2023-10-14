> JDK Version:16.0.1

## 参数
|                名称                 |    类型    |          值           |             解释             |     
|:---------------------------------:|:--------:|:--------------------:|:--------------------------:|
|         serialVersionUID          |   long   | 8683452581122892189L |           用于序列化            |
|         DEFAULT_CAPACITY          |   int    |          10          |         初始话默认容量大小          |
|         EMPTY_ELEMENTDATA         | Object[] |          {}          |           空对象数组            |
| DEFAULTCAPACITY_EMPTY_ELEMENTDATA | Object[] |          {}          | 默认空对象数组，用于了解添加第一个元素时需要扩容多大 |
|            elementData            | Object[] |         null         |            存储数组            |
|               size                |   int    |          0           |          int类型默认值          |


# 构造器
```java
/*
 无参数构造器
*/
public ArrayList() {
    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
}

/*
 传入初始容量参数
 如果 初始容量参数 大于 0 则 创建新的容量数组赋值给elementData
 如果 初始容量参数 等于 0 则 使用默认的空对象数组
 如果 初始容量参数 小雨 0 则 手动触发异常
*/
public ArrayList(int initialCapacity) {
    if (initialCapacity > 0) {
        this.elementData = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
        this.elementData = EMPTY_ELEMENTDATA;
    } else {
        throw new IllegalArgumentException("Illegal Capacity: "+
               initialCapacity);
    }
}

/*
  传入名为c的Collection集合
  将c集合转为名为a对象数组
  a的length赋值给size 并且不等于0
      c.getClass() 运行时获取实际使用的类型
      如果是ArrayList类型则直接把对象数组a赋值给elementData
      如果不是话则使用数组操作工具类Arrays进行复制，把复制后的数组赋值给elementData
  如果size等于0则直接把空的对象数组赋值给elementData
*/
public ArrayList(Collection<? extends E> c) {
    Object[] a = c.toArray();
    if ((size = a.length) != 0) {
        if (c.getClass() == ArrayList.class) {
            elementData = a;
        } else {
            elementData = Arrays.copyOf(a, size, Object[].class);
        }
    } else {
        // replace with empty array.
        elementData = EMPTY_ELEMENTDATA;
    }
}
```

## 添加元素
**modCount**是父类AbstractList中的参数，用于记录列表结构上上修改次数（🤔️似乎与迭代器有关）
```java
/**
 如果传入s等于elementData的数组长度则进行扩容
 扩容后的数组进行赋值
 size也进行+1
 */
private void add(E e, Object[] elementData, int s) {
    if (s == elementData.length)
        elementData = grow();
    elementData[s] = e;
    size = s + 1;
}

/**
 * modCount 记录列表修改次数
 * 数组最右侧插入｜列表最右侧插入
 * 返回true
 * （🤔️返回true有意义吗？用于集合中是否可以存在重复元素，true表示可以重复，false表示不能重复，基于Collection接口）
 */
public boolean add(E e) {
    modCount++;
    add(e, elementData, size);
    return true;
}

/**
 * rangeCheckForAdd(int index) 
 * 判断插入角标是否越界（上边界size，下边界0）
 * 越界则报错IndexOutOfBoundsException
 * 
 * modCount记录变化
 * 
 * 如果size等于elementData长度则进行扩容
 * 
 * System.arraycopy(elementData, index,elementData, index + 1,s - index)
 * 从elementData[index]开始到size-index的长度为止
 * 按顺序从elementData[index+1]开始赋值
 * 在对elementData[index]进行赋值 size+1
 */
public void add(int index, E element) {
    rangeCheckForAdd(index);
    modCount++;
    final int s;
    Object[] elementData;
    if ((s = size) == (elementData = this.elementData).length)
        elementData = grow();
    System.arraycopy(elementData, index,
            elementData, index + 1,
            s - index);
    elementData[index] = element;
    size = s + 1;
}

```

**扩容函数**
```java
/**
 获取elementData的长度作为扩容前的容量
 如果 扩容前的容量大于0 或 elementData不等于默认空对象数组
 则 新的扩容容量由ArraysSupport.newLength完成
 
 ArraysSupport.newLength(int oldLength, int minGrowth, int prefGrowth) 
 核心内容：int newLength = Math.max(minGrowth, prefGrowth) + oldLength;
 
 最小扩容1 最大扩容老容量的一半(oldCapacity >> 1)
 
 然后进行数组数据复制赋值
 
 如果不满足上述条件则会在 默认容量大小和minCapacity中取最大值创建
 
 */
private Object[] grow(int minCapacity) {
    int oldCapacity = elementData.length;
    if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
        int newCapacity = ArraysSupport.newLength(oldCapacity,
                minCapacity - oldCapacity, /* minimum growth */
                oldCapacity >> 1           /* preferred growth */);
        return elementData = Arrays.copyOf(elementData, newCapacity);
    } else {
        return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
    }
}

private Object[] grow() {
    return grow(size + 1);
}
```

## 删除元素
```java
/**
 * 核心删除方法，此方法不做边界检测和删除值返回
 * newSize=size-1
 * 如果newSize要大于i这个角标
 * 则将elementData[i+1]和往右长度newSize-i的长度的元素
 * 赋值给elementData[i]
 * 最后对elementData[size]赋值为null
 */
private void fastRemove(Object[] es, int i) {
    modCount++;
    final int newSize;
    if ((newSize = size - 1) > i)
        System.arraycopy(es, i + 1, es, i, newSize - i);
    es[size = newSize] = null;
}
```

未完待续...
