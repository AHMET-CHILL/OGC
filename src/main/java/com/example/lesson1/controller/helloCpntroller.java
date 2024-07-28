package com.example.lesson1.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class helloCpntroller {




    @GetMapping(path = "/message")
    public String getMyMessage(@RequestParam("m") String messsage){
        return "Your massage is "+ messsage;
    }
//    // localhost:8080/api/hello
//   // @GetMapping(path = "/hello")
//    @RequestMapping(path = "/hello",method = RequestMethod.GET)
//    public String sayHelllo(){
//
//        return "Hello World!";
//    }
//
//    @PostMapping(path = "/save")
//    public String save(){
//        return "Data saved!";
//    }
//
//    @DeleteMapping(path = "/delete")
//    public String delete(){
//        return "Data deleted!";
//    }
//
//    @GetMapping(path = "/message/{m}")
//    public String getMymessage(@PathVariable("m") String message){
//
//        return "Your message is :  "+message;
//    }
//
//    //15. satir ile 14. satir arasinda ki kodda hic bir fark yoktur okunurluk olarak getmapping daha uygundur.
//
//
//    // GET:Veri goruntulemek istedigimiz zaman kullaniyoruz.
//    //POST:Veri kaydetmek istedigimiz zaman kullaniyoruz.
//    //PUT:Veri guncellemek icin kullaniyoruz.
//    //PATCH:Verinin bir bolumunu guncellemek istedigimiz zaman kullaniyoruz.
//    //      orn:Parola guncellemek gibi.
//    //DELETE:Veri silmek istedigimiz zaman kullaniyoruz.



}


