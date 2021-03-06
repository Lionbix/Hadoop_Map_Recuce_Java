package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class TokenizerMapper_1_8_2 extends Mapper<Object, Text, Text, NullWritable> {
    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(),";");
        int i = 0;
        while (itr.hasMoreTokens()) {
            word.set(itr.nextToken());
            if(i%13==3 && !word.toString().equals("ESPECE")) {
                context.write(word, NullWritable.get());
            }
            i++;
        }
    }
}