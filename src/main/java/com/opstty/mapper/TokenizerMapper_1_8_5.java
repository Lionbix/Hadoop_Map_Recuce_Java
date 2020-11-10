package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class TokenizerMapper_1_8_5 extends Mapper<Object, Text, Text, IntWritable> {
    private final static IntWritable one = new IntWritable(1);
    private Text result = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(),";");
        int i = 0;
        while (itr.hasMoreTokens()) {
            String espece = itr.nextToken();
            if(i%13==3 && !espece.toString().equals("ESPECE")) {

                itr.nextToken();itr.nextToken();
                String hauteur = itr.nextToken();

                result.set(espece);

                context.write(result, new IntWritable((int) Double.parseDouble((String.valueOf(hauteur)))));
                i+=3;
            }
            i++;
        }
    }
}