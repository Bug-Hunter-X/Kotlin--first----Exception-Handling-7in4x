# Kotlin `first()` Exception Handling

This repository demonstrates a common Kotlin error: using the `first()` function on a potentially empty collection. The `first()` function throws a `NoSuchElementException` if the collection is empty. This example shows how to properly handle this exception to prevent unexpected crashes.

## Bug
The `bug.kt` file contains code that attempts to access the first element of a list without checking if the list is empty. This will lead to a runtime exception if the list is empty.

## Solution
The `bugSolution.kt` file shows how to use the `firstOrNull()` function to safely handle the case where the list is empty. If the list is empty, `firstOrNull()` returns null; otherwise, it returns the first element.