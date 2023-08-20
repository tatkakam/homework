#!bin/bash

	for t in {1..10}
	do
	echo "The number of the processes is $t"
	date '+"%H:%M:%S"'
	done

cat /proc/cpuinfo > /tmp/file.txt

cat /etc/os-release | tail -6 | head -1 >> /tmp/file.txt
cat /etc/os-release | tail -6 | head -1 | awk -F"=" '{print$2}' >> /tmp/file.txt

	for file in {50..100}
	do
	touch /tmp/$file.txt
	done

cat /tmp/file.txt

ls -l /tmp
