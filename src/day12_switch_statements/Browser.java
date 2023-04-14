package day12_switch_statements;

/*
    Ask a user to enter Browser type (Single word)

    Ask a user to enter URL (link - Uniform Resource Locator)


        chrome
        edge
        safari
        opera
        firefox
        mozilla


        chrome
            Going into the url in chrome browser

 */


import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your browser: ");
        String browser = input.next();

        System.out.print("Enter a URL: ");
        String url = input.next();


        switch (browser){
            case "Chrome":
            case "chrome":
            case "CHROME":
                System.out.println("Going into the " + url + " in chrome browser");
                break;
            case "edge":
            case "EDGE":
            case "Edge":
                System.out.println("Going into the " + url + " in edge browser");
                break;
            case "saferi":
                System.out.println("Going into the " + url + " in " + browser +" browser");
                break;
            case "firefox":
                System.out.println("Going into the " + url + " in " + browser +" browser");
                break;
            default:
                System.out.println(browser + " is invalid browser type");

        }




    }


}
