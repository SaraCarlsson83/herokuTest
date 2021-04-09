package com.example.test.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Sara Carlsson
 * Date: 08/04/2021
 * Time:11:02
 * Project: test
 * Copywright: MIT
 */
@RestController
public class TestTest {

    @RequestMapping("/")
    public String index(){
        return "he hej hej!!!";
    }

    @RequestMapping("/hhh")
    public String index2(){
        return "hehehehehejjj";
    }

    @RequestMapping("/esp")
    public String esp(){
        return "Hola Mundo";
    }

    @RequestMapping("/number")
    public String number(){
        int x = (int) (Math.random() * 10);
        return String.valueOf(x);

    }

    List<String> anList= new ArrayList<>();
    @RequestMapping("/animal")
    public String animal(){
        anList.add("Hund");
        anList.add("Katt");
        anList.add("Får");
        anList.add("Ko");

        Random rand = new Random();
        int x = rand.nextInt(anList.size());
        return anList.get(x);
    }

    @RequestMapping("/lucky")
    public String lucky(@RequestParam String luckyYou){
        String temp = "";
        if(luckyYou.equals("animal")) temp = animal();
        else if(luckyYou.equals("number")) temp = number();
        else temp = "Fel!!";

        return temp;
    }

    @RequestMapping("/lucky2")
    public String lucky2(@RequestParam (required = false) String luckyYou,
                         @RequestParam (required = false)String firstName,
                         @RequestParam (required = false)String lastName){
        String temp = "";
        if(firstName!=null && lastName!=null && luckyYou!=null){
            if(luckyYou.equals("animal")) temp = firstName + " " + lastName +
                    ", ditt favoritdjur är " + animal();
            else if(luckyYou.equals("number")) temp = firstName + " " + lastName +
                    ", ditt favoritnummer är " + number();
            else temp = "Fel inskrivning av djur/siffra!!";
        }
        else if (firstName == null && lastName == null){
            temp="Du har inte fyllt i något namn";
        }
        else if(lastName==null){
            if(luckyYou.equals("animal")) temp = firstName + " " +
                    ", ditt favoritdjur är " + animal();
            else if(luckyYou.equals("number")) temp = firstName + " " +
                    ", ditt favoritnummer är " + number();
            else temp = "Fel inskrivning av djur/siffra!!";
        }
        else if(firstName==null){
            if(luckyYou.equals("animal")) temp = "Herr/Fru " + lastName +
                    ", ditt favoritdjur är " + animal();
            else if(luckyYou.equals("number")) temp = " Herr/Fru " + lastName +
                    ", ditt favoritnummer är " + number();
            else temp = "Fel inskrivning av djur/siffra!!";
        }
        else{
            temp = "Du måste skriva number eller animal";
        }
        return temp;
    }

    @RequestMapping("/lucky3")
    public String lucky3(@RequestParam (defaultValue = "number") String luckyYou,
                         @RequestParam (defaultValue = "Hjälp")String firstName,
                         @RequestParam (defaultValue = "Mig")String lastName){
        String temp = "";
        if(firstName!=null && lastName!=null && luckyYou!=null){
            if(luckyYou.equals("animal")) temp = firstName + " " + lastName +
                    ", ditt favoritdjur är " + animal();
            else if(luckyYou.equals("number")) temp = firstName + " " + lastName +
                    ", ditt favoritnummer är " + number();
            else temp = "Fel inskrivning av djur/siffra!!";
        }
        else if (firstName == null && lastName == null){
            temp="Du har inte fyllt i något namn";
        }
        else if(lastName==null){
            if(luckyYou.equals("animal")) temp = firstName + " " +
                    ", ditt favoritdjur är " + animal();
            else if(luckyYou.equals("number")) temp = firstName + " " +
                    ", ditt favoritnummer är " + number();
            else temp = "Fel inskrivning av djur/siffra!!";
        }
        else if(firstName==null){
            if(luckyYou.equals("animal")) temp = "Herr/Fru " + lastName +
                    ", ditt favoritdjur är " + animal();
            else if(luckyYou.equals("number")) temp = " Herr/Fru " + lastName +
                    ", ditt favoritnummer är " + number();
            else temp = "Fel inskrivning av djur/siffra!!";
        }
        else{
            temp = "Du måste skriva number eller animal";
        }
        return temp;
    }


}
