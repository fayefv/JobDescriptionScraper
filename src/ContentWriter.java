/*
Writes job descriptions from the web to file.  Prevents loss of data from link rot, and forms the basis for job
description word analysis.

@author Faye Fong
 */

import java.io.*;


public class ContentWriter {


//    private String content_str = "";
    public final String output_file_folder = "C:\\Users\\Faye\\Documents\\IDEA Files\\Output";
    public final String test_str = """
            Enoch rounds the corner just as the executioner raises the noose above the woman's head. The crowd on the Common stop praying and sobbing for just as long as Jack Ketch stands there, elbows locked, for all the world like a carpenter heaving a ridge-beam into place. The rope clutches a disk of blue New England sky. The Puritans gaze at it and, to all appearances, think. Enoch the Red reins in his borrowed horse as it nears the edge of the crowd, and sees that the executioner's purpose is not to let them inspect his knotwork, but to give them all a narrow -- and, to a Puritan, tantalizing -- glimpse of the portal through which they all must pass one day.

            Boston's a dollop of hills in a spoon of marshes. The road up the spoon-handle is barred by a wall, with the usual gallows outside of it, and victims, or parts of them, strung up or nailed to the city gates. Enoch has just come that way, and reckoned he had seen the last of such things -- that thenceforth it would all be churches and taverns. But the dead men outside the gate were common robbers, killed for earthly crimes. What is happening now in the Common is of a more Sacramental nature.

            The noose lies on the woman's grey head like a crown. The executioner pushes it down. Her head forces it open like an infant's dilating the birth canal. When it finds the widest part it drops suddenly onto her shoulders. Her knees pimple the front of her apron and her skirts telescope into the platform as she makes to collapse. The executioner hugs her with one arm, like a dancing-master, to keep her upright, and adjusts the knot while an official reads the death warrant. This is as bland as a lease. The crowd scratches and shuffles. There are none of the diversions of a London hanging: no catcalls, jugglers, or pickpockets. Down at the other end of the Common, a squadron of lobsterbacks drills and marches round the base of a hummock with a stone powder-house planted in its top. An Irish sergeant bellows -- bored but indignant -- in a voice that carries forever on the wind, like the smell of smoke.

            He's not come to watch witch-hangings, but now that Enoch's blundered into one it would be bad form to leave. There is a drum-roll, and then a sudden awkward silence. He judges it very far from the worst hanging he's ever seen -- no kicking or writhing, no breaking of ropes or unraveling of knots -- all in all, an unusually competent piece of work.""";


    /*
       a test function to see set up where files are written
       TODO: integrate with Google Drive for cloud access and functionalities
        */
    public void writeMyContent(String output_file_name, String content_str) {

        try {
            var fw = new FileWriter(new File(output_file_folder, output_file_name));
            fw.write(content_str);

            fw.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }


}
