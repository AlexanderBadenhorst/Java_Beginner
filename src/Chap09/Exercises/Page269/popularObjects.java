package Chap09.Exercises.Page269;

/*
most popular object:
Honey honeyPot = new Honey();
Total references to that same object at the end of main: 12

Where those references live:

honeyPot (local variable) — 1

Array slots in ha — 4
ha[0], ha[1], ha[2], ha[3]
(Note: bees.beeHoney points to the same array; that doesn’t add new refs beyond the 4 slots.)

Each Bear’s hunny field — 5
bears[0].hunny … bears[4].hunny

The Kit object’s honey field — 1
Accessible as raccoon.rk.honey (even though the local kit was set to null, the Kit object is still reachable via raccoon.rk)

The Raccoon’s rh field — 1
raccoon.rh

Why this is correct (gotchas):

Putting honeyPot into the ha array makes four separate references (one per slot).

Assigning bees.beeHoney = ha; only aliases the array; it doesn’t create extra references to the Honey object.

kit = null; doesn’t reduce the count because the Kit object survives through raccoon.rk, and its honey field still points at the same Honey.

So the “most popular” object is that single Honey instance, with 12 total references to it.
 */
