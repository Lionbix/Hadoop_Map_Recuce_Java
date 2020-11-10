package com.opstty.reducer;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class IntReducer7 extends Reducer<NullWritable, Text, Text, NullWritable>
{
    public void reduce(NullWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException
    {
        String district = "";
        int max_nbr_tree = 0;

        // for all the values with the same (NULL) key,
        // aka all the key-value pairs...
        for(Text value : values)
        {
            // split the composite value by the '@' delimiter
            String[] splitted_values = value.toString().split("@");
            String district_name = splitted_values[0];
            int nbr_tree = Integer.parseInt(splitted_values[1]);

            // find the district with the oldest tree
            if(nbr_tree > max_nbr_tree)
            {
                district = district_name;
                max_nbr_tree = nbr_tree;
            }
        }

        // output the district (key) with the oldest tree's year of planting (value)
        // to the output directory
        context.write(new Text(district),NullWritable.get());
    }
}