//Name: Rakin Uddin
//Date: October 29, 2012
//Purpose: Entertain and educate the player from math-based questions

import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class ShuttleEscape

{
    public static long distance = 300; //Global variable for "lives" (distance from alien).
    public static long points = 0; //Global variable for first system of points.
    public static long points1 = 0; // Global variable for second system of points.
    public static void main (String args[])
    {
	new ShuttleEscape ();
    }


    public ShuttleEscape ()
    {
	System.out.println ("\n\n\n");
	title ();
	System.out.println ("\n\n                      *     .--.");
	System.out.println ("                           / /  `");
	System.out.println ("          +               | |");
	System.out.println ("                 '         \\ \\__,");
	System.out.println ("             *          +   '--'  *");
	System.out.println ("                 +   /\\");
	System.out.println ("    +              .'  '.   *");
	System.out.println ("           *      /======\\      +");
	System.out.println ("                 ;:.  _   ;");
	System.out.println ("                 |:. (_)  |");
	System.out.println ("                 |:.  _   |");
	System.out.println ("       +         |:. (_)  |          *");
	System.out.println ("                 ;:.      ;");
	System.out.println ("               .' \\:.    / `.");
	System.out.println ("              / .-'':._.'`-. \\");
	System.out.println ("              |/    /||\\    \\|");
	System.out.println ("            _..--\"\"\"````\"\"\"--.._");
	System.out.println ("      _.-'``                    ``'-._");
	System.out.println ("    -'                                '-");
	printThis ("You and your team of highly skilled astronauts have been stranded...");
	printDelay1 ();
	printThis ("\n...in the middle of space.");
	printThis ("\nWhile attempting to get back home, your shuttle gets hit by a small, lifeless asteroid!");
	pic1 ();
	System.out.println ("\n\nThough the team has been protected from air-loss by their astronaut suits,");
	printDelay2 ();
	System.out.println ("the asteroid was not as lifeless as it seems; a man-eating alien was onboard and in the shuttle!");
	alien ();
	System.out.println ("\nThe only way to escape is by reaching the Escapar-Pods, located in the bowels of your wrecked ship, before the alien does!");
	begin ();
	printDelay1 ();
	obstacle1 ();
	obstacle2 ();
	printDelay1 ();
	obstacle3 ();
	obstacle4 ();
	printDelay1 ();
	obstacle5 ();
    }


    public void begin ()  // Asks if player would like to begin the game
    {
	char begin = IBIO.inputChar ("Would you like to embark on a journey to help you and your team escape and get back home? (y/n): ");
	if (begin == 'y')
	    System.out.println ("\nYou begin leading your team through a labyrinth of electronic doors to the escape pods...");
	else if (begin == 'n')
	{
	    System.out.println ("\nYou feel sad about ditching them and decide to go anyway.");
	    System.out.println ("You begin leading your team through a labyrinth of electronic doors to the escape pods...");
	}
	else
	{
	    System.out.println ("\nYou don't realize what you asked yourself and are overcome by emotion for leaving your team.");
	    System.out.println ("You begin leading your team through a labyrinth of electronic doors to the escape pods...");
	}

    }


    public void printDelay1 ()  //Print delay of 1500 milliseconds.
    {
	try
	{
	    Thread.sleep (1500);
	}
	catch (InterruptedException m)
	{
	    ;
	}
    }



    public void printDelay2 ()  //Print delay of 100 milliseconds.
    {
	try
	{
	    Thread.sleep (100);
	}
	catch (InterruptedException m)
	{
	    ;
	}
    }


    public void printThis (String s)  //Prints slowly

    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    try
	    {
		Thread.sleep (25);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
    }


    public boolean message1 ()  //Informs user of game completion
    {
	Object[] options = {"OK", "CANCEL"};
	JOptionPane.showOptionDialog (null, "Congratulations! You have successfully completed the game!", "Congratulations!",
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		null, options, options [0]);
	return true;
    }


    public void pic1 ()  //Image for asteroid about to hit.

    {
	JOptionPane.showMessageDialog (null, createImageIcon ("imagesCAF8PGXQ.jpg"), "GASP!", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon (String path1)
    {

	java.net.URL imgURL = int.class.getResource (path1);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path1);

		return null;

	    }
    }



    public void pic2 ()  //Image for Virtual Keyboard picture

    {
	JOptionPane.showMessageDialog (null, createImageIcon ("virtualkeyboard.jpg"), "Enter Code", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon2 (String path2)
    {

	java.net.URL imgURL = int.class.getResource (path2);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path2);

		return null;

	    }
    }


    public void pic3 ()  //Image for Alien "Eggs"
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("alien_egg.jpg"), "Alien Eggs", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon3 (String path3)
    {

	java.net.URL imgURL = int.class.getResource (path3);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path3);

		return null;

	    }
    }


    public void pic4 ()  //Image for a man at reaching the light at the end of the tunnel
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("imagesCAD1D1BA.jpg"), "Freedom!", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon4 (String path4)
    {

	java.net.URL imgURL = int.class.getResource (path4);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path4);

		return null;

	    }
    }


    public void pic5 ()  //Image for enemy alien
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("alienencounter.jpg"), "AHHH!", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon5 (String path5)
    {

	java.net.URL imgURL = int.class.getResource (path5);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path5);

		return null;

	    }
    }


    public void pic6 ()  //Image for cartoon boxing glove
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("punch.gif"), "POW!", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon6 (String path6)
    {

	java.net.URL imgURL = int.class.getResource (path6);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path6);

		return null;

	    }
    }


    public void pic7 ()  //Image for cartoon boxing glove
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("deadpeople.jpg"), "Oh no...", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon7 (String path7)
    {

	java.net.URL imgURL = int.class.getResource (path7);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path7);

		return null;

	    }
    }


    public void pic8 ()  //Image for cartoon boxing glove
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("robotsuit.jpg"), "Ready to end this?", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon8 (String path8)
    {

	java.net.URL imgURL = int.class.getResource (path8);

	if (imgURL != null)

	    {

		return new ImageIcon (imgURL);

	    }

	else

	    {

		System.err.println ("Couldn't find file: " + path8);

		return null;

	    }
    }


    public void alien ()  //Alien ascii art
    {
	System.out.println ("\n         __.,,------.._");
	System.out.println ("      ,'\"   _      _   \"`.");
	System.out.println ("     /.__, ._  -=- _\"`    Y");
	System.out.println ("    (.____.-.`      \"\"`   j");
	System.out.println ("     VvvvvvV`.Y,.    _.,-'       ,     ,     ,");
	System.out.println ("        Y    ||,   '\"\\         ,/    ,/    ./");
	System.out.println ("        |   ,'  ,     `-..,'_,'/___,'/   ,'/   ,");
	System.out.println ("   ..  ,;,,',-'\"\\,'  ,  .     '     ' \"\"' '--,/    .. ..");
	System.out.println (" ,'. `.`---'     `, /  , Y -=-    ,'   ,   ,. .`-..||_|| ..");
	System.out.println ("ff\\\\`. `._        /f ,'j j , ,' ,   , f ,  \\=\\ Y   || ||`||_..");
	System.out.println ("l` \\` `.`.\"`-..,-' j  /./ /, , / , / /l \\   \\=\\l   || `' || ||...");
	System.out.println (" `  `   `-._ `-.,-/ ,' /`\"/-/-/-/-\"'''\"`.`.  `'.\\--`'--..`'_`' || ,");
	System.out.println ("            \"`-_,',  ,'  f    ,   /      `._    ``._     ,  `-.`'//         ,");
	System.out.println ("          ,-\"'' _.,-'    l_,-'_,,'          \"`-._ . \"`. /|     `.'\\ ,       |");
	System.out.println ("        ,',.,-'\"          \\=) ,`-.         ,    `-'._`.V |       \\ // .. . /j");
	System.out.println ("        |f\\\\               `._ )-.\"`.     /|         `.| |        `.`-||-\\\\/");
	System.out.println ("        l` \\`                 \"`._   \"`--' j          j' j          `-`---'");
	System.out.println ("         `  `                     \"`,-  ,'/       ,-'\"  /");
	System.out.println ("                                 ,'\",__,-'       /,, ,-'");
	System.out.println ("                                 Vvv'            VVv' ");
    }


    public void theend ()  //Ascii art for ending
    {
	System.out.println ("\n\n\n\n                                                                                                                               ");
	System.out.println ("                                                                                                                        dddddddd");
	System.out.println (" _____           _____       __  ");
	System.out.println ("(_   _)         |  ___)     / _) ");
	System.out.println ("  | |_ __  ___  | |_   _  __\\ \\  ");
	System.out.println ("  | | '_ \\/ __) |  _) | |/ / _ \\ ");
	System.out.println ("  | | | | > _)  | |___| / ( (_) )");
	System.out.println ("  |_|_| | \\___) |_____)__/ \\___/ ");
	System.out.println ("        | |                      ");
	System.out.println ("        |_|                      ");
    }


    public void bed ()  //Ascii art for bed
    {
	System.out.println ("");
	System.out.println ("     .::\"\"-,                      .::\"\"-.");
	System.out.println ("    /::     \\                    /::     \\");
	System.out.println ("    |::     |   _..--\"\"\"\"--.._   |::     |");
	System.out.println ("    '\\:.__ /  .'              '.  \\:.__ /");
	System.out.println ("     ||____|.'                  '.||____|");
	System.out.println ("     ||:.  |                       |:.  |");
	System.out.println ("     ||:.  |                       |:.  |");
	System.out.println ("     ||:.  |                       |:.  |");
	System.out.println ("     ||:.  |  _..---\"````````'---. |:.  |");
	System.out.println ("     ||:.  | `                     \\:.  |");
	System.out.println ("     ||:.  |: :                .--._.-\"\"-;");
	System.out.println ("     ||:.  |: : _.---``````---/    '.   _.`.");
	System.out.println ("     ||:.  | .-'  _,'```'-...'   _ .-'.'    '-.");
	System.out.println ("     ||:. .-'   .'        '. . '      '.      `'.");
	System.out.println ("     ||: ;.' .`'        _. '`'-.         '.   . ''-._");
	System.out.println ("     ||:. :   '.     .'          '.  . ' ' '.`       '._");
	System.out.println ("     ||:. :    '. .'     .::\"\"-: .''.        ' .   . ' ' :::\"\"-.");
	System.out.println ("     ||:. '     ..' .    /::     \\    '.        . '.    /::     \\");
	System.out.println ("     ||:  :  . .'      '.|::     |    _.:---\"\"---.._'   |::     |");
	System.out.println ("     ||.  ;  .:          '\\:.__ /   .'              '.   \\:.__ /");
	System.out.println ("     ||:  ;  : '.       . ||____|_.'                  '._||____|");
	System.out.println ("     ||:  ;__:   '.   .'  ||:.  |                        ||:.  |");
	System.out.println ("     ||:___| \\     '. :   ||:.  |                        ||:.  |");
	System.out.println ("     [[____]  '.     '.-._||:.  |                        ||:.  |");
	System.out.println ("                '.    :   ||:.  |                        ||:.  |");
	System.out.println ("                  '.  :   ||:.  |                        ||:.  |");
	System.out.println ("                    '-:   ||:.  |                        ||:.  |");
	System.out.println ("                       '._||:.  |________________________||:.  |");
	System.out.println ("                          ||:___|'-.-'-.-'-.-'-.-'-.-'-.-||:___|");
	System.out.println (" jgs                      [[____]                        [[____]");
	System.out.println ("");
    }


    public void title ()  //Heading of game
    {
	System.out.println ("");
	System.out.println ("    ___                       ___                   ");
	System.out.println ("  ,' _/ /7      /7 /7 /7 __  / _/ __  __  _   _   __");
	System.out.println (" _\\ `. / \\ /7/7/_7/_7//,'o/ / _/ (c',',','o| /o|,'o/");
	System.out.println ("/___,'/n_//__/// // // |_( /___//__)\\_\\ |_,7/_,'|_( ");
	System.out.println ("                                           //       ");
    }


    public void check ()  //Checks if global "distance" is equal to 0, and switching to gameover method if true
    {
	if (distance == 0)
	    gameover ();
	else
	    System.out.println ();
    }


    public void gameover ()  //Game over method. Asks player to start again if they wish
    {
	System.out.println ("Game Over");
	char again = IBIO.inputChar ("Play again? (y/n): ");
	if (again == 'y')
	{
	    distance = 300;
	    points = 0;
	    new ShuttleEscape ();
	}
	else
	    System.out.println ("Goodbye!");
    }


    public void bossinstructions ()  //Instructions on how to play against boss
    {
	JOptionPane.showMessageDialog (null, "* * * B O S S  F I G H T * * * \n \n"
		+ "This is it, you are avenging the \n"
		+ " death of your team and defeating \n"
		+ " the alien once and for all. The objective \n"
		+ " is to solve the following riddle: \n"
		+ "Imagine you are in a shuttle, an asteroid crashes \n"
		+ " into it, and a man-eating alien is on-board your wrecked spaceship. \n"
		+ "After a series of events, you come face to face with it in a sudden death match. \n"
		+ "What do you do? \n \n"
		+ "HINT (fill in the blanks) St_p _m_g_n_ng \n"
		+ "Save your friends, the world, and yourself.", "Instructions", JOptionPane.QUESTION_MESSAGE);
    }


    public void obstacle1 ()  //Obstacle 1's question.
    {
	System.out.println ("\nYou lead your team through a maintenance tunnel under the body of the shuttle,\na door with an electronic keyboard asking for the code.");
	pic2 ();
	int ques1 = IBIO.inputInt ("\n\nA security code is asked after you type the data,\n<SYSTEM> What is \"a\" in the quadratic expression y=5x²+6x+2? ");

	while (ques1 != 5 && distance > 0)
	{
	    distance -= 50;
	    System.out.println ("The alien is " + distance + " feet away, hurry and solve the code!");
	    ques1 = IBIO.inputInt ("<SYSTEM> Incorrect, what is \"a\" in the quadratic expression y=5x²+6x+2?  ");
	}

	check ();
	System.out.println ("<SYSTEM> Correct, you may proceed.");
	printDelay1 ();
    }


    public void obstacle2 ()  //Obstacle 2's question
    {
	System.out.println ("\nAfter crossing the first door, you continue on in the tunnel and enter a spacious room,\n");
	System.out.println ("Taking a close look at the surroundings, the alien appeared to be fertile and the room is filled with giant eggs!");
	pic3 ();
	System.out.println ("\n\nThe mother alien is still coming your way, you have to find out the fastest way to get out before she sees you in her nest!");
	pic2 ();
	System.out.println ("\n\nThe door continuing into the tunnel is shut by another lock, hurry and solve the code!");

	String answer = "  ";
	int num = (int) (Math.random () * 3) + 1; //Randomly chooses 1 of the three questions to give to the user.

	System.out.println ("<SYSTEM> Unscramble the following (they are related to space, as well as spaceships)>>"); //Assigns question based on the number generated
	switch (num)
	{
	    case 1:
		System.out.println ("roadmerthob");
		answer = "motherboard";
		break;
	    case 2:
		System.out.println ("pcase");
		answer = "space";
		break;
	    case 3:
		System.out.println ("demadrona");
		answer = "andromeda";
		break;
	}
	String guess1 = "";


	while (!guess1.equalsIgnoreCase (answer))
	{
	    guess1 = IBIO.inputString ("\n<SYSTEM> Please enter input: ");

	    if (!guess1.equalsIgnoreCase (answer))
	    {
		check ();
		distance -= 50;
		System.out.println ("The alien is " + distance + " feet away!");
	    }
	}

	System.out.println ("<SYSTEM> Correct, you may proceed.");
	printDelay1 ();

    }


    public void obstacle3 ()  // Method for defense mechanism activation
    {
	System.out.println ("\nYour team and you have successfully escaped the nest of eggs. After wandering through the maintanence tunnel,\nyou all reach a mysterious light at the end!");
	pic4 ();
	printDelay1 ();
	pic5 ();
	System.out.println ("\nOh no! You suddenly have crossed paths with the man-eating alien!");
	System.out.println ("It is blocking the rest of the way to the Escapar-Pods! You have to activate your defense mechanism to temporarily stun the alien.");
	printThis ("\n<SYSTEM> Defense mechanism initiated, please answer all questions correctly to activate.");

	int a = (int) (Math.random () * 10) + 1; //Selects random number between 1-10 for the first value
	int b = (int) (Math.random () * 10) + 1; //Selects random number between 1-10 for the second value
	int c = (int) (Math.random () * 10) + 1; //Selects random number between 1-10 for the third value
	int d = (int) (Math.random () * 10) + 1; //Selects random number between 1-10 for the fourth value
	int e = (int) (Math.random () * 10) + 1; //Selects random number between 1-10 for the fifth value
	int f = (int) (Math.random () * 10) + 1; //Selects random number between 1-10 for the sixth value


	int ques1 = IBIO.inputInt ("\n<SYSTEM> What is " + a + " x " + b + "? ");
	if (ques1 == a * b)
	{
	    System.out.println ("<SYSTEM> Correct, lock 1 has been deactivated.");
	    points++;
	}
	else
	    System.out.println ("<SYSTEM> Incorrect, lock 1 remains secure.");

	int ques2 = IBIO.inputInt ("\n<SYSTEM> What is " + c + " x " + d + "? ");
	if (ques2 == c * d)
	{
	    System.out.println ("<SYSTEM> Correct, lock 2 has been deactivated.");
	    points++;
	}
	else
	    System.out.println ("<SYSTEM> Incorrect, lock 2 remains secure.");

	int ques3 = IBIO.inputInt ("\n<SYSTEM> What is " + e + " x " + f + "? ");
	if (ques3 == e * f)
	{
	    System.out.println ("<SYSTEM> Correct, lock 3 has been deactivated.");
	    points++;
	}
	else
	    System.out.println ("<SYSTEM> Incorrect, lock 3 remains secure.");

	if (points > 1)
	    System.out.println ("\n<SYSTEM> You have deactivated the designated amount of locks, defense system activated.");
	else
	    gameover ();


    }


    public void obstacle4 ()  //Method for 7-layer door questions
    {
	System.out.println ("\n\nWhen activating the defence mechanism, a giant arm with a boxing glove attached temporarily disorientates the alien!");
	pic6 ();
	System.out.println ("\nYou escort your team through the rest of the tunnel and lock the 7-layered metal door behind you to buy some time to escape from it.");
	System.out.println ("Just to be on the safe side, you decide to activate the lock for the door so your team can get to the Escapar-Pods quicker.");
	System.out.println ("\n<SYSTEM> Enter passcode to activate security lock.");

	int a1 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the first value
	int a2 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the second value
	int b1 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the third value
	int b2 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the fourth value
	int c1 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the fifth value
	int c2 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the sixth value
	int d1 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the seventh value
	int d2 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the eigth value
	int e1 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the ninth value
	int e2 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the tenth value
	int f1 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the eleventh value
	int f2 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the twelfth value
	int g1 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the thirteenth value
	int g2 = (int) (Math.random () * 100) + 1; //Selects random number between 1-100 for the fourteenth value

	int add1 = IBIO.inputInt ("\n<SYSTEM> What is " + a1 + " + " + a2 + "? ");
	while (add1 != a1 + a2)
	{
	    System.out.println ("<SYSTEM> Pass unconfirmed, door remains unlocked.");
	    add1 = IBIO.inputInt ("\n<SYSTEM> What is " + a1 + " + " + a2 + "? ");
	}
	System.out.println ("<SYSTEM> Pass confirmed, door 1 locked.");

	int add2 = IBIO.inputInt ("\n<SYSTEM> What is " + b1 + " + " + b2 + "? ");
	while (add2 != b1 + b2)
	{
	    System.out.println ("<SYSTEM> Pass unconfirmed, door remains unlocked.");
	    add2 = IBIO.inputInt ("\n<SYSTEM> What is " + b1 + " + " + b2 + "? ");
	}
	System.out.println ("<SYSTEM> Pass confirmed, door 2 locked.");

	int add3 = IBIO.inputInt ("\n<SYSTEM> What is " + c1 + " + " + c2 + "? ");
	while (add3 != c1 + c2)
	{
	    System.out.println ("<SYSTEM> Pass unconfirmed, door remains unlocked.");
	    add3 = IBIO.inputInt ("\n<SYSTEM> What is " + c1 + " + " + c2 + "? ");
	}
	System.out.println ("<SYSTEM> Pass confirmed, door 3 locked.");

	int add4 = IBIO.inputInt ("\n<SYSTEM> What is " + d1 + " + " + d2 + "? ");
	while (add4 != d1 + d2)
	{
	    System.out.println ("<SYSTEM> Pass unconfirmed, door remains unlocked.");
	    add4 = IBIO.inputInt ("\n<SYSTEM> What is " + d1 + " + " + d2 + "? ");
	}
	System.out.println ("<SYSTEM> Pass confirmed, door 4 locked.");

	int add5 = IBIO.inputInt ("\n<SYSTEM> What is " + e1 + " + " + e2 + "? ");
	while (add5 != e1 + e2)
	{
	    System.out.println ("<SYSTEM> Pass unconfirmed, door remains unlocked.");
	    add5 = IBIO.inputInt ("\n<SYSTEM> What is " + e1 + " + " + e2 + "? ");
	}
	System.out.println ("<SYSTEM> Pass confirmed, door 5 locked.");

	int add6 = IBIO.inputInt ("\n<SYSTEM> What is " + f1 + " + " + f2 + "? ");
	while (add6 != f1 + f2)
	{
	    System.out.println ("<SYSTEM> Pass unconfirmed, door remains unlocked.");
	    add6 = IBIO.inputInt ("\n<SYSTEM> What is " + f1 + " + " + f2 + "? ");
	}
	System.out.println ("<SYSTEM> Pass confirmed, door 6 locked.");

	int add7 = IBIO.inputInt ("\n<SYSTEM> What is " + g1 + " + " + g2 + "? ");
	while (add7 != g1 + g2)
	{
	    System.out.println ("<SYSTEM> Pass unconfirmed, door remains unlocked.");
	    add7 = IBIO.inputInt ("\n<SYSTEM> What is " + g1 + " + " + g2 + "? ");
	}
	System.out.println ("<SYSTEM> Pass confirmed, door 7 locked.");

	printThis ("\nYou finish locking the 7-layered door and catch up with the rest of your team...");
	printDelay2 ();
	printThis ("\nHowever, you are unaware of what's happening next....");


    }


    public void obstacle5 ()  //Obstacle 5 also known as boss fight
    {
	System.out.println ("\n\nYou made it to the last room, the Escapar-Pods! But something is wrong...");
	System.out.println ("Opening the door, you find a gruesome scene...");
	printDelay1 ();
	pic7 ();
	printThis ("\nThe man-eating alien somehow used a teleportation power to enter the room instantly, as you see your team's devoured bodies you realize it must be stopped.");
	System.out.println ("\n\nAs the commander of the team, your space suit contains a hidden switch incase of emergencies regarding alien attacks.");
	System.out.println ("*clicks* Your suit transforms you into an alien-stopping fighter robot!");
	pic8 ();
	printDelay1 ();
	bossinstructions ();

	String solution = IBIO.inputString ("What is the answer? ");

	if (solution.equalsIgnoreCase ("stop imagining"))
	{
	    printThis ("Stop imagining...\nThose words run through your head and suddenly your vision whitens...");
	    printDelay1 ();
	    win ();
	}
	else
	    gameover ();

    }


    public void win ()  //Method for completion of game
    {
	bed ();
	printThis ("\nYou woke up in your bed realizing this whole adventure was another crazy dream...");
	System.out.println ("\nHowever, you wonder to yourself if such a thing were to happen, and if it would be just as creepy.");


	printDelay1 ();

	theend ();
	message1 ();
    }
}


