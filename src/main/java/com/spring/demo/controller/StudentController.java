package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class StudentController extends AbstractController {
//public class StudentController extends MultiActionController {
//public class StudentController extends MultiActionController {
@Controller
//@RequestMapping("/aaa")
public class StudentController {





//    protected ModelAndView handleRequestInternal() throws Exception {
//
//    }

//    @Override
    @RequestMapping("/HelloWorld")
//    @ResponseBody
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        String message="Hello From index.jsp";
          String message="Hello World";

        ModelAndView modelAndView=new ModelAndView("index","message",message);
        return modelAndView;
    }
//    @ResponseBody
//    public void handleRequestInternal1(HttpServletRequest request, HttpServletResponse response) throws Exception {
////        response.setContentType("text/html");
////        response.getWriter().println("<b>HELLO World...</b>");
////    }


    //Ques 6 begins here...
   /* @RequestMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String handler(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
        return firstName+" "+lastName;

    }*/
   //Ques 6 Ends here...


    //Ques 7 begins here...

    /*@RequestMapping("/hello/{firstName}/{lastName}")
@ResponseBody
public String handler(@PathVariable Map<String, String> requestMap){
    return requestMap.get("firstName") + " " + requestMap.get("lastName");

}*/

   //Ques 7 Ends here...



    //Ques 8 starts here...
    /*@RequestMapping(value = "/formData", method = RequestMethod.GET)
    @ResponseBody
    public String formData(@RequestParam("username") String username,
                          @RequestParam("password") String password){
        return "Username " + username  + " Password " + password;

    }*/
    //Ques 8 ends here...


    //Ques 9 starts here...
    /*@RequestMapping(value = "/formData/{firstName}/{lastName}", method = RequestMethod.GET)
    @ResponseBody
    public String formData(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName,studentCO studentCo){
        studentCo.setFirstName(firstName);
        studentCo.setLastName(lastName);
        return "FirstName " + studentCo.getFirtName() + " LastName " + studentCo.getLastName();

    }*/
    //Ques 9 ends here...

    //Ques 9-1 starts here...

    /*@RequestMapping(value = "/formData/{firstName}/{lastName}", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView submitForm(@ModelAttribute("studentCO") studentCO studentCO) {
        ModelAndView modelAndView = new ModelAndView("submittedData");
        return modelAndView;
    }*/
    //Ques 9-1 ends here...

    //Ques 10 starts here...
   /* @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","Spring MVC Demo...");
    }

    @RequestMapping(value = "/formData/{firstName}/{lastName}", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView submitForm(@ModelAttribute("studentCO") studentCO studentCO) {
        ModelAndView modelAndView = new ModelAndView("submittedData");
        return modelAndView;
    }*/
   //Ques 10 ends here...
}
