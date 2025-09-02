package Chap03.Exercises.Page67;

//Kate’s method doesn’t work because she only used one reference variable.
//Every time the loop ran, a new Contact object was created and assigned to
//that same variable, which meant the previous object became unreachable.
//By the end of the loop, only the last Contact could still be accessed —
//the other nine were lost in memory with no way to use them.

//Bob’s method is better because he stored each object in an array.
//That way, all ten Contact objects can still be accessed later,
//which is exactly what the requirements asked for.
//Even though it uses a few more references, it’s the only approach that
//actually lets you update and work with all the contacts.