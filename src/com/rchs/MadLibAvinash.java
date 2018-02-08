package com.rchs;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MadLibAvinash {

    public ArrayList<String> verbs;
    public ArrayList<String> nouns;
    public ArrayList<String> adjs;

    //create my constructor to make them.
    public MadLibAvinash()
    {
        // this defines what the reference is
        verbs = new ArrayList<String>();
        nouns = new ArrayList<String>();
        adjs = new ArrayList<String>();
    }

    // now make a method that is going to get
    // information from the .dat files

    public void nounsList()
    {
        // this gets info from scanners and adds to
        //list
        // getting exception error / need a catch method
        try{
            Scanner file = new Scanner(new File("nouns.dat"));
            while (file.hasNext())
            {
                nouns.add(file.next());
            }
        }
        catch(Exception e)
        {
            System.out.println("DIDNT WORK OR RAN OUT OF NOUNS");
        }
    }

    // now need to create the same method for adjs and verbs

    // im feeling lazy so im copying and pasting

    public void verbsList()
    {
        // change everything that says nouns to verbs
        try{
            Scanner file = new Scanner(new File("verbs.dat"));
            while (file.hasNext())
            {
                verbs.add(file.next());
            }
        }
        catch(Exception e)
        {
            System.out.println("DIDNT WORK OR RAN OUT OF VERBS");
        }
    }

    // and again for the adjs
    public void adjsList()
    {
        // change nouns to adjs
        try{
            Scanner file = new Scanner(new File("adjectives.dat"));
            while (file.hasNext())
            {
                adjs.add(file.next());
            }
        }
        catch(Exception e)
        {
            System.out.println("DIDNT WORK OR RAN OUT OF ADJECTIVESS");
        }
    }


    //next step is to use the .dat files for the
    //mad lib
    //create a method for it

    public void madLibrun(String fileName)
    {
        // this parameter allows me to choose which
        //file to run
        verbsList();
        nounsList();
        adjsList();

        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNext())
            {
                String info = file.next();
                // now create if statments to use file
                //if you open madlib.dat you see random
                //symbols those are where things go
                //show it later running low on time

                if (info.equals ( "#" ))
                {
                    System.out.print(randomNoun() + " ");
                }
                else if (info.equals("@"))
                {
                    System.out.print(randomVerb() + " ");
                }
                else if (info.equals("&"))
                {
                    System.out.print(randomAdjs() + " ");
                }
                else
                {
                    System.out.print(info + " ");

                }
            }
        }
        catch(Exception e)
        {
            System.out.println("SOMETHING IS VERY WRONG");
        }


    }

    //create a random noun generator
    public String randomNoun()
    {
        int spot = (int)(Math.random()*nouns.size());
        return nouns.get(spot);

    }
    //change noun to verb
    public String randomVerb()
    {
        int spot = (int)(Math.random()*verbs.size());
        return verbs.get(spot);

    }
    // noun go to adjs
    public String randomAdjs()
    {
        int spot = (int)(Math.random()*adjs.size());
        return adjs.get(spot);

    }
    // create main method
    public static void main(String[] args)throws IOException
    {
        MadLibAvinash test = new MadLibAvinash();
        test.madLibrun("story.dat");
    }

}
