package com.jda.DataStructurePrograms;

public class LinkedHashEntry<T> {

	T key;
    T value;
    LinkedHashEntry next;
 
    /* Constructor */
    LinkedHashEntry(T key, T value) 
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

}
