/*using jshell on windows cmd prompt*/

jshell> Integer myIntMinValue = Integer.MIN_VALUE;
myIntMinValue ==> -2147483648

jshell> Integer myIntMaxValue = Integer.MAX_VALUE;
myIntMaxValue ==> 2147483647

jshell> Byte myByteMinValue = Byte.MIN_VALUE;
myByteMinValue ==> -128

jshell> Byte myByteMaxValue = Byte.MAX_VALUE;
myByteMaxValue ==> 127

jshell> Short myShortMinValue = Short.MIN_VALUE;
myShortMinValue ==> -32768

jshell> Short myShortMaxValue = Short.MAX_VALUE;
myShortMaxValue ==> 32767

jshell> int myIntegerValue = (myIntMaxValue/2);
myIntegerValue ==> 1073741823

jshell> byte myByteValue = (myByteMinValue/2);
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte myByteValue = (myByteMinValue/2);
|                      ^--------------^

jshell> byte myByteValue = (byte) (myByteMinValue/2);
myByteValue ==> -64

jshell> short myShortValue = (myShortMaxValue/2)
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short myShortValue = (myShortMaxValue/2);
|                        ^---------------^

jshell> short myShortValue = (short) (myShortMaxValue/2);
myShortValue ==> 16383


jshell> byte myByte = 120
myByte ==> 120

jshell> short myShort = 4000
myShort ==> 4000

jshell> int myInteger = 50040
myInteger ==> 50040

jshell> long myLong = 50000 + (myInteger + myByte + myShort * 10);
myLong ==> 140160

