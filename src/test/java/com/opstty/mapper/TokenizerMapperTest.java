package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TokenizerMapperTest {
    @Mock
    private Mapper.Context context;
    private TokenizerMapper_1_8_3 tokenizerMapper;

    @Before
    public void setup() {
        this.tokenizerMapper = new TokenizerMapper_1_8_3();
    }

    @Test
    public void testMap() throws IOException, InterruptedException {
        String value = "foo;bar;tux;foo;bar;tux;foo;bar;tux;foo;bar;tux;foo;bar;tux;";
        this.tokenizerMapper.map(null, new Text(value), this.context);
        verify(this.context, times(1))
                .write(new Text("tux"), new IntWritable(1));
    }
}