Bizet Thibaut & Hamdi Badr
==========================
1.6.3 Run the job (wordcount)
-----------------------------

```bash
[bhamdi@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar wordcount /user/bhamdi/Ulysses.txt /user/bhamdi/wordcount2 


        20/10/28 10:05:14 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
        20/10/28 10:05:14 INFO hdfs.DFSClient: Created token for bhamdi: HDFS_DELEGATION_TOKEN owner=bhamdi@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1603875914188, maxDate=1604480714188, sequenceNumber=2391, masterKeyId=32 on ha-hdfs:efrei
        20/10/28 10:05:14 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for bhamdi: HDFS_DELEGATION_TOKEN owner=bhamdi@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1603875914188, maxDate=1604480714188, sequenceNumber=2391, masterKeyId=32)
        20/10/28 10:05:14 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/bhamdi/.staging/job_1603290159664_0459
        20/10/28 10:05:15 INFO input.FileInputFormat: Total input files to process : 1
        20/10/28 10:05:15 INFO mapreduce.JobSubmitter: number of splits:1
        20/10/28 10:05:15 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_0459
        20/10/28 10:05:15 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for bhamdi: HDFS_DELEGATION_TOKEN owner=bhamdi@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1603875914188, maxDate=1604480714188, sequenceNumber=2391, masterKeyId=32)]
        20/10/28 10:05:15 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
        20/10/28 10:05:15 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
        20/10/28 10:05:16 INFO impl.YarnClientImpl: Submitted application application_1603290159664_0459
        20/10/28 10:05:16 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_0459/
        20/10/28 10:05:16 INFO mapreduce.Job: Running job: job_1603290159664_0459
        20/10/28 10:05:26 INFO mapreduce.Job: Job job_1603290159664_0459 running in uber mode : false
        20/10/28 10:05:26 INFO mapreduce.Job:  map 0% reduce 0%
        20/10/28 10:05:35 INFO mapreduce.Job:  map 100% reduce 0%
        20/10/28 10:05:41 INFO mapreduce.Job:  map 100% reduce 100%
        20/10/28 10:05:41 INFO mapreduce.Job: Job job_1603290159664_0459 completed successfully
        20/10/28 10:05:41 INFO mapreduce.Job: Counters: 53
                File System Counters
                        FILE: Number of bytes read=727563
                        FILE: Number of bytes written=1948255
                        FILE: Number of read operations=0
                        FILE: Number of large read operations=0
                        FILE: Number of write operations=0
                        HDFS: Number of bytes read=1586589
                        HDFS: Number of bytes written=530683
                        HDFS: Number of read operations=8
                        HDFS: Number of large read operations=0
                        HDFS: Number of write operations=2
                Job Counters
                        Launched map tasks=1
                        Launched reduce tasks=1
                        Data-local map tasks=1
                        Total time spent by all maps in occupied slots (ms)=22032
                        Total time spent by all reduces in occupied slots (ms)=11084
                        Total time spent by all map tasks (ms)=7344
                        Total time spent by all reduce tasks (ms)=2771
                        Total vcore-milliseconds taken by all map tasks=7344
                        Total vcore-milliseconds taken by all reduce tasks=2771
                        Total megabyte-milliseconds taken by all map tasks=11280384
                        Total megabyte-milliseconds taken by all reduce tasks=5675008
                Map-Reduce Framework
                        Map input records=33230
                        Map output records=268131
                        Map output bytes=2615311
                        Map output materialized bytes=727563
                        Input split bytes=101
                        Combine input records=268131
                        Combine output records=49937
                        Reduce input groups=49937
                        Reduce shuffle bytes=727563
                        Reduce input records=49937
                        Reduce output records=49937
                        Spilled Records=99874
                        Shuffled Maps =1
                        Failed Shuffles=0
                        Merged Map outputs=1
                        GC time elapsed (ms)=188
                        CPU time spent (ms)=8300
                        Physical memory (bytes) snapshot=1495814144
                        Virtual memory (bytes) snapshot=7279910912
                        Total committed heap usage (bytes)=1565523968
                        Peak Map Physical memory (bytes)=1181437952
                        Peak Map Virtual memory (bytes)=3395756032
                        Peak Reduce Physical memory (bytes)=317923328
                        Peak Reduce Virtual memory (bytes)=3884154880
                Shuffle Errors
                        BAD_ID=0
                        CONNECTION=0
                        IO_ERROR=0
                        WRONG_LENGTH=0
                        WRONG_MAP=0
                        WRONG_REDUCE=0
                File Input Format Counters
                        Bytes Read=1586488
                File Output Format Counters
                        Bytes Written=530683

[bhamdi@hadoop-edge01 ~]$ hdfs dfs -ls 
        

        Found 16 items
        drwx------   - bhamdi bhamdi          0 2020-10-28 10:05 .staging
        -rw-r--r--   1 bhamdi bhamdi     450783 2020-10-21 10:35 Frankenstein.txt
        -rw-r--r--   1 bhamdi bhamdi    1428841 2020-10-26 11:26 Leonard.txt
        -rw-r--r--   1 bhamdi bhamdi     674570 2020-10-26 11:27 TheOutline.txt
        -rw-r--r--   1 bhamdi bhamdi    1586488 2020-10-26 11:27 Ulysses.txt
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-21 12:17 data
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-26 11:54 gutenberg
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-26 11:53 gutenberg-output
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-26 12:49 gutenberg-output2
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-26 19:07 gutenberg-output3
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-26 19:09 gutenberg-output4
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-26 19:14 gutenberg-output5
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-26 19:23 gutenberg-output6
        -rw-r--r--   1 bhamdi bhamdi        169 2020-10-21 11:25 sudoku.dta
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-21 11:12 wordcount
        drwxr-xr-x   - bhamdi bhamdi          0 2020-10-28 10:05 wordcount2
        [bhamdi@hadoop-edge01 ~]$ hdfs dfs -ls wordcount2
        Found 2 items
        -rw-r--r--   3 bhamdi bhamdi          0 2020-10-28 10:05 wordcount2/_SUCCESS
        -rw-r--r--   3 bhamdi bhamdi     530683 2020-10-28 10:05 wordcount2/part-r-00000
```
1.8.1 Districts containing trees
--------------------------------

