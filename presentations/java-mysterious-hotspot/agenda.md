# What Do You Think You Are Doing, Hotspot?

* Explain why we are here
 - Trollface from the logs
 - Search the web
 - Stackoverflow
 - Ask someone who knows (https://twitter.com/shipilev/status/522481181003354112)
 - DIY!

* Give a real example: the `_last_ditch_collection` and `_no_gc`
 - Show a piece of GC logs that have weird stuff in them
 - Investigate `_last_ditch_collection`
 - Reproduce `_last_ditch_collection`
 - Investigate `_no_gc`
 - Find the relevant changeset
 - Get the relevan VM build
 - Reproduce `_no_gc` (jstat -gccause -t `jps | grep NoGc | cut -d' ' -f1` 100)
 - http://bugs.java.com/view_bug.do?bug_id=7015169

* Outtakes:
 - Use `grep`, Luke!
 - Things may be already fixed. So use `hg grep`
 - How to determine the proper jdk build for a changeset
 - Always try to confirm your theories experimentally

* Another real example: non-zero-filled arrays
 - Show a piece of code
 - Vote on whether the assertion may fail
 - Investigate how it may happen
 - (TODO)
 - http://bugs.java.com/bugdatabase/view_bug.do?bug_id=7196857

* Further Material
 - The book by Marcus
 - JavaOne talk on Hotspot internals
