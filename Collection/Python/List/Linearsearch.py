
nums = [10, 20, 30, 40, 50]

target = 30

found = False

for n in nums:

    if n == target:
        found = True
        break

if found:
    print("Found")
else:
    print("Not Found")


nums = [10, 20, 30, 40, 50]

target = 30

found = False

for n in nums:

    if n == target:
        found = True
        break

if found:
    print("Found")
else:
    print("Not Found")


nums = [10, 20, 30, 40, 50]

target = 30
found = False

for index, value in enumerate(nums):

    if value == target:
        found = True
        print("Found at index:", index)
        break

if not found:
    print("Not Found")