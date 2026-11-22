nums = [10, 20, 30, 40]

x = nums.pop(1)
print(x)       # 20
print(nums)    # [10, 30, 40]

del nums[0]
print(nums)    # [30, 40]

nums.remove(40)
print(nums)    # [30]


###

###/*الوظيفة
#nums.pop(0) يحذف العنصر في الموقع 0 ويُرجع قيمته
#del nums[0] يحذف العنصر في الموقع 0 دون إرجاع قيمته
#nums.remove(20) يحذف أول عنصر قيمته 20*/