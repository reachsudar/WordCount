package com.dgit.wordcount;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class WordcountApplication {
	/*Returns the count of words that starts with 'm' or'M'*/
	public static void mCount(String[] a)
	{
     int count =0;
     for(String s:a)
	 {
	 	if(s.charAt(0)=='m'||s.charAt(0)=='M')
		{
			count++;
		}
	 }
		System.out.println("\nNumber of Words that Starts with 'm' or 'M': "+count);
	}
	/*Returns words with more than 5 characters*/
	public static void words(String[] a)
	{
		System.out.println("Words more than 5 Characters:");
     for(String s:a)
	 {
	 	if(s.length()>5)
		{
			System.out.println(s);
		}
	 }

	}

	public static void main(String[] args)throws FileNotFoundException
	{
		//SpringApplication.run(WordcountApplication.class, args);
        Scanner myReader=new Scanner(new File("/Users/sasisudar/Downloads/wordcount/src/main/java/com/dgit/wordcount/words.txt"));
        String line="";
        while (myReader.hasNextLine())
        {
		  line=myReader.nextLine();
		}
        String[] arr=line.split(" ");
        mCount(arr);
        words(arr);
	}

}
