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

### Accepting two input type as arguments - Go for Bi-Predicate, Bi-Function and Bi-consumer.

## Bi-Predicate
BiPredicate is exactly same as Predicate except that it will take 2 input arguments. 
interface BiPredicate<T1,T2> 
{
public boolean test(T1 t1,T2 t2); 
//remaining default methods: and(), or() , negate()
}

T1 and T2 are two input arguments

## Bi-Function
interface BiFunction<T,U,R>
{ 
public R apply(T t,U u);
//default method andThen() 
}

T and U are two input arguments and R is one return type value
