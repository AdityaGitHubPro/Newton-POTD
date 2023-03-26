Question Link: https://my.newtonschool.co/playground/code/vhf7nv5hr2ze


import math

def count_unrepresentable(n):
    max_a = int(math.sqrt(n))
    max_b = int(math.log(n, 2))

    ab_set = set()
    for a in range(2, max_a+1):
        for b in range(2, max_b+1):
            ab = a**b
            if ab <= n:
                ab_set.add(ab)

    return n - len(ab_set)

n = int(input())
print(count_unrepresentable(n))
