#!/usr/bin/env bash

sleep 3600 &
pid=$!
sleep 5

echo ===
echo PID is $pid, before kill:
ps -ef | grep -E "PPID|$pid" | sed 's/^/   /'
echo ===

( kill -TERM $pid ) 2>&1
sleep 5

echo ===
echo PID is $pid, after kill:
ps -ef | grep -E "PPID|$pid" | sed 's/^/   /'
echo ===