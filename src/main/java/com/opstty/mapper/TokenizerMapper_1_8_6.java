package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class TokenizerMapper_1_8_6 extends Mapper<Object, Text, NullWritable, Text> {
    private final static IntWritable one = new IntWritable(1);
    private Text result = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        StringTokenizer itr = new StringTokenizer(value.toString(),";");
        int i = 0;
        while (itr.hasMoreTokens()) {
            String arrondissement = itr.nextToken();
            if(i%13==1 && !arrondissement.toString().equals("ARRONDISSEMENT")) {

                itr.nextToken();itr.nextToken();itr.nextToken();
                String annee = itr.nextToken();
                result.set(arrondissement+"@"+annee);

                if(Double.parseDouble((String.valueOf(annee))) > 1000){
                    context.write(NullWritable.get(), result);
                    i+=3;
                }
            }
            i++;
        }
    }
}