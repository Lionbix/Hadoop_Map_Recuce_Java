package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount_1_8_1", WordCount_1_8_1.class,
                    "A map/reduce program that shows districts where there are trees");
            programDriver.addClass("wordcount_1_8_2", WordCount_1_8_2.class,
                    "A map/reduce program that shows differents kind of trees");
            programDriver.addClass("wordcount_1_8_3", WordCount_1_8_3.class,
                    "A map/reduce program that shows number of trees by species ");
            programDriver.addClass("wordcount_1_8_4", WordCount_1_8_4.class,
                    "A map/reduce program that shows the height of the tallest tree of each kind");
            programDriver.addClass("wordcount_1_8_5", WordCount_1_8_5.class,
                    "A map/reduce program that sort the trees height from smallest to largest");
            programDriver.addClass("wordcount_1_8_6", WordCount_1_8_6.class,
                    "A map/reduce program that displays the district where the oldest tree is");
            programDriver.addClass("wordcount_1_8_7", WordCount_1_8_7.class,
                    "A map/reduce program that displays the district containing the most trees");

            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
