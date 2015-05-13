
# What the problems are

 * Benchmarking a system-level change
 * Load tests
 * Additional metrics between events
 * Benchmarking JVM-level changes

# What the existing solutions are
 
 * SPECjvm, dacapo, etc
 * Broken all the way
 * JMH
 * Very cool, but not designed for macro-level
 * Not designed for side-by-side comparisons

# Additional pitfalls

 * Measuring time to start/terminate vm
 * Measuring time difference between pairs of events
 * Creating Blackholes safely
 * Complex warmups and teardowns

# Additional possibilities

 * A universal suite of benchmarks contributed to by many parties
 * Easy to integrate into existing applications
 * Possible to get the outputs for a performance regression tests

# Live monitoring

 * In production, know about all critical processing times
 * Get immediately alerted if anything goes wrong
 * Trace all the events and data into the same place
 * Have it all visible to you at a glance
 * Maybe even automated solutions ;)
