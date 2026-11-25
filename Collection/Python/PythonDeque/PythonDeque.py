from collections import deque

# إنشاء deque
nums = deque()

# إضافة عناصر في النهاية
nums.append(10)
nums.append(20)
nums.append(30)

# إضافة عنصر في البداية
nums.appendleft(5)

# طباعة القائمة
print(nums)
nums.append(40)
nums.appendleft(1)
print(nums)
nums.popleft()
nums.pop()

print(nums)
nums.pop()
nums.appendleft(5)
nums.popleft()
print(nums)
print(nums[0])       # أول عنصر
print(nums[2])       # العنصر عند index 2
print(nums[-1] )     # آخر عنصر

print(30 in nums)    # التحقق من وجود 30

     