```bash 
[tbizet@hadoop-edge01 ~]$ hdfs dfs -cat exo13/part-r-00000 


        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        3
        4
        5
        6
        7
        8
        9


```

1.8.2 Show all existing species
-------------------------------

```bash 
[tbizet@hadoop-edge01 ~]$ hdfs dfs -cat exo16/part-r-00000
araucana
atlantica
australis
baccata
bignonioides
biloba
bungeana
cappadocicum
carpinifolia
colurna
coulteri
decurrens
dioicus
distichum
excelsior
fraxinifolia
giganteum
giraldii
glutinosa
grandiflora
hippocastanum
ilex
involucrata
japonicum
kaki
libanii
monspessulanum
nigra
nigra laricio
opalus
orientalis
papyrifera
petraea
pomifera
pseudoacacia
sempervirens
serrata
stenoptera
suber
sylvatica
tomentosa
tulipifera
ulmoides
virginiana
x acerifolia
```

1.8.3 Number of trees by species
--------------------------------

```bash
araucana        1
atlantica       2
australis       1
baccata 2
bignonioides    1
biloba  5
bungeana        1
cappadocicum    1
carpinifolia    4
colurna 3
coulteri        1
decurrens       1
dioicus 1
distichum       3
excelsior       1
fraxinifolia    2
giganteum       5
giraldii        1
glutinosa       1
grandiflora     1
hippocastanum   3
ilex    1
involucrata     1
japonicum       1
kaki    2
libanii 2
monspessulanum  1
nigra   3
nigra laricio   1
opalus  1
orientalis      8
papyrifera      1
petraea 2
pomifera        1
pseudoacacia    1
sempervirens    1
serrata 1
stenoptera      1
suber   1
sylvatica       8
tomentosa       2
tulipifera      2
ulmoides        1
virginiana      2
x acerifolia    11
```
1.8.4 Maximum height per specie of tree
---------------------------------------

```bash
tbizet@hadoop-edge01 hdfs dfs -cat d4/part-r-00000
araucana        9
atlantica       195
australis       16
baccata 13
bignonioides    260
biloba  33
bungeana        50
cappadocicum    16
carpinifolia    245
colurna 260
coulteri        225
decurrens       20
dioicus 162
distichum       35
excelsior       365
fraxinifolia    27
giganteum       655
giraldii        460
glutinosa       16
grandiflora     12
hippocastanum   505
ilex    15
involucrata     12
japonicum       10
kaki    160
libanii 30
monspessulanum  12
nigra   250
nigra laricio   30
opalus  15
orientalis      34
papyrifera      190
petraea 31
pomifera        13
pseudoacacia    11
sempervirens    30
serrata 18
stenoptera      30
suber   10
sylvatica       370
tomentosa       420
tulipifera      35
ulmoides        190
virginiana      14
x acerifolia    510 
```

1.8.5 Sort the trees height from smallest to largest
----------------------------------------------------

