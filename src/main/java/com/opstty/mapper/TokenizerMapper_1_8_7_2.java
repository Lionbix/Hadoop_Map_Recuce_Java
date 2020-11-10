package com.opstty.mapper;

import org.apache.commons.io.output.NullWriter;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class TokenizerMapper_1_8_7_2 extends Mapper<Object, Text, NullWritable, Text> {
    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException{

        String[] kv = value.toString().split("\t");
        String district = kv[0]+"@"+kv[1];

        context.write(NullWritable.get(),new Text(district));
    }
}
