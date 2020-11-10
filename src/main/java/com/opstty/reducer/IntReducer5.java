package com.opstty.reducer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntReducer5 extends Reducer<Text, IntWritable, Text, IntWritable> {
    private IntWritable result = new IntWritable();

    public void reduce(Text key, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {
        List a = new ArrayList();
        int sum = 0;
        for (IntWritable val : values) {
            a.add(val.get());
        }
        Collections.sort(a);

        int i =0;
        for (Object element : a){
            result.set((Integer) a.get(i));
            context.write(key, result);
            i++;
        }
    }
}