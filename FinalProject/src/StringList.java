/* CS211 Yudong Lin 
 * HW06
 * 16 May 2020
 * Chapter 16, do exercises 8 and 12 on page 1023
 */
/*
 This is the interface definition for the IntList data type
 */
 
public interface StringList {
    public int size();
    public String get(int index);
    public String toString();
    public int indexOf(int value);
    public void add(String value);
    public void add(int index, String value);
    public void remove(int index);
}
