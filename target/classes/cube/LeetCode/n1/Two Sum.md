[Задача](https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=2nnyvajc)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 
```bash
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

```bash
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
```

```bash
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
```
 
```bash
Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
```

**Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?**

---

Учитывая массив целых чисел nums и целое число target, верните индексы этих двух чисел так, чтобы их сумма равнялась target.

Вы можете предположить, что каждый вход будет иметь ровно одно решение, и не можете использовать один и тот же элемент дважды.

Вы можете возвращать ответы в любом порядке.

 
```bash
Пример 1:

Вход: nums = [2,7,11,15], target = 9
Выход: [0,1]
Пояснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
```

```bash
Пример 2:

Вход: nums = [3,2,4], target = 6
Выход: [1,2]
```

```bash
Пример 3:

Вход: nums = [3,3], target = 6
Выход: [0,1]
```
 
```bash
Ограничения:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Существует только один правильный ответ.
```

**Послесловие: Можете ли вы придумать алгоритм, временная сложность которого меньше O(n2)?**
