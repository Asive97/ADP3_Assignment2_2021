package za.ac.cput.ADP3_Assignment2_2021;
/*
* Asive Madladla 217068332
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    @Test
    void testAdd(){
        ArrayList list = new ArrayList();
        //add elements to the list
        list.add("Asive");
        list.add("Jody");
        list.add(0,"David");
        assertEquals(3,list.size());
    }
    @Test
    void testRemove(){
        ArrayList list = new ArrayList();
        list.add("Asive");

        list.remove("Asive");
        assertEquals(0,list.size());

    }
    @Test
    void testFind(){
        ArrayList list = new ArrayList();

        list.add("Faith");
        list.add( 0,"Asive");

        if(list.contains("Faith")==true)
            System.out.println("Given list contains string 'faith' and 'Asive' ");
        else if(list.contains("Sam")==true)
            System.out.println("Given list contains string 'Sam' but not string 'Faith'");
        Assertions.assertEquals("Asive",list.get(0));


    }


}