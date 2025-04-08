package cts.test2.factoryMethod.main;

import cts.test2.factoryMethod.classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu tipul de știre care doresti sa fie postata pe site(SPORT, POLICY, ECONOMY):");
        String newsType1=scanner.nextLine();
        System.out.println("Introdu titlul:");
        String titlul1=scanner.nextLine();
        System.out.println("Introdu textul:");
        String textul1=scanner.nextLine();

        SiteNewsFactory siteNewsFactory=new SiteNewsFactory();
        NewsArticle newsArticle1=siteNewsFactory.getTransmision(newsType1,titlul1,textul1);
        System.out.println("Site: "+newsArticle1.getTitle()+" Description:"+newsArticle1.getText()+" Link:"+newsArticle1.getLink());

        System.out.println("\nIntrodu alt tip de știre pentru social media (SPORT, POLICY, ECONOMY):");
        String newsType2=scanner.nextLine();
        System.out.println("Introdu titlul:");
        String titlul2=scanner.nextLine();
        System.out.println("Introdu textul:");
        String textul2=scanner.nextLine();

        SocialMediaNewsFactory socialMediaNewsFactory=new SocialMediaNewsFactory("www.site.ro");
        NewsArticle newsArticle2=socialMediaNewsFactory.getTransmision(newsType2,titlul2,textul2);
        System.out.println("Social media: "+newsArticle2.getTitle()+" Description:"+newsArticle2.getText()+" Link:"+newsArticle2.getLink());
    }
}
