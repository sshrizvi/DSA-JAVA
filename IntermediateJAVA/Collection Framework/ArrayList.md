# ArrayList Class (Java Platform SE 8)

> [!IMPORTANT]
> To study in detail about ArrayList class do visit - 
> https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

## Overview

The `ArrayList` class in Java is a part of the `java.util` package and provides a resizable-array implementation of the `List` interface. It permits all elements, including null, and implements all optional list operations. The class is not synchronized, hence it is not thread-safe.

## Class Definition

```java
public class ArrayList<E>
    extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable, Serializable
```

## Constructor Summary

| Constructor | Description |
| ----------- | ----------- |
| `ArrayList()` | Constructs an empty list with an initial capacity of ten. |
| `ArrayList(int initialCapacity)` | Constructs an empty list with the specified initial capacity. |
| `ArrayList(Collection<? extends E> c)` | Constructs a list containing the elements of the specified collection. |

## Key Features
- **Resizable Array**: Automatically grows as elements are added.
- **Permits Null Elements**: Allows `null` values.
- **Not Synchronized**: Use `Collections.synchronizedList` for thread-safe operations.
- **Fail-Fast Iterators**: Iterators throw `ConcurrentModificationException` if the list is structurally modified after the iterator is created.

## Performance Characteristics
- **Constant Time Operations**: `size()`, `isEmpty()`, `get()`, `set()`, `iterator()`, `listIterator()`.
- **Amortized Constant Time**: `add()`.
- **Linear Time Operations**: Other operations.

## Key Methods

| Method Signature | Description |
| ---------------- | ----------- |
| `boolean add(E e)` | Appends the specified element to the end of the list. |
| `void add(int index, E element)` | Inserts the specified element at the specified position in the list. |
| `E remove(int index)` | Removes the element at the specified position in the list. |
| `boolean remove(Object o)` | Removes the first occurrence of the specified element from the list. |
| `E get(int index)` | Returns the element at the specified position in the list. |
| `E set(int index, E element)` | Replaces the element at the specified position in the list with the specified element. |
| `void trimToSize()` | Trims the capacity of the list to the list's current size. |
| `void ensureCapacity(int minCapacity)` | Increases the capacity of the list, if necessary, to ensure it can hold at least the number of elements specified by the minimum capacity argument. |
| `Iterator<E> iterator()` | Returns an iterator over the elements in this list in proper sequence. |
| `ListIterator<E> listIterator()` | Returns a list iterator over the elements in this list in proper sequence. |
| `boolean contains(Object o)` | Returns `true` if this list contains the specified element. |
| `Object[] toArray()` | Returns an array containing all of the elements in this list in proper sequence. |
| `<T> T[] toArray(T[] a)` | Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array. |
| `void sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified comparator. |
| `boolean removeIf(Predicate<? super E> filter)` | Removes all of the elements of this collection that satisfy the given predicate. |
| `void replaceAll(UnaryOperator<E> operator)` | Replaces each element of this list with the result of applying the operator to that element. |
| `void clear()` | Removes all of the elements from this list. |
| `boolean isEmpty()` | Returns `true` if this list contains no elements. |
| `int size()` | Returns the number of elements in this list. |
| `int indexOf(Object o)` | Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| `int lastIndexOf(Object o)` | Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. |
