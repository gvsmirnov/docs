# What Do You Think You Are Doing, Hotspot?

* Explain why we are here
 - Trollface from the logs
 - Search the web
 - Stackoverflow
 - Ask someone who knows (https://twitter.com/shipilev/status/522481181003354112)
 - DIY!

* Case study 1: Runtime.getRuntime().maxMemory()
 - Show a sample application where maxMemory() != Xmx
 - Look inside the sources, find the explanation
 - Check the numbers
 - Check G1 sources
 - Run with G1

* Outtakes:
 - Hotspot folder layout
 - Use `grep`, Luke!
 - Use NetBeans, Luke

* Case study 2: default methods trigger interface initialization:
 - Show the simple case without default methods
 - Show the old spec
 - Then add a default method
 - Find the issue at https://bugs.openjdk.java.net/browse/JDK-8043188
 - Show the difference in specs

* Case study 4: `_last_ditch_collection` and `_no_gc`
 - Show a piece of GC logs that have weird stuff in them
 - Investigate `_last_ditch_collection`
 - Reproduce `_last_ditch_collection`
 - Investigate `_no_gc`
 - Find the relevant changeset
 - Get the relevan VM build
 - Reproduce `_no_gc` (jstat -gccause -t `jps | grep NoGc | cut -d' ' -f1` 100)
 - https://bugs.openjdk.java.net/browse/JDK-7015169

* Outtakes:
 - Things may be already fixed. So use `hg grep`
 - How to determine the proper jdk build for a changeset
 - Always try to confirm your theories experimentally
 - Send your findings
 
 
* Case study 3: https://bugs.openjdk.java.net/browse/JDK-8058847
 - TODO

* Another real example: non-zero-filled arrays
 - Show a piece of code
 - Vote on whether the assertion may fail
 - Investigate how it may happen
 - (TODO)
 - http://bugs.java.com/bugdatabase/view_bug.do?bug_id=7196857

* Further Material
 - The book by Marcus
 - JavaOne talk on Hotspot internals
 - http://blog.jamesdbloom.com/JVMInternals.html