```bash
[tbizet@hadoop-edge01 ~]$ hdfs dfs -cat d3/part-r-00000
araucana        9
atlantica       25
atlantica       195
australis       16
baccata 5
baccata 13
bignonioides    260
biloba  18
biloba  22
biloba  25
biloba  25
biloba  33
bungeana        50
cappadocicum    16
carpinifolia    15
carpinifolia    16
carpinifolia    30
carpinifolia    245
colurna 20
colurna 20
colurna 260
coulteri        225
decurrens       20
dioicus 162
distichum       20
distichum       30
distichum       35
excelsior       365
fraxinifolia    22
fraxinifolia    27
giganteum       20
giganteum       30
giganteum       30
giganteum       470
giganteum       655
giraldii        460
glutinosa       16
grandiflora     12
hippocastanum   18
hippocastanum   345
hippocastanum   505
ilex    15
involucrata     12
japonicum       10
kaki    14
kaki    160
libanii 30
libanii 30
monspessulanum  12
nigra   25
nigra   28
nigra   250
nigra laricio   30
opalus  15
orientalis      20
orientalis      20
orientalis      22
orientalis      25
orientalis      26
orientalis      27
orientalis      31
orientalis      34
papyrifera      190
petraea 30
petraea 31
pomifera        13
pseudoacacia    11
sempervirens    30
serrata 18
stenoptera      30
suber   10
sylvatica       2
sylvatica       10
sylvatica       15
sylvatica       20
sylvatica       23
sylvatica       30
sylvatica       300
sylvatica       370
tomentosa       20
tomentosa       420
tulipifera      22
tulipifera      35
ulmoides        190
virginiana      12
virginiana      14
x acerifolia    20
x acerifolia    25
x acerifolia    30
x acerifolia    30
x acerifolia    32
x acerifolia    40
x acerifolia    40
x acerifolia    40
x acerifolia    42
x acerifolia    45
x acerifolia    510
```

1.8.6 District containing the oldest tree
-----------------------------------------

```bash
[tbizet@hadoop-edge01 ~]$ hdfs dfs -cat t5/part-r-00000
5
```

1.8.7 District containing the most trees
----------------------------------------

