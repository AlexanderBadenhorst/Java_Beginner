package Chap09.Exercises.Page270;

/*
Tom spotted an inheritance side-effect: because V3Radiator extends V2Radiator,
its constructor calls super(aList), so every time a V3Radiator is built the V2Radiator
constructor runs first and silently adds five extra "V2Radiator" SimUnits to the same
list before V3Radiator adds its ten. With one V2Radiator, one V3Radiator, and twenty
RetentionBots, the list ends up with 20 radiator units (5 from V2 + 5 from V3’s super +
10 from V3) using 4 watts each (=80) plus 20 retention units at 2 watts (=40), for a total
of 120 watts—20% higher than the 100 watts Sarah expected if V3 didn’t drag in those extra
V2s. The quickest proof is to instrument SimUnit with a tiny constructor print (e.g.,
System.out.println("Created: " + type);) so the log reveals the unexpected extra "V2Radiator"
creations immediately.
 */