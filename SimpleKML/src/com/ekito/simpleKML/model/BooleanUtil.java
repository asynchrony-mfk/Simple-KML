package com.ekito.simpleKML.model;

public class BooleanUtil { 

    /**
     * Convenience methods used getting the value of the Stringified
     * boolean value (0/1 false/true FALSE/TRUE).
     * @param value stringified boolean value (0/1 false/true FALSE/TRUE)
     * @return null, Boolean.TRUE, Boolean.FALSE
     */
    static public Boolean valueOf(String value) { 
         if (value == null)
              return Boolean.FALSE;

         if (value.equals("1"))
              return Boolean.TRUE;
         else if (value.equals("0")) 
              return Boolean.FALSE;
         else {
              String val = value.toUpperCase();
              return Boolean.valueOf(val);
         }
    }

}
