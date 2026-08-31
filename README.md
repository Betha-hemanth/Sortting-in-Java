# 🔄 Sorting Algorithms in Java

A collection of Java programs to learn and practice **Sorting Algorithms** and understand how different sorting techniques work.

This repository contains Java implementations and examples of sorting concepts, including Bubble Sort and other commonly studied sorting algorithms.

---

## 📚 Table of Contents

- [What is Sorting?](#-what-is-sorting)
- [Why Do We Need Sorting?](#-why-do-we-need-sorting)
- [Sorting Algorithms](#-sorting-algorithms)
- [Bubble Sort](#-bubble-sort)
- [Selection Sort](#-selection-sort)
- [Insertion Sort](#-insertion-sort)
- [Merge Sort](#-merge-sort)
- [Quick Sort](#-quick-sort)
- [Time Complexity Comparison](#-time-complexity-comparison)
- [Example](#-example)
- [Technologies Used](#-technologies-used)
- [Learning Goals](#-learning-goals)
- [Future Topics](#-future-topics)
- [Author](#-author)

---

## 🧠 What is Sorting?

Sorting is the process of arranging data in a particular order.

The most common forms of sorting are:

- **Ascending Order**
- **Descending Order**

### Example

Before sorting:

```text
[5, 2, 8, 1, 3]
```

After sorting in ascending order:

```text
[1, 2, 3, 5, 8]
```

After sorting in descending order:

```text
[8, 5, 3, 2, 1]
```

---

## 🤔 Why Do We Need Sorting?

Sorting makes data easier to:

- Search
- Analyze
- Organize
- Process
- Display

Sorting is also an important concept in **Data Structures and Algorithms**.

---

## 🔢 Sorting Algorithms

Some commonly studied sorting algorithms are:

| Algorithm | Best Case | Average Case | Worst Case |
|---|---:|---:|---:|
| Bubble Sort | `O(n)` | `O(n²)` | `O(n²)` |
| Selection Sort | `O(n²)` | `O(n²)` | `O(n²)` |
| Insertion Sort | `O(n)` | `O(n²)` | `O(n²)` |
| Merge Sort | `O(n log n)` | `O(n log n)` | `O(n log n)` |
| Quick Sort | `O(n log n)` | `O(n log n)` | `O(n²)` |

---

## 🫧 Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

### Example

```text
Before:

[5, 3, 8, 1, 2]

Compare 5 and 3
↓
[3, 5, 8, 1, 2]

Compare 5 and 8
↓
[3, 5, 8, 1, 2]

Compare 8 and 1
↓
[3, 5, 1, 8, 2]

Continue until the array is sorted.
```

### Final Result

```text
[1, 2, 3, 5, 8]
```

### Complexity

- Best Case: `O(n)`
- Average Case: `O(n²)`
- Worst Case: `O(n²)`
- Space: `O(1)`

---

## 🎯 Selection Sort

Selection Sort repeatedly finds the smallest element from the unsorted portion and places it at the correct position.

### Example

```text
Array:

[5, 3, 8, 1, 2]

Find minimum → 1

[1, 3, 8, 5, 2]

Find minimum from remaining elements → 2

[1, 2, 8, 5, 3]

Continue until sorted.
```

### Final Result

```text
[1, 2, 3, 5, 8]
```

### Complexity

- Best Case: `O(n²)`
- Average Case: `O(n²)`
- Worst Case: `O(n²)`
- Space: `O(1)`

---

## 📝 Insertion Sort

Insertion Sort builds the sorted array one element at a time.

It works similarly to arranging playing cards in your hand.

### Example

```text
[5, 3, 8, 1, 2]

Start:

[5]

Insert 3:

[3, 5]

Insert 8:

[3, 5, 8]

Insert 1:

[1, 3, 5, 8]

Insert 2:

[1, 2, 3, 5, 8]
```

### Complexity

- Best Case: `O(n)`
- Average Case: `O(n²)`
- Worst Case: `O(n²)`
- Space: `O(1)`

---

## 🔀 Merge Sort

Merge Sort is a **divide-and-conquer** sorting algorithm.

It divides the array into smaller parts, sorts them, and then merges them back together.

### Process

```text
             [5, 3, 8, 1, 2]
                    ↓
              Divide Array
                 /     \
             [5, 3]   [8, 1, 2]
              /  \      /     \
            [5] [3]   [8]   [1, 2]

                    ↓
                  Merge
                    ↓
             [1, 2, 3, 5, 8]
```

### Complexity

- Best Case: `O(n log n)`
- Average Case: `O(n log n)`
- Worst Case: `O(n log n)`
- Space: `O(n)`

---

## ⚡ Quick Sort

Quick Sort is another **divide-and-conquer** sorting algorithm.

It selects a **pivot** and places smaller elements on one side and larger elements on the other side.

### Example

```text
Array:

[5, 3, 8, 1, 2]

Choose pivot:

5

Smaller elements:

[3, 1, 2]

Larger elements:

[8]

After partitioning:

[3, 1, 2]  5  [8]
```

The same process is applied recursively to the smaller sections.

### Complexity

- Best Case: `O(n log n)`
- Average Case: `O(n log n)`
- Worst Case: `O(n²)`
- Space: `O(log n)` average for a recursive implementation

---

## 📊 Time Complexity Comparison

| Sorting Algorithm | Best | Average | Worst | Space |
|---|---:|---:|---:|---:|
| Bubble Sort | `O(n)` | `O(n²)` | `O(n²)` | `O(1)` |
| Selection Sort | `O(n²)` | `O(n²)` | `O(n²)` | `O(1)` |
| Insertion Sort | `O(n)` | `O(n²)` | `O(n²)` | `O(1)` |
| Merge Sort | `O(n log n)` | `O(n log n)` | `O(n log n)` | `O(n)` |
| Quick Sort | `O(n log n)` | `O(n log n)` | `O(n²)` | `O(log n)` |

---

## 🧮 Example

Consider the following array:

```text
[9, 4, 7, 2, 5, 1]
```

After sorting in ascending order:

```text
[1, 2, 4, 5, 7, 9]
```

After sorting in descending order:

```text
[9, 7, 5, 4, 2, 1]
```

---

## 🔁 Sorting Process

A typical sorting process can be represented as:

```text
Unsorted Array
      ↓
Choose Sorting Algorithm
      ↓
Compare / Divide Elements
      ↓
Rearrange Elements
      ↓
Repeat
      ↓
Sorted Array
```

---

## 💻 Java Example

A simple Bubble Sort implementation:

```java
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

### Output

```text
1 2 3 5 8
```

---

## 🛠️ Technologies Used

- ☕ Java
- 💻 IntelliJ IDEA
- 🔧 Git
- 🐙 GitHub

---

## 🎯 Learning Goals

This repository helps me practice:

- Understanding sorting algorithms
- Writing sorting algorithms from scratch
- Understanding arrays
- Understanding loops
- Understanding swapping
- Understanding divide and conquer
- Understanding recursion
- Comparing algorithm efficiency
- Understanding time complexity
- Improving problem-solving skills in Java

---

## 📈 Learning Progress

```text
Basic Sorting
      ↓
Bubble Sort
      ↓
Selection Sort
      ↓
Insertion Sort
      ↓
Merge Sort
      ↓
Quick Sort
      ↓
Advanced Sorting Algorithms
```

---

## 🚀 Future Topics

More Data Structures and Algorithms will be added as I continue learning Java.

Planned topics include:

- Binary Search
- Recursion
- Arrays
- Strings
- Linked Lists
- Stacks
- Queues
- Trees
- Heaps
- Hashing
- Graphs
- Dynamic Programming

---

## 👨‍💻 Author

**Betha Hemanth**

This repository is part of my journey to learn **Java and Data Structures & Algorithms**.

---

⭐ If you find this repository useful, feel free to explore the code and follow my learning journey.
