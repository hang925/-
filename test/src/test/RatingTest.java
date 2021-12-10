package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Scanner;

public class RatingTest{

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}
/** 
* 
* Method: rating(int num) 
* 
*/ 
@Test
public void testRating() throws Exception { 
//TODO: Test goes here...
    Assert.assertEquals(1,new Rating().rating(2020));
    Assert.assertEquals(2,new Rating().rating(1320));
    Assert.assertEquals(3,new Rating().rating(805));
    Assert.assertEquals(4,new Rating().rating(520));
    Assert.assertEquals(5,new Rating().rating(333));
    Assert.assertEquals(6,new Rating().rating(52));
    Assert.assertEquals(7,new Rating().rating(20));
    }
} 
