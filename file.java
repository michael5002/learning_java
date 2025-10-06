/*using jshell on windows cmd prompt*/


jshell> myVariable = 4
|  Error:
|  cannot find symbol
|    symbol:   variable myVariable
|  myVariable = 4
|  ^--------^

jshell> myFirstNumber = 4
jshell> Float.MIN_VALUE
$20 ==> 1.4E-45

jshell> Float.MAX_VALUE
$21 ==> 3.4028235E38

jshell> System.out.print("Min vale =" + $20);
Min vale =1.4E-45
jshell>

jshell> System.out.print("Max vale =" + $21);
Max vale =3.4028235E38
jshell>

jshell>

jshell> char myChar = '/u0044
|  Error:
|  unclosed character literal
jshell> myIntMin_Value = IntegerMIN_VALUE;
|  Error:
|  cannot find symbol
|    symbol:   variable myIntMin_Value
|  myIntMin_Value = IntegerMIN_VALUE;
|  ^------------^
|  Error:
|  cannot find symbol
|    symbol:   variable IntegerMIN_VALUE
|  myIntMin_Value = IntegerMIN_VALUE;
|                   ^--------------^

jshell> myIntMin_Value = Integer.MIN_VALUE;
|  Error:
|  cannot find symbol
|    symbol:   variable myIntMin_Value
|  myIntMin_Value = Integer.MIN_VALUE;
|  ^------------^

jshell> myIntMinValue = Integer.MIN_VALUE;
|  Error:
|  cannot find symbol
|    symbol:   variable myIntMinValue
|  myIntMinValue = Integer.MIN_VALUE;
|  ^-----------^

jshell> IntMinValue = Integer.MIN_VALUE;
|  Error:
|  cannot find symbol
|    symbol:   variable IntMinValue
|  IntMinValue = Integer.MIN_VALUE;
|  ^---------^

jshell> myntMinValue = Integer.MIN_VALUE;
|  Error:
|  cannot find symbol
|    symbol:   variable myntMinValue
|  myntMinValue = Integer.MIN_VALUE;
|  ^----------^

jshell> integer myIntMinValue = Integer.MIN_VALUE;
|  Error:
|  cannot find symbol
|    symbol:   class integer
|  integer myIntMinValue = Integer.MIN_VALUE;
|  ^-----^

jshell> Integer myIntMinValue = Integer.MIN_VALUE;
myIntMinValue ==> -2147483648

jshell> Integer myIntMaxValue = Integer.MAX_VALUE
myIntMaxValue ==> 2147483647

jshell> Byte myByteMinValue = Byte.MIN_VALUE
myByteMinValue ==> -128

jshell> Byte myByteMaxValue = Byte.MAX_VALUE
jshell> Float.SIZE
$38 ==> 32

jshell> float myFloatValue = 5.35
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  float myFloatValue = 5.35;
|                       ^--^

jshell> float myFloatValue = (float) 5.35
myFloatValue ==> 5.35

jshell> float myFloatValue = (float)5.35
myFloatValue ==> 5.35

jshell> float 5.67/2
|  Error:
|  '.class' expected
|  float 5.67/2
|        ^
|  Error:
|  unexpected type
|    required: value
|    found:    class
|  float 5.67/2
|  ^----^

jshell> 5.65/3
$41 ==> 1.8833333333333335

jshell> char myChar = 'j;
|  Error:
|  unclosed character literal
|  char myChar = 'j;
|

jshell>

jshell> char myChar = 'j';
myChar ==> 'j'

jshell> char mySimpleChar = '?';
mySimpleChar ==> '?'

jshell> char myUnicodeChar = '\u003F';
myUnicodeChar ==> '?'

jshell> char myDecimalChar = 63
myDecimalChar ==> '?'

jshell> System.out.print("My values are > " + mySimpleChar + myUnicodeChar + myDecimalChar);
My values are > ???
jshell>

jshell> char myB = '\u0042';
myB ==> 'B'

jshell> char myO = '\u004F';
myO ==> 'O'

jshell> char myOi = '\u004F';
myOi ==> 'O'

jshell> char myM = '\u004D';
myM ==> 'M'

jshell> System.out.print("My word is > " + myB + myO + MYOi + myM);
|  Error:
|  cannot find symbol
|    symbol:   variable MYOi
|  System.out.print("My word is > " + myB + myO + MYOi + myM);
|                                                 ^--^

jshell> System.out.print("My word is > " + myB + myO + MyOi + myM);
|  Error:
|  cannot find symbol
|    symbol:   variable MyOi
|  System.out.print("My word is > " + myB + myO + MyOi + myM);
|                                                 ^--^

jshell> System.out.print("My word is > " + myB + myO + myOi + myM);
My word is > BOOM
jshell> char myEX = '\u0021';
myEX ==> '!'

jshell> System.out.print("My word is > " + myB + myO + myOi + myM + m
yEX);
My word is > BOOM!
