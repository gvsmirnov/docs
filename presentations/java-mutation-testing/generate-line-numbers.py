#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys

def main():
    lower_bound = int(sys.argv[1])
    upper_bound = int(sys.argv[2])

    for line_number in range(lower_bound, upper_bound):
        print line_number

if __name__ == '__main__':
    main()
