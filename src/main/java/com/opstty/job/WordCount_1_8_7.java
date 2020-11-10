package com.opstty.job;

import com.opstty.mapper.TokenizerMapper_1_8_7;
import com.opstty.mapper.TokenizerMapper_1_8_7_2;
import com.opstty.reducer.IntReducer7;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class WordCount_1_8_7 {
    public static void main(String[] args) throws Exception {
        /*JOB1*/
        Configuration conf = new Configuration();
        String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
        if (otherArgs.length < 2) {
            System.err.println("Usage: wordcount <in> [<in>...] <out>");
            System.exit(2);
        }
        Job job = Job.getInstance(conf, "wordcount");
        job.setJarByClass(WordCount_1_8_7.class);
        job.setMapperClass(TokenizerMapper_1_8_7.class);
        job.setReducerClass(Compare.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        job.waitForCompletion(true);
        /*JOB2*/
        Configuration conf2 = new Configuration();
        Job job2 = Job.getInstance(conf2, "wordcount2");
        job2.setJarByClass(WordCount_1_8_7.class);
        job2.setMapperClass(TokenizerMapper_1_8_7_2.class);
        job2.setReducerClass(IntReducer7.class);

        job2.setMapOutputKeyClass(NullWritable.class);
        job2.setMapOutputValueClass(Text.class);
        job2.setOutputKeyClass(Text.class);
        job2.setOutputValueClass(NullWritable.class);

        FileInputFormat.addInputPath(job2, new Path(args[1]));
        FileOutputFormat.setOutputPath(job2, new Path(args[2]));
        System.exit(job2.waitForCompletion(true) ? 0 : 1);
    }
}
