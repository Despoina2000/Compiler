import package
from package import package2 as package_renamed

#function call
class C:
    class D:
        def meth(self):
            pass
Class = C

Class.D.meth

#Boolean
State = True
State = False
State = None

#if/elif/else/return/for

if State:
    return 1
elif State is None:
    return 2
else:
    return State

for piece in food:
    print(piece)

#parameter
def func(foo,bar=None):
    return foo

#Strings

string1 = "String1"
string2 = 'String2'

#Arithmetic , Logical , Comparison Operators

Num1 = 10
Num2 = 20

#comp_eqs
Num1 = Num1
Num1 -= Num2
Num1 /= Num2
#comp_types
Num1 < Num2
Num1 > Num2
Num1 >= Num2
Num1 <= Num2
Num1 != Num2
Num1 == Num2
#and_or
Num1 and Num2
Num1 or Num2
#max_min
max(Num1,Num2)
min(Num1,Num2)
#math_types
Num1 + Num2
Num1 - Num2
Num1 * Num2
Num1 ** Num2
Num1 / Num2
Num1 % Num2

