/**
 * @author Larry Shannon
 */


public class ProjectNameDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Name newName = new Name();
		Name myName = null;
		Name spouseName = null;
		Name cloneName = null;
		newName.getNameFromUser();
		myName = new Name(newName);
		System.out.println("You entered: ");
		printNameOut(myName);
		cloneName = new Name(myName.getFirstName(), myName.getMiddleName(), myName.getLastName());
		if (myName.equals(cloneName))
		{
			System.out.println("You just cloned yourself and your clone now has your name.");
			System.out.println("Your name: " + myName.getFullName());
			System.out.println("Your clone's name: " + cloneName.toString());
			System.out.println(
					"You might want to differentiate yourself from your clone by using all uppercase for their name. ");
			cloneName.toUpperCase();
			if (myName.equals(cloneName))
			{
				System.out.println("That did not work they are still equal!");
			} else
			{
				System.out.println("Your name: " + myName.getFullName());
				System.out.println("Your clone's name is now: " + cloneName.toString());
				System.out.println("That is better! Now I can tell you apart.");
			}
		} else
		{
			System.out.println("You failed to clone yourself!");
		}
		System.out.println("We need another name of the opposite gender.");
		newName.getNameFromUser();
		spouseName = new Name(newName.getFirstName(), newName.getMiddleName(), newName.getLastName());
		System.out.print("You entered: ");
		System.out.println(spouseName);
		myName.mergeNames(spouseName);
		System.out.println("After a marriage in some countries your names would be:");
		System.out.println(myName);
		System.out.println(spouseName.getFullName());
		System.out.println("You should now enter a new name for yourself and I will change your name.");
		newName.getNameFromUser();

		System.out.print("You entered: ");
		printNameOut(newName);
		System.out.println("I will now change your name from: " + myName.getFullName() + " to " + newName);
		myName.changeNameTo(newName);
		if (myName.equals(newName))
		{
			System.out.print("Your name is now: ");
			System.out.println(myName);
		}
	}


	static void printNameOut(Name printName)
	{
		System.out.println(printName.getFirstName() + " " + printName.getMiddleName() + " " + printName.getLastName());
	}

}
