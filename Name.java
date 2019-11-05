/**
 * @author Yiyang Shi
 * this is the Name class which has three private instance variables for first name, middle name, and last name.
 * this class contains three constructors.
 * this class contains fourteen methods.
 */
package namePackage;
import java.util.Scanner;

public class Name
{
    private String firstname, midname, lastname;
    private static Scanner keyboard = new Scanner(System.in);
    public Name()
    {

    }
    public Name(Name newName)
    {
        firstname = newName.firstname;
        midname = newName.midname;
        lastname = newName.lastname;
    }
    public Name(String fn, String mn, String ln)
    {   
        firstname = fn;
        midname = mn;
        lastname = ln;
    }
    /*
     * getNameFromUser() allows user to enter their names by keyboard. 
     */
    public void getNameFromUser()
    {
        System.out.println("Please enter a complete name in the following format.");
        System.out.println("First Middle Last");
        firstname = keyboard.next();
        midname = keyboard.next();
        lastname = keyboard.next();
    }
    /*
     * reply to the name request. return first name or middle name or last name.
     */
    public String getFirstName()
    {
        return firstname;
    }
    public String getMiddleName()
    {
        return midname;
    }
    public String getLastName()
    {
        return lastname;
    }
    /*
     * set three parts of names by replace one by one.
     */
    public void setFirstName(String fn)
    {
        firstname = fn;
    }
    public void setMiddleName(String mn)
    {
        midname = mn;
    }
    public void setLastName(String ln)
    {
        lastname = ln;
    }
    /*
     * confirm two names are same or not.
     */
    public Boolean equals(Name cloneName)
    {
        if (firstname.equals(cloneName.firstname) && midname.equals(cloneName.midname) && lastname.equals(cloneName.lastname))
        return true;
        return false;
    }
    /*
     * combine three parts of names to one full name.
     */
    public String getFullName()
    {
        String fullname;
        fullname = firstname + " " + midname + " " +lastname;
        return fullname;
    }
    /*
     * change both last name after a marriage.
     */
    public void mergeNames(Name spname)
    {
        String lastnewName;
        lastnewName = lastname;
        lastname = lastname + "-" + spname.lastname;
        spname.lastname = lastnewName + "-" + spname.lastname; 
    }
    /*
     * rewrite the toString for using System.out.println() to print out class type.
     */
    public String toString()
    {
        return (firstname + " " + midname + " " +lastname);
    }
    /*
     * change this name class information based on another name class.
     */
    public void changeNameTo(Name newName)
    {
        firstname = newName.firstname;
        midname = newName.midname;
        lastname = newName.lastname;
    }
    public void changeNameTo(String fn, String mn, String ln)
    {
        firstname = fn;
        midname = mn;
        lastname = ln;
    }
    /*
     * making full name to uppercase.
     */
    public void toUpperCase()
    {
        firstname = firstname.toUpperCase();
        midname = midname.toUpperCase();
        lastname = lastname.toUpperCase();
    }
}