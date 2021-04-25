package com.springbootjacoco.springbootjacoco;

public class Messages {
    public String getMessage(String name)
    {
        StringBuilder s = new StringBuilder();
        if(name == null || name.trim().length() == 0)
        {
            s = s.append("Provide a name , it should not be empty!");
        }
        else
        {
            s.append("Hello " + name + "!");
        }
        return s.toString();
    }
}
