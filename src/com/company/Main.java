package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String url = "https://www.gov.pl/web/rolnictwo/wyszukiwarka-srodkow-ochrony-roslin---zastosowanie";

        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println(title);
        System.out.println(doc.clone().getElementsByClass("result-row"));

    }

}
