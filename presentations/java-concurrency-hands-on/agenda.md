Java Concurrency Intro: OpenJDK Hands-On
----------------------------------------

Java Memory Model Under The Hood
================================

Presentation:
* Leaky abstractions
* Memory Wall that introduces caches
* Multiple processors
* Cache coherency protocols
* MESI example
* Store Buffers, Invalidate Queues
* Memory Barriers in MESI
* Higher-level abstractions (LoadLoad, LoadStore, StoreLoad, StoreStore)
* Acquire/release semantics

Live Demo:
* Write up a simple class with acquire/release
* Walk through its bytecode
* Find all the ```getfield```/```putfield``` usages in openjdk sources
* Oh, that's too much! Find where the information on volatility is kept (```share/vm/ci/ciField.hpp```)
* Find all usages of ```is_volatile```, end up in ```share/vm/c1/c1_LIRGenerator.cpp```
* Show how ```do_StoreField``` adds ```membar_release``` and a ```membar```
* Show how ```do_LoadField``` adds a ```membar_acquire```
* Go to ```share/vm/c1/c1_LIRAssembler.cpp``` and show what's emitted on x86