```bash
[tbizet@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar wordcount_1_8_7 /user/tbizet/trees.csv /user/tbizet/m /user/tbizet/m1
20/11/10 19:51:50 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 19:51:50 INFO hdfs.DFSClient: Created token for tbizet: HDFS_DELEGATION_TOKEN owner=tbizet@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605034310836, maxDate=1605639110836, sequenceNumber=6029, masterKeyId=46 on ha-hdfs:efrei
20/11/10 19:51:50 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for tbizet: HDFS_DELEGATION_TOKEN owner=tbizet@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605034310836, maxDate=1605639110836, sequenceNumber=6029, masterKeyId=46)
20/11/10 19:51:50 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/tbizet/.staging/job_1603290159664_3567
20/11/10 19:51:51 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 19:51:51 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 19:51:51 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3567
20/11/10 19:51:51 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for tbizet: HDFS_DELEGATION_TOKEN owner=tbizet@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605034310836, maxDate=1605639110836, sequenceNumber=6029, masterKeyId=46)]
20/11/10 19:51:52 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/3.1.5.0-152/0/resource-types.xml
20/11/10 19:51:52 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 19:51:52 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3567
20/11/10 19:51:52 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3567/
20/11/10 19:51:52 INFO mapreduce.Job: Running job: job_1603290159664_3567
20/11/10 19:52:02 INFO mapreduce.Job: Job job_1603290159664_3567 running in uber mode : false
20/11/10 19:52:02 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 19:52:11 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 19:52:22 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 19:52:22 INFO mapreduce.Job: Job job_1603290159664_3567 completed successfully
20/11/10 19:52:22 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=865
                FILE: Number of bytes written=495211
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=16779
                HDFS: Number of bytes written=80
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters 
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=20541
                Total time spent by all reduces in occupied slots (ms)=27044
                Total time spent by all map tasks (ms)=6847
                Total time spent by all reduce tasks (ms)=6761
                Total vcore-milliseconds taken by all map tasks=6847
                Total vcore-milliseconds taken by all reduce tasks=6761
                Total megabyte-milliseconds taken by all map tasks=10516992
                Total megabyte-milliseconds taken by all reduce tasks=13846528
        Map-Reduce Framework
                Map input records=98
                Map output records=97
                Map output bytes=665
                Map output materialized bytes=865
                Input split bytes=99
                Combine input records=0
                Combine output records=0
                Reduce input groups=17
                Reduce shuffle bytes=865
                Reduce input records=97
                Reduce output records=17
                Spilled Records=194
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=183
                CPU time spent (ms)=3600
                Physical memory (bytes) snapshot=1450987520
                Virtual memory (bytes) snapshot=7270879232
                Total committed heap usage (bytes)=1550843904
                Peak Map Physical memory (bytes)=1160962048
                Peak Map Virtual memory (bytes)=3398250496
                Peak Reduce Physical memory (bytes)=290025472
                Peak Reduce Virtual memory (bytes)=3872628736
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=16680
        File Output Format Counters 
                Bytes Written=80
20/11/10 19:52:22 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.100.24:10200
20/11/10 19:52:22 INFO hdfs.DFSClient: Created token for tbizet: HDFS_DELEGATION_TOKEN owner=tbizet@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605034342217, maxDate=1605639142217, sequenceNumber=6030, masterKeyId=46 on ha-hdfs:efrei
20/11/10 19:52:22 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for tbizet: HDFS_DELEGATION_TOKEN owner=tbizet@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605034342217, maxDate=1605639142217, sequenceNumber=6030, masterKeyId=46)
20/11/10 19:52:22 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement the Tool interface and execute your application with ToolRunner to remedy this.
20/11/10 19:52:22 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/tbizet/.staging/job_1603290159664_3568
20/11/10 19:52:22 INFO input.FileInputFormat: Total input files to process : 1
20/11/10 19:52:22 INFO mapreduce.JobSubmitter: number of splits:1
20/11/10 19:52:23 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1603290159664_3568
20/11/10 19:52:23 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for tbizet: HDFS_DELEGATION_TOKEN owner=tbizet@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1605034342217, maxDate=1605639142217, sequenceNumber=6030, masterKeyId=46)]
20/11/10 19:52:23 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
20/11/10 19:52:23 INFO impl.YarnClientImpl: Submitted application application_1603290159664_3568
20/11/10 19:52:23 INFO mapreduce.Job: The url to track the job: https://hadoop-master01.efrei.online:8090/proxy/application_1603290159664_3568/
20/11/10 19:52:23 INFO mapreduce.Job: Running job: job_1603290159664_3568
20/11/10 19:52:33 INFO mapreduce.Job: Job job_1603290159664_3568 running in uber mode : false
20/11/10 19:52:33 INFO mapreduce.Job:  map 0% reduce 0%
20/11/10 19:52:43 INFO mapreduce.Job:  map 100% reduce 0%
20/11/10 19:52:52 INFO mapreduce.Job:  map 100% reduce 100%
20/11/10 19:52:53 INFO mapreduce.Job: Job job_1603290159664_3568 completed successfully
20/11/10 19:52:53 INFO mapreduce.Job: Counters: 53
        File System Counters
                FILE: Number of bytes read=120
                FILE: Number of bytes written=493379
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=184
                HDFS: Number of bytes written=3
                HDFS: Number of read operations=8
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters 
                Launched map tasks=1
                Launched reduce tasks=1
                Data-local map tasks=1
                Total time spent by all maps in occupied slots (ms)=21288
                Total time spent by all reduces in occupied slots (ms)=27856
                Total time spent by all map tasks (ms)=7096
                Total time spent by all reduce tasks (ms)=6964
                Total vcore-milliseconds taken by all map tasks=7096
                Total vcore-milliseconds taken by all reduce tasks=6964
                Total megabyte-milliseconds taken by all map tasks=10899456
                Total megabyte-milliseconds taken by all reduce tasks=14262272
        Map-Reduce Framework
                Map input records=17
                Map output records=17
                Map output bytes=80
                Map output materialized bytes=120
                Input split bytes=104
                Combine input records=0
                Combine output records=0
                Reduce input groups=1
                Reduce shuffle bytes=120
                Reduce input records=17
                Reduce output records=1
                Spilled Records=34
                Shuffled Maps =1
                Failed Shuffles=0
                Merged Map outputs=1
                GC time elapsed (ms)=225
                CPU time spent (ms)=3340
                Physical memory (bytes) snapshot=1453547520
                Virtual memory (bytes) snapshot=7268642816
                Total committed heap usage (bytes)=1555562496
                Peak Map Physical memory (bytes)=1158127616
                Peak Map Virtual memory (bytes)=3395846144
                Peak Reduce Physical memory (bytes)=295485440
                Peak Reduce Virtual memory (bytes)=3872796672
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters 
                Bytes Read=80
        File Output Format Counters 
                Bytes Written=3
[tbizet@hadoop-edge01 ~]$ hdfs dfs -cat m1/part-r-00000
16
```

