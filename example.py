# Check single argument, print and all alternatives
def func1(x):
	print 1+3, 5-2, 6*4, 4/2, 9%3, 2**3
	return 3

# Check default argument and expressions
def func2(x, y=1):
	func1()
	len(x)
	max(2,4)
	min(3, 6, 9)
	x[y]=1

x=3
x-=1
x/=2
assert(x, 4)

# Comparisons:

if x<2:
	if 1==1:
		if 5<10:
			print 0

if x>=5:
	if x<=10:
		if x!=7:
			print 1
