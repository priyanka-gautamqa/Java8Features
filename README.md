# Java 8 Features

## Predicate

interface Predicate<T> {
public boolean test(T t);
}

It takes one parameter - Argument type
It returns boolean value
Good for testing conditions


## Function

interface function(T,R)
{ public R apply(T t); 
}

It takes two parameters - Argument type, Return Type
It can return any type of result - only one result but any type
Good for performing some operations and then returning a value
T is input type and R is return value

## Consumer

interface Consumer<T> 
{ 
public void accept(T t); 
}

Consumer can be used to consume object and perform certain operation.
It takes one parameter - Input/Argument type
It does not return anything.
It just performs some operation like printing something.


## Supplier

interface Supplier<R> 
{
public R get();
}

It takes one parameter - Return type.
It does not take input/argument type.
It performs some operation and then return value on the basis if return type provided.
For example return date.


