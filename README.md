# Java 8 Features

## Predicate

interface Predicate<T> {
public boolean test(T t);
}

It takes one parameter - Argument type
It returns boolean value
Good for testing conditions
Default methods - and() or() negate()
Static method - isEqual()

## Function

interface function(T,R)
{ public R apply(T t); 
}

It takes two parameters - Argument type, Return Type
It can return any type of result - only one result but any type
Good for performing some operations and then returning a value
T is input type and R is return value

Default methods - andThen() , compose()
Static method - identity()

## Consumer

interface Consumer<T> 
{ 
public void accept(T t); 
}

Consumer can be used to consume object and perform certain operation.
It takes one parameter - Input/Argument type
It does not return anything.
It just performs some operation like printing something.

Default method - andThen()

## Supplier

interface Supplier<R> 
{
public R get();
}

It takes one parameter - Return type.
It does not take input/argument type.
It performs some operation and then return value on the basis if return type provided.
For example return date.

# Bi Functional Interfaces
### Accepting two input type as arguments - Go for Bi-Predicate, Bi-Function and Bi-consumer.

### Bi-Predicate
BiPredicate is exactly same as Predicate except that it will take 2 input arguments. 
interface BiPredicate<T1,T2> 
{
public boolean test(T1 t1,T2 t2); 
//remaining default methods: and(), or() , negate()
}

T1 and T2 are two input arguments

### Bi-Function
interface BiFunction<T,U,R>
{ 
public R apply(T t,U u);
//default method andThen() 
}

T and U are two input arguments and R is one return type value

### Bi-Consumer
interface BiConsumer<T,U> 
{ 
public void accept(T t,U u); 
//default method andThen() 
}

# Primitive type Functional Interfaces

### Primitive Predicate 
### IntPredicate

Take input type as int hence no need to specify while declaring
interface IntPredicate 
{ 
public boolean test(int i);
//default methods: and(),or(),negate()
}
e.g. IntPredicate ip = i->i%2==0;

### LongPredicate

Take input type as long hence no need to specify while declaring
interface LongPredicate
{
public boolean test(long i);
//default methods: and(),or(),negate()
}

### DoublePredicate

Take input type as double hence no need to specify while declaring
interface DoublePredicate
{
public boolean test(long i);
//default methods: and(),or(),negate()
}

### Primitive Type Functional Interfaces for Function

Below 1 to 3 are about input type hence while defining teh function we need to just specify the return type. Name of function is telling about the input type
1. IntFunction: can take int type as input and return any type
   public R apply(int i);
2. LongFunction: can take long type as input and return any type
   public R apply(long i);
3. DoubleFunction: can take double type as input and return any type
   public R apply(double i);

Below 4 to 6 are about return type - While defining the function we need to specify the input type . Because name is telling about the return type
4. ToIntFunction: It can take any type as input but always returns int type
   public int applyAsInt(T t)
5. ToLongFunction: It can take any type as input but always returns long type
   public long applyAsLong(T t)
6. ToDoubleFunction: It can take any type as input but always returns double type
   public double applyAsDouble(T t)

Below 7 to 12 - the name itself tells about both input type and return type  - No need to specify them while defining the function
7. IntToLongFunction: It can take int type as input and returns long type
   public long applyAsLong(int i)

8. IntToDoubleFunction: It can take int type as input and returns long type
   public double applyAsDouble(int i)

9. LongToIntFunction: It can take long type as input and returns int type
   public int x`(long i)

10. LongToDoubleFunction: It can take long type as input and returns double type
    public double applyAsDouble(long i)

11. DoubleToIntFunction: It can take double type as input and returns int type
    public int applyAsInt(double i)

12. DoubleToLongFunction: It can take double type as input and returns long type
    public long applyAsLong(double i)

BiFunction 

13. ToIntBiFunction:return type must be int type but inputs can be anytype
    public int applyAsInt(T t, U u)

14. ToLongBiFunction:return type must be long type but inputs can be anytype
    public long applyAsLong(T t, U u)

15. ToDoubleBiFunction: return type must be double type but inputs can be anytype
    public double applyAsDouble(T t, U u)

### Primitive Version for Consumer:

1. IntConsumer public void accept(int value)
2. LongConsumer public void accept(long value)
3. DoubleConsumer public void accept(double value)
4. ObjIntConsumer<T> public void accept(T t,int value)
5. ObjLongConsumer<T> public void accept(T t,long value)
6. ObjDoubleConsumer<T> public void accept(T t,double value)

### Primitive Versions for Supplier:

1. IntSupplier public int getAsInt();
2. LongSupplier public long getAsLong()
3. DoubleSupplier public double getAsDouble()
4. BooleanSupplier public boolean getAsBoolean()


### Unary and Binary Operator - primitive versions

1. IntUnaryOperator: public int applyAsInt(int)
2. LongUnaryOperator: public long applyAsLong(long)
3. DoubleUnaryOperator: public double applyAsDouble(double)

4. IntBinaryOperator public int applyAsInt(int i,int j)
5. LongBinaryOperator public long applyAsLong(long l1,long l2)
6. DoubleBinaryOperator public double applyAsLong(double d1,double d2)


## Double Colon Operator

This concept is an alternative to lambda expressions
Use for - 
1. Method reference
2. Constructor Reference

Condition to use double colon operator for reference is 
    methods should have same argument type

### Method Reference
Static methods
ClassName :: MethodName

Instance methods
ObjectOfClass :: MethodName

### Constructor Reference
ClassName :: new


# STREAMS

Purpose - To process objects from the collection and perform bulk operation on the given collection

To create stream object
Stream s = c.stream()  , where c is any collection

To Configure and Process the stream object :
1. filter(Predicate<T> t) : to filter objects
2. map(Function<T,R> f) : to perform some function on the object
3. collect() - to collect values
4. count() - to count values in the stream
5. sorted() - DNSO
6. sorted(Comparator c) - customized sorting order
7. min(Comparator c)
8. max(Comparator c)
9. forEach(lambda expression)
10. toArray() - to copy elements to array
11. Stream.of() -> for any  group of values and array