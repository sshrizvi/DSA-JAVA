# Vector Class (Java Platform SE 8)

> [!IMPORTANT]
> To study in detail about Vector class do visit - 
> https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html


## Overview
The `Vector` class implements a growable array of objects. Similar to an array, it contains components that can be accessed using an integer index. The size of a `Vector` can grow or shrink as needed to accommodate adding and removing items after the `Vector` has been created.

## Key Features
- **Capacity Management**: Each vector maintains a capacity and a capacityIncrement. The capacity is always at least as large as the vector size and is usually larger. As components are added, the vector's storage increases in chunks the size of capacityIncrement.
- **Fail-Fast Iterators**: Iterators returned by the `iterator` and `listIterator` methods are fail-fast. They throw `ConcurrentModificationException` if the vector is structurally modified after the iterator is created.
- **Synchronized**: Unlike the new collection implementations, `Vector` is synchronized. For thread-safe implementation, use `Vector`; otherwise, prefer `ArrayList`.

## Interfaces Implemented
- `Serializable`
- `Cloneable`
- `Iterable<E>`
- `Collection<E>`
- `List<E>`
- `RandomAccess`

## Direct Known Subclasses
- `Stack`

## Constructor Summary

| Constructor | Description |
|-------------|-------------|
| `Vector()` | Constructs an empty vector with an initial capacity of 10. |
| `Vector(Collection<? extends E> c)` | Constructs a vector containing the elements of the specified collection, in the order they are returned by the collection's iterator. |
| `Vector(int initialCapacity)` | Constructs an empty vector with the specified initial capacity. |
| `Vector(int initialCapacity, int capacityIncrement)` | Constructs an empty vector with the specified initial capacity and capacity increment. |

## Instance Methods

| Modifier and Type | Method | Description |
| --- | --- | --- |
| boolean | `add(E e)` | Appends the specified element to the end of this vector. |
| void | `add(int index, E element)` | Inserts the specified element at the specified position in this vector. |
| boolean | `addAll(Collection<? extends E> c)` | Appends all of the elements in the specified collection to the end of this vector. |
| boolean | `addAll(int index, Collection<? extends E> c)` | Inserts all of the elements in the specified collection into this vector at the specified position. |
| void | `addElement(E obj)` | Adds the specified component to the end of this vector, increasing its size by one. |
| int | `capacity()` | Returns the current capacity of this vector. |
| void | `clear()` | Removes all elements from this vector. |
| Object | `clone()` | Returns a clone of this vector. |
| boolean | `contains(Object o)` | Returns true if this vector contains the specified element. |
| boolean | `containsAll(Collection<?> c)` | Returns true if this vector contains all of the elements in the specified collection. |
| void | `copyInto(Object[] anArray)` | Copies the components of this vector into the specified array. |
| E | `elementAt(int index)` | Returns the component at the specified index. |
| Enumeration<E> | `elements()` | Returns an enumeration of the components of this vector. |
| void | `ensureCapacity(int minCapacity)` | Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument. |
| boolean | `equals(Object o)` | Compares the specified object with this vector for equality. |
| E | `firstElement()` | Returns the first component of this vector. |
| void | `forEach(Consumer<? super E> action)` | Performs the given action for each element of the iterable until all elements have been processed or the action throws an exception. |
| E | `get(int index)` | Returns the element at the specified position in this vector. |
| int | `hashCode()` | Returns the hash code value for this vector. |
| int | `indexOf(Object o)` | Returns the index of the first occurrence of the specified element in this vector. |
| int | `indexOf(Object o, int index)` | Returns the index of the first occurrence of the specified element in this vector, searching forwards from index. |
| void | `insertElementAt(E obj, int index)` | Inserts the specified object as a component in this vector at the specified index. |
| boolean | `isEmpty()` | Tests if this vector has no components. |
| Iterator<E> | `iterator()` | Returns an iterator over the elements in this list in proper sequence. |
| E | `lastElement()` | Returns the last component of the vector. |
| int | `lastIndexOf(Object o)` | Returns the index of the last occurrence of the specified element in this vector. |
| int | `lastIndexOf(Object o, int index)` | Returns the index of the last occurrence of the specified element in this vector, searching backwards from index. |
| ListIterator<E> | `listIterator()` | Returns a list iterator over the elements in this list in proper sequence. |
| ListIterator<E> | `listIterator(int index)` | Returns a list iterator over the elements in this list in proper sequence, starting at the specified position in the list. |
| E | `remove(int index)` | Removes the element at the specified position in this vector. |
| boolean | `remove(Object o)` | Removes the first occurrence of the specified element in this vector. |
| boolean | `removeAll(Collection<?> c)` | Removes from this vector all of its elements that are contained in the specified collection. |
| void | `removeAllElements()` | Removes all components from this vector and sets its size to zero. |
| boolean | `removeElement(Object obj)` | Removes the first (lowest-indexed) occurrence of the argument from this vector. |
| void | `removeElementAt(int index)` | Deletes the component at the specified index. |
| boolean | `removeIf(Predicate<? super E> filter)` | Removes all of the elements of this collection that satisfy the given predicate. |
| protected void | `removeRange(int fromIndex, int toIndex)` | Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive. |
| void | `replaceAll(UnaryOperator<E> operator)` | Replaces each element of this list with the result of applying the operator to that element. |
| boolean | `retainAll(Collection<?> c)` | Retains only the elements in this vector that are contained in the specified collection. |
| E | `set(int index, E element)` | Replaces the element at the specified position in this vector with the specified element. |
| void | `setElementAt(E obj, int index)` | Sets the component at the specified index of this vector to be the specified object. |
| void | `setSize(int newSize)` | Sets the size of this vector. |
| int | `size()` | Returns the number of components in this vector. |
| void | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified comparator. |
| Spliterator<E> | `spliterator()` | Creates a late-binding and fail-fast spliterator over the elements in this list. |
| List<E> | `subList(int fromIndex, int toIndex)` | Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. |
| Object\[ \] | `toArray()` | Returns an array containing all of the elements in this vector in the correct order. |
| <T> T\[ \] | `toArray(T[] a)` | Returns an array containing all of the elements in this vector in the correct order; the runtime type of the returned array is that of the specified array. |
| String | `toString()` | Returns a string representation of this vector. |
| void | `trimToSize()` | Trims the capacity of this vector to be the vector's current size. |

## Notes


*   `Vector` is synchronized and thread-safe, but its methods add overhead that is not needed if synchronization is not required. Use `ArrayList` for better performance if synchronization is not necessary.
*   `Vector` can be used in multi-threaded environments where the data structure might be modified concurrently.