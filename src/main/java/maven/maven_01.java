package maven;

public class maven_01 {
    public static void main(String[] args) {

       //So this is maven first tutorial basically,
       //Maven is basically used to manage all the jar files you require for different tools you want to code with
       //Also it provides has lifecycles inside which you can directly from side-panel

        //GAV - Group ID , Artifact ID and Version ID -
        //So basically GAV should be unique for you library throughout the world
        //So that's why group ID is mostly the reverse of your domain name - (which is already unique out there)

        //Maven always look into Effective POM and not the POM file we see
        //Because it has to look into changes of itself and the ones we make
        //In intellij you can right click and go into maven and then effective_pom to see how it looks likes

        //So archetype is basically a types of POM file which people have already built, example springboot developers
        //will have their own template of POM XML file and you can use it to build further
        //Spring-boot-jersey something is a famous archetype for setting a rest based springboot setup - there would be even more
        //You can set your catalog to maven central and that way more options will be open for you to select


        //A lot of knowledge nuggets were thrown at this point on me for sure
        //One is that maven first looks into your computer folder .m2 (shift + command + '.') and then inside that you can see
        //all the repositories basically, and maven if does not finds it there, go and download it from the net
        //When it comes to basically how companies decides which library should be allowed ??
        //They have basically a safety net in between, where they keep all the downloaded and safe libraries for people to use
        //If you want any library which is not there, then you would have to ask your security team to get it for you


        //Now I would like to setup Maven on my setup and see how it works and stuff - (shouldn't be too complicated)
    }
}
