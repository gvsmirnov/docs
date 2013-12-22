#!/bin/bash

set -x

svn checkout http://svn.apache.org/repos/asf/commons/proper/math/trunk@1455261 commons-math3
patch commons-math3/pom.xml commons-math3-pom-patch.diff
