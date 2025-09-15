package Chap08.Exercises.Page232;
/*
1:
Chain:
-Bar is class
-Implements Foo(interface)
Chain:
Bar  – – – –> Foo

2:
-Vout is abstract class
-Implements Vinn (interface)
Chain:
Vout (abstract class) ——– – – – –> Vinn (interface)

3:
-Muffie (abstract) implements Whuffie (interface) → dashed line
-Fluffie (class) extends Muffie (abstract class) → solid line
Chain:
Fluffie (class) ———> Muffie (abstract class) – – – – –> Whuffie (interface)

4:
- Boop extends Zoop
- Goop extends Boop
Chain:
Goop (class) ——> Boop (class) ——> Zoop (class)

5:
-Gamma extends Delta → solid line
-Gamma implements Epsilon → dashed line
-Alpha extends Gamma → solid line
-Alpha implements Beta → dashed line
Chain:

Alpha (class) —> Gamma (class) —> Delta (class)

Gamma – – – – –> Epsilon (interface)

Alpha – – – – –> Beta (interface)
*/