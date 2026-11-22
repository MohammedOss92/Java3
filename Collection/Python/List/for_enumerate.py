nums = [10, 20, 30]
for n in nums:
    print(n)
    
    nums = [10, 20, 30]

for index, value in enumerate(nums):
    print("Index:", index, "Value:", value)
    
    
nums = [10, 20, 30, 40, 50]

# اطبع مجموع العناصر

# اطبع أكبر عنصر

# اطبع أصغر عنصر

# احسب متوسط العناصر
total = 0

for n in nums:
    total += n

print(total) 

maximum = nums[0]
minimum = nums[0]

for n in nums:

    if n > maximum:
        maximum = n

    if n < minimum:
        minimum = n

print("Max:", maximum)
print("Min:", minimum)


average = total / len(nums)

print("Average:", average)
 