package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @ResponseBody
    public String homepage(){
        return  "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<ol>" +
                "<li> <h2> Java <h2></li>" +
                "<li> <h2> JavaScript <h2></li>" +
                "<li> <h2> Python </ol></h2></li>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return  "<html>" +
                "<body>" +
                "<form action = '/responses' method='post'>" +
                "<label>Name: <input type= 'text' name='name'/></label>" +


                "<br>" +
                "<label> My favorite language" +
                "</label>" +
                "<select name=lan1>" +
                "<option value= 'java'> Java </option>" +
                "<option value= 'javascript'> JavaScript</option>" +
                "<option value= 'python'> Python</option>" +
                "</select>" +
                "<br>" +

                "<label> My second favorite language" +
                "</label>" +
                "<select name=lan2>" +
                "<option value= 'java'> Java </option>" +
                "<option value= 'javascript'> JavaScript</option>" +
                "<option value= 'python'> Python</option>" +
                "</select>" +
                "<br>" +

                "<label> My third favorite language" +
                "</label>" +
                "<select name=lan3>" +
                "<option value= 'java'> Java </option>" +
                "<option value= 'javascript'> JavaScript</option>" +
                "<option value= 'python'> Python</option>" +
                "</select>" +
                "<br>" +

                "<input type='submit' value='Submit'>" +
                "</form" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="responses")
    @ResponseBody
    public String responses(@RequestParam String name, @RequestParam String lan1, @RequestParam String lan2, @RequestParam String lan3){
        return "<html>" +
                "<h1>" + name +"<h1>" +
                "<ol>" +
                "<li>" + lan1 + "</li>" +
                "<li> " + lan2  + "</li>" +
                "<li>" +  lan3 + " </li>" +
                "</ol>";
    }
}
