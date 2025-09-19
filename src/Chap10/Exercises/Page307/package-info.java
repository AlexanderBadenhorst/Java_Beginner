package Chap10.Exercises.Page307;

/*True or False:
1. To use the Math class, the first step is to make an instance of it.
   False — Math is all static; you don’t instantiate it.

2. You can mark a constructor with the static keyword.
   False — constructors can’t be static.

3. Static methods don’t have access to instance variable state of the “this” object.
   True — static methods have no this, so no instance fields.

4. It is good practice to call a static method using a reference variable.
   False — call statics via ClassName.method(); using an instance compiles but is poor style/misleading.

5. Static variables could be used to count the instances of a class.
   True — a static counter can track how many objects were created (increment in the constructor).

6. Constructors are called before static variables are initialized.
   False — static vars/blocks run at class load time, before any constructor.

7. MAX_SIZE would be a good name for a static final variable.
   True — constants (static final) are conventionally ALL_CAPS like MAX_SIZE.

8. A static initializer block runs before a class’s constructor runs.
   True — static initializer blocks run before any constructor.

9. If a class is marked final, all of its methods must be marked final.
   False — a final class can’t be subclassed; its methods don’t need to be marked final.

10. A final method can be overridden only if its class is extended.
    False — a final method cannot be overridden, even in a subclass.

11. There is no wrapper class for boolean primitives.
    False — boolean has a wrapper: Boolean.

12. A wrapper is used when you want to treat a primitive like an object.
    True — wrappers let you treat primitives as objects (collections, generics, etc.).

13. The parseXxx methods always return a String.
    False — parseXxx returns primitives (parseInt → int, etc.), not String.

14. Formatting classes (which are decoupled from I/O) are in the java.format package.
    False — formatting lives in java.util.Formatter / java.text; there’s no java.format package.

 */