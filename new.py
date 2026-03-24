num = input("Enter a number: ")

length = len(num)

if length % 2 == 0:
    print("No single middle digit")
else:
    middle = length // 2
    print("Middle digit is", num[middle])